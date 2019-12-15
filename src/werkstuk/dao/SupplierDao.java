package werkstuk.dao;
import java.sql.*;
import java.util.ArrayList;

import werkstuk.model.Supplier;
/**
 *
 */
public class SupplierDao {
    public static ArrayList<Supplier> getSuppliers() {
		ArrayList<Supplier> result = new ArrayList<Supplier>();
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Supplier");
			if (myResultset != null) {
				while (myResultset.next()) {
					Supplier huidigeSupplier = convertCurrentRowToObject(myResultset);
					result.add(huidigeSupplier);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return result;
	}

	public static Supplier getSupplierById(int id) {
		Supplier result = null;
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Supplier where Suppliernr = ?", new Object[] { id });
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

	public static int addSupplier(Supplier newSupplier) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("INSERT INTO Supplier (Firstname, Lastname, Adres) VALUES (?,?,?)", new Object[] { newSupplier.getFirstname(), newSupplier.getLastname(), newSupplier.getAddress() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	public static int updateSupplier(Supplier newSupplier) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("UPDATE Supplier SET Firstname = ?, Lastname = ?, Adres = ? , WHERE Suppliernr = ?", new Object[] { newSupplier.getFirstname(), newSupplier.getLastname(), newSupplier.getAddress(), newSupplier.getSuppliernr() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	public static int deleteSupplier(int Suppliernr) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("DELETE FROM Supplier WHERE Suppliernr = ?", new Object[] { Suppliernr });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	private static Supplier convertCurrentRowToObject(ResultSet myResultset) throws SQLException {
		return new Supplier(myResultset.getInt("Suppliernr"), myResultset.getString("firstname"), myResultset.getString("lastname"), myResultset.getString("address"));
	}
}
