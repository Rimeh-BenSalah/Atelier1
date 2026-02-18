package tpcollection1;

public class Note {
    private String cours;
    private float valeur;
    public Note(String cours, float valeur) {
        this.cours = cours;
        this.valeur = valeur;
    }
    public String getCours() {
        return cours;
    }
    public float getVal() {
        return valeur;
    }
    public void setCours(String cours) {
		this.cours = cours;
	}
	public void setVal(float valeur) {
		this.valeur = valeur;
	}
	@Override
    public String toString() {
        return cours + " : " + valeur;
    }
}
