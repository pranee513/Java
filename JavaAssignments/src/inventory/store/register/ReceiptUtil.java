package inventory.store.register;
import java.text.DecimalFormat;

public class ReceiptUtil {
public static String formattedValue(double totalVal){
	String totalPrice=null;
	String formatStr="#,###,##0.00";
	DecimalFormat df=new DecimalFormat(formatStr);
	String formattedPrice=null;
	formattedPrice=df.format(totalVal);
	totalPrice="$"+formattedPrice;
	return totalPrice;
	
}
}
