package tpcollection1;
import java.util.*;

public class Etudiant implements Statisticable, Comparable<Etudiant> {
    private String matricule;
    private String nom;
    private ArrayList<Note> notes;
    public Etudiant(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        this.notes = new ArrayList<>();
    }
    public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void addNote(Note n) {
        notes.add(n);
    }
    public float getMoyenne() {
        float sum = 0;
        for (Note n : notes) {
            sum += n.getVal();
        }
        return sum / notes.size();
    }
    public float getMeilleureNote() {
        float max = 0;
        for (Note n : notes) {
            if (n.getVal() > max) max = n.getVal();
        }
        return max;
    }
    public float getMoinsBonneNote() {
        float min = notes.get(0).getVal();
        for (Note n : notes) {
            if (n.getVal() < min) min = n.getVal();
        }
        return min;
    }
    @Override
    public float getValue() {
        return getMoyenne();
    }

    public String getMatricule() {
        return matricule;
    }
    public String getNom() {
        return nom;
    }
    @Override
    public int compareTo(Etudiant e) {
        return this.matricule.compareTo(e.matricule); 
    }

    @Override
    public String toString() {
        return matricule + " - " + nom + " | Moyenne : " + getMoyenne();
    }
}
