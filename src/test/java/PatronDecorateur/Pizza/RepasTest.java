package PatronDecorateur.Pizza;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import PatronDecorateur.Coffee.SimpleCoffee;
import PatronDecorateur.Coffee.WithMilk;
import PatronDecorateur.Patate.Fromage;
import PatronDecorateur.Patate.Patate;
import PatronDecorateur.Patate.Sauce;
import PatronDecorateur.Repas.IIngredient;
import PatronDecorateur.Repas.Repas;

public class RepasTest
 {

    @Test
    public void repasTest(){
      
        IIngredient pizza = (IIngredient) new ThreeCheesePizza(10.5, "Pizza");
        assertEquals(10.5, pizza.getCost(),0.001);

        pizza = (IIngredient) new Mozzarella(pizza, 0.5, "with Mozzarella");
        assertEquals(11,pizza.getCost(),0.001);;

        IIngredient coffe = (IIngredient) new SimpleCoffee(1.0, "Coffee");
        assertEquals(1.0,coffe.getCost(),0.001);
        assertEquals("Coffee",coffe.getDescription());

        coffe = (IIngredient) new WithMilk(coffe,0.5,"Milk");
        assertEquals(1.5,coffe.getCost(),0.001);
        assertEquals("Coffee, Milk",coffe.getDescription());

       IIngredient patate = new Patate(3.55, "Patates du lac St-Jean");
       assertEquals(3.55, patate.getCost(),0.001);
       assertEquals("Patates du lac St-Jean", patate.getDescription());

       patate = new Sauce(patate,0.45,"avec sauce brune");
       assertEquals(4.0, patate.getCost(),0.001);
       assertEquals("Patates du lac St-Jean, avec sauce brune", patate.getDescription());

       patate = new Fromage(patate, 1.25, "du fromage");
       assertEquals(5.25, patate.getCost(), 0.001);
       assertEquals("Patates du lac St-Jean, avec sauce brune et du fromage", patate.getDescription());

        Repas prixRepasTot = new Repas(pizza, coffe, patate);
        assertEquals(17.75, prixRepasTot.calculDesRepas(), 0.001);

// + 1.25
//Total 17.75


       // A faire. Faire fonctionner ce test. Ajouter du fromage à la patate au cout de 1.25$ pour faire une poutine et
       // mettre les éléments dans une liste pour calculer le total en utilisant un itérateur.

       //Faire un classe Repas avec la méthode Double calculerTotal(Iterateur<T>)
        //et valider le total avec  assertEquals(xx,repas.getTotal());
        // assertEquals(xx,repas.getTotal());

        // Faire le diagramme de séquence de ce test et ajouter le dans Patate/README.me

        // Faire le diagramme de séquence de ce test et ajouter le dans Patate/README.me
        // Ne pas modéliser les assertEquals.
    }
}