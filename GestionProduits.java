import java.util.ArrayList;

public class GestionProduits {
    private ArrayList<Produit> produits;

    // Constructeur
    public GestionProduits() {
        produits = new ArrayList<>();
    }

    // Méthode pour créer un produit vide
    public void createEmptyProduct() {
        Produit produit = new Produit();
        produits.add(produit);
    }

    // Méthode pour créer un produit avec des informations spécifiques
    public void createProduct(int id, String name, String brand, double price) {
        Produit produit = new Produit(id, name, brand, price);
        produits.add(produit);
    }

    // Méthode pour afficher un produit par ID
    public void displayProduct(int id) {
        for (Produit produit : produits) {
            if (produit.getIdentifiant() == id) {
                produit.display();
                return;
            }
        }
        System.out.println("Produit non trouvé.");
    }

    // Méthode pour mettre à jour le prix d'un produit
    public void updatePrice(int id, double newPrice) {
        if (newPrice < 0) {
            System.out.println("Le prix doit être positif.");
            return;
        }
        for (Produit produit : produits) {
            if (produit.getIdentifiant() == id) {
                produit.setPrix(newPrice);
                System.out.println("Prix mis à jour pour le produit ID: " + id);
                return;
            }
        }
        System.out.println("Produit non trouvé.");
    }

    // Méthode pour afficher tous les produits
    public void displayAllProducts() {
        if (produits.isEmpty()) {
            System.out.println("Aucun produit à afficher.");
        } else {
            for (Produit produit : produits) {
                produit.display();
            }
        }
    }
}
