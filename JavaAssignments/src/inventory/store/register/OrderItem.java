package inventory.store.register;

public class OrderItem {
private String itemName=null;
private Double itemPrice=null;
public OrderItem(){
	
}
public String getItemName(){
	return itemName;
	
}
public void setItemName(String itemName){
	this.itemName=itemName;
}
public double getItemPrice(){
	return itemPrice;
	
}
public void setItemPrice(Double itemPrice){
	this.itemPrice=itemPrice;
}
}
