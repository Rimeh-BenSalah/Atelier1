package tpcollection2;

import java.util.*;

public class MainAnnuaire {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Annuaire annuaire = new Annuaire();

        while (true) {
            System.out.print("> ");
            String cmd = sc.nextLine();

            if (cmd.equals(".")) break;

            if (cmd.startsWith("?")) {
                String nom = cmd.substring(1);
                Fiche f = annuaire.chercher(nom);
                if (f != null) System.out.println(f);
                else System.out.println("Introuvable");

            } else if (cmd.startsWith("+")) {
                String nom = cmd.substring(1);
                System.out.print("Numéro : ");
                String num = sc.nextLine();
                System.out.print("Adresse : ");
                String adr = sc.nextLine();

                annuaire.ajouter(new Fiche(nom, num, adr));

            } else if (cmd.equals("!")) {
                annuaire.afficherTout();
            }
        }
    }
}
