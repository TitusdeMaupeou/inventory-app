package werkstuk.dao;
import java.sql.*;
import java.util.ArrayList;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
/**
 *
 */
public class Database {
    private static String mySqlServerLocation = "jdbc:mysql://dt5.ehb.be:3306/datamgmt028";
    private static String username = "datamgmt028";
    private static String password = "58497326";

	private static Connection getMyConnection() throws SQLException {
		Connection myConnection = null;
		try {
			myConnection = DriverManager.getConnection(mySqlServerLocation, username, password);
		} catch (SQLException ex) {
			System.out.println("Connectie kon niet worden opgebouwd. Zijn logingegevens correct?");
			throw ex;
		}
		return myConnection;
	}

	private static PreparedStatement maakPreparedStatement(Connection myConnection, String sqlQuery, Object[] parameterValues) throws SQLException {
		PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlQuery);
		int parameterIndex = 1;
		for (Object parameterValue : parameterValues) {
			myPreparedStatement.setObject(parameterIndex, parameterValue);
			parameterIndex++;
		}
		return myPreparedStatement;
	}

	public static ResultSet executeSqlAndGetResult(String sqlQuery) throws SQLException {
		return executeSqlAndGetResult(sqlQuery, new Object[0]);
	}

	public static ResultSet executeSqlAndGetResult(String sqlQuery, Object[] parameterValues) throws SQLException {
		Connection myConnection = null;
		CachedRowSet myCachedRowSet = null;
		try {
			myConnection = getMyConnection();
			PreparedStatement myPreparedStatement = maakPreparedStatement(myConnection, sqlQuery, parameterValues);

			ResultSet myResultset = myPreparedStatement.executeQuery();
			myCachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
			myCachedRowSet.populate(myResultset);

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw ex;
		} finally {
			if (myConnection != null) {
				myConnection.close();
			}

		}
		return myCachedRowSet;
	}

	public static int executeSqlAndGetEditedRows(String sqlQuery, Object[] parameterValues) throws SQLException {
		Connection myConnection = null;
		int amountOfRowsEdited = 0;
		try {
			myConnection = getMyConnection();
			PreparedStatement myPreparedStatement = maakPreparedStatement(myConnection, sqlQuery, parameterValues);

			amountOfRowsEdited = myPreparedStatement.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw ex;
		} finally {
			if (myConnection != null) {
				myConnection.close();
			}

		}

		return amountOfRowsEdited;
	}
}