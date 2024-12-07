import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Étape 1: Créer un produit vide
        Produit produitVide = new Produit();

        // Étape 2: Créer des produits avec des caractéristiques spécifiques
        Produit lait = new Produit(1021, "Lait", "Delice");
        Produit yaourt = new Produit(2510, "Yaourt", "Vitalait");
        Produit tomate = new Produit(3250, "Tomate", "Sicam", 1.200);

        // Étape 3: Afficher les détails de chaque produit créé
        lait.display();
        yaourt.display();
        tomate.display();

        // Étape 4: Attribuer le prix 0.700 au produit lait
        lait.setPrix(0.700);
        lait.display();

        // Étape 5: Compléter les informations manquantes
        yaourt.setPrix(0.500); // Exemple de prix pour le yaourt

        // Étape 6: Ajouter une date d'expiration et afficher les produits modifiés
        lait.setDateExpiration(LocalDate.of(2024, 12, 30));
        yaourt.setDateExpiration(LocalDate.of(2024, 12, 15));
        tomate.setDateExpiration(LocalDate.of(2025, 1, 20));

        // Afficher les produits modifiés
        lait.display();
        yaourt.display();
        tomate.display();

        // Étape 7: Afficher les produits déjà créés avec toString()
        System.out.println(lait);
        System.out.println(yaourt);
        System.out.println(tomate);
    }
}
