package inventory.store.register;
import java.util.List;

public interface Receipt {
public String getFormattedTotal();
public List<String> getOrderedItems();
}
