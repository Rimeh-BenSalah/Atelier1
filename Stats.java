package tpcollection1;
import java.util.*;

public class Stats {

    public float max(List<Etudiant> etudiants) {
        float max = etudiants.get(0).getMoyenne(); 

        for (Etudiant e : etudiants) {
            if (e.getMoyenne() > max) {
                max = e.getMoyenne();
            }
        }
        return max;
    }

    public float min(List<Etudiant> etudiants) {
        float min = etudiants.get(0).getMoyenne();

        for (Etudiant e : etudiants) {
            if (e.getMoyenne() < min) {
                min = e.getMoyenne();
            }
        }
        return min;
    }

    public float moyenne(List<Etudiant> etudiants) {
        float somme = 0;

        for (Etudiant e : etudiants) {
            somme += e.getMoyenne();
        }

        return somme / etudiants.size();
    }

    public Etudiant meilleur(List<Etudiant> etudiants) {
        Etudiant meilleur = etudiants.get(0);
        float max = meilleur.getMoyenne();

        for (Etudiant e : etudiants) {
            if (e.getMoyenne() > max) {
                max = e.getMoyenne();
                meilleur = e;
            }
        }
        return meilleur;
    }

    public Etudiant moinsBon(List<Etudiant> etudiants) {
        Etudiant moinsBon = etudiants.get(0);
        float min = moinsBon.getMoyenne();

        for (Etudiant e : etudiants) {
            if (e.getMoyenne() < min) {
                min = e.getMoyenne();
                moinsBon = e;
            }
        }
        return moinsBon;
    }
}
