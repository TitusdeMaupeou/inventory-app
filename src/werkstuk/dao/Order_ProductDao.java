package werkstuk.dao;
import java.sql.*;
import java.util.ArrayList;

import werkstuk.model.Order_Product;
/**
 *
 */
public class Order_ProductDao {
    public static ArrayList<Order_Product> getOrder_Products() {
		ArrayList<Order_Product> result = new ArrayList<Order_Product>();
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Order_Product");
			if (myResultset != null) {
				while (myResultset.next()) {
					Order_Product currentOrder_Product = convertCurrentRowToObject(myResultset);
					result.add(currentOrder_Product);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return result;
	}

	public static Order_Product getOrder_ProductById(int id) {
		Order_Product result = null;
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Order_Product where Ordernr = ?", new Object[] { id });
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

	public static int addOrder_Product(Order_Product newOrder_Product) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("INSERT INTO Order_Product (Ordernr, Productnr) VALUES (?,?)", new Object[] { newOrder_Product.getOrdernr(), newOrder_Product.getProductnr() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	public static int updateOrder_Product(Order_Product newOrder_Product) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("UPDATE Order_Product SET Ordernr = ?, Productnr = ? WHERE Ordernr = ?", new Object[] { newOrder_Product.getOrdernr(), newOrder_Product.getProductnr() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	public static int deleteOrder_Product(int Ordernr) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("DELETE FROM Order_Product WHERE Ordernr = ? AND Productnr = ?", new Object[] { Ordernr});
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	private static Order_Product convertCurrentRowToObject(ResultSet myResultset) throws SQLException {
		return new Order_Product(myResultset.getInt("Ordernr"), myResultset.getInt("Productnr"));
	}
}
