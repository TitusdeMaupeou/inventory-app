package werkstuk.dao;
import java.sql.*;
import java.util.ArrayList;

import werkstuk.model.Client;
/**
 *
 */
public class ClientDao {
    public static ArrayList<Client> getClients() {
		ArrayList<Client> result = new ArrayList<Client>();
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Client");
			if (myResultset != null) {
				while (myResultset.next()) {
					Client currentClient = convertCurrentRowToObject(myResultset);
					result.add(currentClient);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return result;
	}

	public static Client getClientById(int id) {
		Client result = null;
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Client where Clientnr = ?", new Object[] { id });
			if (myResultset != null) {
				myResultset.first();
				result = convertCurrentRowToObject(myResultset);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return result;
	}

	public static int addClient(Client newClient) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("INSERT INTO Client (Firstname, Lastname, Adres) VALUES (?,?,?)", new Object[] { newClient.getFirstname(), newClient.getLastname(), newClient.getAddress() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	public static int updateClient(Client newClient) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("UPDATE Client SET Firstname = ?, Lastname = ?, Adres = ? WHERE Clientnr = ?", new Object[] { newClient.getFirstname(), newClient.getLastname(), newClient.getAddress(), newClient.getClientnr() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	public static int deletedClient(int Clientnr) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("DELETE FROM Client WHERE Clientnr = ?", new Object[] { Clientnr });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	private static Client convertCurrentRowToObject(ResultSet myResultset) throws SQLException {
		return new Client(myResultset.getInt("clientnr"), myResultset.getString("firstname"), myResultset.getString("lastname"), myResultset.getString("address"));
	}
}