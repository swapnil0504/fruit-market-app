import java.util.Scanner;

public class Application {
	/**
	 * 
	 * See menu of Fruit Market
	 * 
	 * 1. Add to cart
	 * 2. See Invoice
	 * 3. See Menu
	 * 4. Close
	 * 
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String name = null;
		String itemCode = null;
		FruitStore fruitStore = new FruitStore();
		ShoppingCart cart = new ShoppingCart();
		FruitItemRepository fruitItemRepository = new FruitItemRepository();
		while(true ) {
			fruitStore.showOptions();
			int command = sc.nextInt();
			if(command==-1) {
				System.exit(0);
			}
			if(command==2) { // Add to cart
				System.out.println("Please enter your name : ");
				name = sc.next();
				System.out.println("Please enter fruit item code : ");
				itemCode = sc.next();
				cart.setCustomerName(name);
				FruitItem fruitItem = fruitItemRepository.fetchFruitItemByCode(itemCode);
				cart.setFruitItem(fruitItem);
			}
			
			if(command == 3) { // Show Shopping Cart
				System.out.println("Thank you for Shopping");
				System.out.println(cart.getCustomerName());
				FruitItem fruitItem = cart.getFruitItem();
				System.out.println("Code : "+ fruitItem.getCode() + " | Desc : "+ fruitItem.getDescription() + " | Price : "+fruitItem.getPrice());
				
			}
			
			
		}
		
	}

}
