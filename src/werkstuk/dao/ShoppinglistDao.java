package werkstuk.dao;
import java.sql.*;
import java.util.ArrayList;
import werkstuk.model.Orderlist;
/**
 *
 */
public class OrderlistDao {
    public static ArrayList<Orderlist> getOrderlists() {
		ArrayList<Orderlist> result = new ArrayList<Orderlist>();
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Orderlist");
			if (myResultset != null) {
				while (myResultset.next()) {
					Orderlist currentOrderlist = convertCurrentRowToObject(myResultset);
					result.add(currentOrderlist);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return result;
	}

	public static Orderlist getOrderlistById(int id) {
		Orderlist result = null;
		try {
			ResultSet myResultset = Database.executeSqlAndGetResult("SELECT * from Shoppinglist where OrderlistId = ?", new Object[] { id });
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

	public static int voegOrderlistToe(Orderlist newOrderlist) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("INSERT INTO Orderlist (ProductId, OwnerId, Amount) VALUES (?,?,?)", new Object[] { newOrderlist.getProductId(), newOrderlist.getOwnerId(), newOrderlist.getAmount() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	public static int updateOrderlist(Orderlist newOrderlist) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("UPDATE Orderlist SET ProductId = ?, OwnerId = ?, Amount = ?, WHERE OrderlistId = ?", new Object[] { newOrderlist.getProductId(), newOrderlist.getOwnerId(), newOrderlist.getOrderlistId() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	public static int verwijderOrderlist(int OrderlistId) {
		int amountOfRowsEdited = 0;
		try {
			amountOfRowsEdited = Database.executeSqlAndGetEditedRows("DELETE FROM Orderlist WHERE OrderlistId = ?", new Object[] { OrderlistId });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return amountOfRowsEdited;
	}

	private static Orderlist convertCurrentRowToObject(ResultSet myResultset) throws SQLException {
		return new Orderlist(myResultset.getInt("OrderlistId"), myResultset.getInt("ProductId"), myResultset.getInt("Suppliernr"), myResultset.getInt("Amount"));
	}
}