import java.time.LocalDate;

public class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private LocalDate dateExpiration;

    // Constructeur par défaut
    public Produit() {
        this.identifiant = 0;
        this.libelle = "Inconnu";
        this.marque = "Inconnue";
        this.prix = 0.0;
        this.dateExpiration = null;
    }

    // Constructeur avec paramètres
    public Produit(int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public Produit(int identifiant, String libelle, String marque) {
        this(identifiant, libelle, marque, 0.0);
    }

    // Getters et Setters
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    // Méthode pour afficher les détails du produit
    public void display() {
        System.out.println("Identifiant: " + identifiant +
                ", Libellé: " + libelle +
                ", Marque: " + marque +
                ", Prix: " + prix +
                ", Date d'expiration: " + (dateExpiration != null ? dateExpiration : "Non définie"));
    }

    // Représentation en chaîne de caractères
    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libellé='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + (dateExpiration != null ? dateExpiration : "Non définie") +
                '}';
    }
}
