package tpcollection1;

import java.util.*;

public class CompareNom implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        return e1.getNom().compareToIgnoreCase(e2.getNom());
    }
}

