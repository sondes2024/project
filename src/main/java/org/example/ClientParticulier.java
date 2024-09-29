package org.example;

import java.util.List;

public class ClientParticulier  extends Client implements ICalculateurPrixProduit{
    private String nom;
    private String prenom;
    private List<Produit> produitList;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public ClientParticulier() {

    }

    public ClientParticulier(long id, String nom, String prenom, List<Produit>produits) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
        this.produitList=produits;
    }

    @Override
    public long calculerSommePrixProduits(List<Produit>produits) {
        long montantGlobal= 0L;
        if(!produits.isEmpty()) {
            for (Produit produit : produits) {
                if (TypeProduit.LAPTOP.equals(produit.getNom())){
                   montantGlobal+= 1200L;
                } else if (TypeProduit.TELEPHONE.equals(produit.getNom())) {
                    if(ModeleTelephone.HAUT_DE_GAMME.equals(produit.getModeleTelephone()))
                   montantGlobal+= 1500L;
                    else {
                        montantGlobal+=800L;
                    }

                }
            }
        }
        return montantGlobal;
    }

}
