package inventory.store.register;
import java.util.List;

public class ReceiptImpl implements Receipt {
private String formattedTotal=null;
private List<String>OrderedItems=null;
public ReceiptImpl(){
	
}
public String getFormattedTotal(){
	return formattedTotal;
	
	}
public void setFormattedTotal(String formattedTotal){
	this.formattedTotal=formattedTotal;
}
public void setOrderedItems(List<String>OrderedItems){
	this.OrderedItems=OrderedItems;
}
public List<String> getOrderedItems() {
	return OrderedItems;
}
}
