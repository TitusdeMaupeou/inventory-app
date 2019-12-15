package werkstuk.dao;
import java.sql.*;
import java.util.ArrayList;

import werkstuk.model.Product;
/**
 *
 */
public class ProductDao {
    public static ArrayList<Product> getProducts() {
		ArrayList<Product> result = new ArrayList<Product>();
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Product");
			if (myResultset != null) {
				while (myResultset.next()) {
					Product currentProduct = convertCurrentRowToObject(myResultset);
					result.add(currentProduct);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return result;
	}

	public static Product getProductById(int id) {
		Product result = null;
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Product where Productnr = ?", new Object[] { id });
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

	public static int addProduct(Product newProduct) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("INSERT INTO Product (Naam, Prijs, Stock) VALUES (?,?,?)", new Object[] { newProduct.getName(), newProduct.getPrice(), newProduct.getStock() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	public static int updateProduct(Product newProduct) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("UPDATE Product SET Naam = ?, Prijs = ?, Stock = ? WHERE Productnr = ?", new Object[] { newProduct.getName(), newProduct.getPrice(), newProduct.getStock(), newProduct.getProductnr() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	public static int deleteProduct(int Productnr) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("DELETE FROM Product WHERE Productnr = ?", new Object[] { Productnr });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	private static Product convertCurrentRowToObject(ResultSet myResultset) throws SQLException {
		return new Product(myResultset.getInt("Productnr"), myResultset.getString("Naam"), myResultset.getInt("Prijs"), myResultset.getInt("Stock"));
	}
}
