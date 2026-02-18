package tpcollection1;

import java.util.*;

public class CompareMoyenne implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        return Float.compare(e1.getMoyenne(), e2.getMoyenne());
    }
}

