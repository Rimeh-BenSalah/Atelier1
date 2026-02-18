package tpcollection1;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("A12", "Ali");
        e1.addNote(new Note("Math", 15));
        e1.addNote(new Note("Java", 18));

        Etudiant e2 = new Etudiant("A02", "Sami");
        e2.addNote(new Note("Math", 10));
        e2.addNote(new Note("Java", 12));

        Etudiant e3 = new Etudiant("A30", "Nour");
        e3.addNote(new Note("Math", 19));
        e3.addNote(new Note("Java", 17));

        ArrayList<Etudiant> liste = new ArrayList<>();
        liste.add(e1);
        liste.add(e2);
        liste.add(e3);

        Stats stats = new Stats();

        System.out.println("Moyenne groupe : " + stats.moyenne(liste));
        System.out.println("Meilleur étudiant : " + stats.meilleur(liste));
        System.out.println("Moins bon étudiant : " + stats.moinsBon(liste));

        Collections.sort(liste);
        System.out.println("\nTri par matricule :");
        liste.forEach(System.out::println);

        Collections.sort(liste, new CompareMoyenne());
        System.out.println("\nTri par moyenne :");
        liste.forEach(System.out::println);

        Collections.sort(liste, new CompareNom());
        System.out.println("\nTri par nom :");
        liste.forEach(System.out::println);
    }
}
