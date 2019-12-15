/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werkstuk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import werkstuk.model.Product2;

/**
 *
 * @author Titus
 */
public class ProductDao2 {
     public static ArrayList<Product2> getProducts() {
		ArrayList<Product2> result = new ArrayList<Product2>();
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Product");
			if (myResultset != null) {
				while (myResultset.next()) {
					Product2 currentProduct = convertCurrentRowToObject(myResultset);
					result.add(currentProduct);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return result;
	}

	public static Product2 getProductById(int id) {
		Product2 result = null;
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Product where ProductId = ?", new Object[] { id });
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

	public static int addProduct(Product2 newProduct) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("INSERT INTO Product (Naam, Prijs, BrandId, ) VALUES (?,?,?)", new Object[] { newProduct.getName(), newProduct.getPrice(), newProduct.getStock() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	public static int updateProduct(Product2 newProduct) {
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

	private static Product2 convertCurrentRowToObject(ResultSet myResultset) throws SQLException {
		return new Product2 (myResultset.getInt("Productnr"), myResultset.getString("Naam"), myResultset.getInt("Prijs"), myResultset.getInt("Stock"));
	}
}
