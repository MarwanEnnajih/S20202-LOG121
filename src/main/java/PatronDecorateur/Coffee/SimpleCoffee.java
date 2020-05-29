package PatronDecorateur.Coffee;

import PatronDecorateur.Repas.IIngredient;

// Extension of a simple coffee without any extra ingredients
public class SimpleCoffee implements IIngredient {
    private Double cost = 0.0;
    private String description = "";

    public SimpleCoffee(Double cost, String description){
        System.out.println("Making coffee");
        this.cost = cost;
        this.description = description;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}