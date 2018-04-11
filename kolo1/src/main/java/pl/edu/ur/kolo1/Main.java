package pl.edu.ur.kolo1;

import pl.edu.ur.kolo1.zadanie1.Zadanie1;
import pl.edu.ur.kolo1.zadanie2.Zadanie2;
import pl.edu.ur.kolo1.zadanie3.Zadanie3;
import pl.edu.ur.kolo1.zadanie4.Osoba;

/**
 *
 * @author mchyla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Uruchomienie zadań/stworzenie i działanie na obiektach
        Zadanie1 z1 =new Zadanie1();
        z1.odliczanie();
        System.out.println(Zadanie2.Fibb(6));
        Zadanie3 z3 = new Zadanie3();
        z3.setTab();
        z3.getTab();
        System.out.println(z3.srednia());
        Osoba o1 = new Osoba("Mateusz", "Kowalski", 18, 200, 90);
        System.out.println(o1.toString());
    }
    
}
