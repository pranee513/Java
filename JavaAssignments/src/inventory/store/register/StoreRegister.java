package inventory.store.register;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StoreRegister {
	List<OrderItem> unsortedPriceList = new ArrayList<OrderItem>();

	public void loadInventory(File inventoryFile) {
		BufferedReader fileReader = null;
		final String DELIMITER = ",";
		try {
			String line = "";
			fileReader = new BufferedReader(new FileReader(inventoryFile));
			while ((line = fileReader.readLine()) != null) {
				String[] tokens = line.split(DELIMITER);
				OrderItem orderItem = new OrderItem();
				for (int i = 0; i <= tokens.length; i++) {
					orderItem.setItemName(tokens[0]);
					orderItem.setItemPrice(Double.valueOf(tokens[1]));
				}
				unsortedPriceList.add(orderItem);
			}

		} catch (Exception e) {
			e.printStackTrace();
			unsortedPriceList = null;
			System.out.println("There is some problem reading the file");
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
				unsortedPriceList = null;
				System.out.println("There is some problem reading the file");
			}
		}
	}

	public Receipt checkoutOrder(List<String> items) {
		ReceiptImpl receiptImpl = new ReceiptImpl();

		if (unsortedPriceList != null) {

			List<OrderItem> sortedPriceList = new ArrayList<OrderItem>();
			List<String> finalOrderList = new ArrayList<String>();
			double totalPrice = 0.0;
			loadInventory(new File("C:\\Users\\dev\\Desktop\\inventory.txt"));

			for (Iterator iterator = items.iterator(); iterator.hasNext();) {
				String orderName = (String) iterator.next();

				for (Iterator unOrdIterator = unsortedPriceList.iterator(); unOrdIterator.hasNext();) {
					OrderItem orderItem = (OrderItem) unOrdIterator.next();
					if (orderName.equalsIgnoreCase(orderItem.getItemName())) {
						sortedPriceList.add(orderItem);
					}
				}
			}
			Collections.sort(sortedPriceList, new PriceComparator());
			for (Iterator iterator = sortedPriceList.iterator(); iterator.hasNext();) {
				OrderItem orderItem = (OrderItem) iterator.next();
				totalPrice = totalPrice + (Double) orderItem.getItemPrice();
				finalOrderList.add(orderItem.getItemName());
			}
			String formattedTotalPrice = ReceiptUtil.formattedValue(totalPrice);

			if (finalOrderList.isEmpty()) {
				System.out.println("No matching records found in the inventory");
				return null;
			}
			receiptImpl.setFormattedTotal(formattedTotalPrice);
			receiptImpl.setOrderedItems(finalOrderList);
		} else {
			System.out.println("There is some problem reading the file");
			return null;
		}

		return receiptImpl;
	}

	public static void main(String[] args) {
		StoreRegister register = new StoreRegister();
		List<String> list = new ArrayList<String>();
		list.add("PC1033");
		list.add("Genericmotherboard");
		list.add("Mouse");
		list.add("LCD");
		System.out.println("Input : " + list);
		Receipt receipt = register.checkoutOrder(list);
		System.out.println("Receipt.getFormattedTotal()= " + receipt.getFormattedTotal());
		System.out.println("Receipt.getOrderedItems() = " + receipt.getOrderedItems());

	}
}