package _01_overridding;

/*
 * We should see a regular pizza and a pepperoni pizza
 */
public class Runner {
	public static void main(String[] args) {
		Pizza p = new Pizza();
		p.make();
		p.show();
		p.receipt();
		
		PepperoniPizza pp = new PepperoniPizza();
		pp.make();
		pp.show();
		pp.receipt();
	}
}
