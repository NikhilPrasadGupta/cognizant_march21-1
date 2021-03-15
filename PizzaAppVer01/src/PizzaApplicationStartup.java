import javax.swing.JOptionPane;

public class PizzaApplicationStartup {
	private static String pizzaName;
	private static String size;
	private static String crust;
	private static int price;
	private static String toppings;

	public static void main(String[] args) {
		
		String pizName = JOptionPane.showInputDialog("Choose Pizza Name : [Veg Extravaganza, FarmHouse ]");
		String pizSize = JOptionPane.showInputDialog("Choose pizza Size [Medium, Regular]");
		String pizCrust = JOptionPane.showInputDialog("Choose pizza Crust [New Hannd Tosted]");
		
		orderPizza(pizName,pizSize, pizCrust);
		displayPizzaOrder();
	}

	private static void orderPizza(String pName,String pSize, String pCrust) {
		pizzaName =  pName;
		size = pSize;
		crust = pCrust;
		if(pizzaName.equals(PizzaConstants.VEG_EXTRAVAGANZA_PIZZA) 
				&& pSize.equals(PizzaConstants.SIZE_MEDIUM) 
				&& pCrust.equals(PizzaConstants.CRUST_NEW_HAND_TOSTED)) {
			price=PizzaConstants.PRICE_VEG_EXTRAVAGANZA;
			toppings=PizzaConstants.TOPPING_VEG_EXTRA_VAGANZA;
		}
		if(pizzaName.equals(PizzaConstants.FARMHOUSE_PIZZA) 
				&& pSize.equals(PizzaConstants.SIZE_REGULARE) 
				&& pCrust.equals(PizzaConstants.CRUST_NEW_HAND_TOSTED)) {
			price=PizzaConstants.PRICE_FARMHOUSE;
			toppings=PizzaConstants.TOPPING_FARMHOUSE;
		}
		
	}



	private static void displayPizzaOrder() {
		System.out.println("-----------Your Pizza Detail--------------");
		System.out.println("Pizza Name : " + pizzaName);
		System.out.println("Size : " + size);
		System.out.println("Crust : " + crust);
		System.out.println("Price : " + price);
		System.out.println("Toppings : " + toppings);

	}

}
