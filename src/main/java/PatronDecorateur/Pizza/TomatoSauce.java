package PatronDecorateur.Pizza;

import PatronDecorateur.Repas.IIngredient;
import PatronDecorateur.Repas.Ingredient;

public class TomatoSauce extends Ingredient {

	public TomatoSauce(IIngredient newPizza, Double cost, String description) {
		super(newPizza, cost, description);
		System.out.print(", adding Sauce");
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza, Mozzarella and then TomatoSauce
	public String getDescription(){
		return getiIngredient().getDescription() + ", " + super.getDescription();
	}
	
	public double getCost(){
		System.out.println("Cost of Sauce: " + super.getCost());
		return getiIngredient().getCost() + super.getCost();
	}
	
}