package PatronDecorateur.Patate;

import PatronDecorateur.Repas.IIngredient;
import PatronDecorateur.Repas.Ingredient;

public class Fromage extends Ingredient{

    public Fromage(IIngredient ingredient, double cost, String description){
        super(ingredient,cost,description);
        System.out.println(" and cheese");
    }

    @Override
    public String getDescription(){

        return getiIngredient().getDescription() + " et " + super.getDescription();
    }

    @Override
    public double getCost(){
        return getiIngredient().getCost() + super.getCost();
    }
    
}