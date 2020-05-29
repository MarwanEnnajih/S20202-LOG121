package PatronDecorateur.Pizza;

import PatronDecorateur.Repas.IIngredient;
import PatronDecorateur.Repas.Ingredient;

public class Mozzarella extends Ingredient {

	public Mozzarella(IIngredient newPizza, Double cost, String description) {
		super(newPizza, cost, description);
		System.out.println(", adding Mozarella");
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza and adds " mozzarella" to it
	
	public String getDescription(){
		return getiIngredient().getDescription() + ", " + super.getDescription();
		
	}
	
	public double getCost(){		
		return getiIngredient().getCost() + super.getCost();
	}
	
}