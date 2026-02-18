package tpcollection2;

import java.util.*;

public class Annuaire {

    private Map<String, Fiche> table;

    // a) HashMap
    public Annuaire() {
        table = new HashMap<>();
    }

    // b) pour l'ordre alphabétique :
    // table = new TreeMap<>();

    public void ajouter(Fiche f) {
        table.put(f.getNom(), f);
    }

    public Fiche chercher(String nom) {
        return table.get(nom);
    }

    public void afficherTout() {
        for (Fiche f : table.values()) {
            System.out.println(f);
        }
    }
}

