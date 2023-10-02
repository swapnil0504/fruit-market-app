
public class FruitStore extends Store {
	
	private static String exitMsg = "Request to exit from shop, thank you visit again.";
	private FruitItem fruitItem;
	
	public FruitStore() {
		System.out.println("Welcome to : "+ storeName);
		fruitItem = new FruitItem();
		fruitItem.setCode("001");
		fruitItem.setPrice(120);
		fruitItem.setDescription("This is Nagpuri Oranges, price is for one kg");
	}

	public void showOptions() {
		System.out.println("Press 1 to load menu");
		System.out.println("Press 2 to add into cart");
		System.out.println("Press 3 to see invoice");
		System.out.println("Press 4 to exit");
	}

	public void processCommand(int command) {
		if(command==1) {
			System.out.println("Code : "+ fruitItem.getCode() + " | Desc : "+ fruitItem.getDescription() + " | Price : "+fruitItem.getPrice());
		}if(command==2) {
			System.out.println("Enter name : ");
			
			
		} else {
			System.out.println(exitMsg);
			System.exit(0);
		}
		
	}
	
	
	
}
