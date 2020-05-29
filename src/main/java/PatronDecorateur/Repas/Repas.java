package PatronDecorateur.Repas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import PatronIterateur.Collection.Iterateur;

public class Repas {

    private List<IIngredient> listeRepas;
    // private Iterator<IIngredient> iterateur;
    private Iterateur iterateur;

    public Repas(IIngredient pizza, IIngredient coffe, IIngredient patate){

        listeRepas = new ArrayList<>();
        iterateur = new Iterateur(){
        
            @Override
            public Object next() {
                // TODO Auto-generated method stub
                return null;
            }
        
            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return false;
            }
        };

        listeRepas.add(pizza);
        listeRepas.add(coffe);
        listeRepas.add(patate);

        calculDesRepas();
    }

    public double calculDesRepas(){

        double total = 0.00;
        iterateur = listeRepas.iterator();

        while(iterateur.hasNext()){
            total += iterateur.next().getCost();
        }

        return total;
    }
}