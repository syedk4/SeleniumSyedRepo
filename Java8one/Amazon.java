package Java8one;


//@FunctionInterface // can have only one interface method == 1
public interface Amazon {

	public void searchItem(String type);
		
	public void bookOrder(String type, int qty);
	
	public void cancelOrder(String orederNumber);
}
