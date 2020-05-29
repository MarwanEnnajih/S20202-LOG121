package PatronDecorateur.Repas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repas {

    private List<IIngredient> listeRepas;
    // private Iterator<IIngredient> iterateur;
    private Iterator<IIngredient> iterateur;

    public Repas(IIngredient pizza, IIngredient coffe, IIngredient patate){

        listeRepas = new ArrayList<>();

        listeRepas.add(pizza);
        listeRepas.add(coffe);
        listeRepas.add(patate);
    }

    public double calculDesRepas(){

        double total = 0.00;
        iterateur = listeRepas.iterator();

        while(iterateur.hasNext()){
            total += iterateur.next().getCost();
        }

        System.out.println("PRIX TOTAL: " + total);

        return total;
    }
}