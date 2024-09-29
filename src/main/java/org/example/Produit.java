package org.example;

public class Produit {
    private TypeProduit nom;
    private  ModeleTelephone modeleTelephone;

    public Produit(TypeProduit nom) {
        this.nom=nom;
    }

    public TypeProduit getNom() {
        return nom;
    }

    public void setNom(TypeProduit nom) {
        this.nom = nom;
    }

    public ModeleTelephone getModeleTelephone() {
        return modeleTelephone;
    }

    public void setModeleTelephone(ModeleTelephone modeleTelephone) {
        this.modeleTelephone = modeleTelephone;
    }

    public Produit(TypeProduit nom, ModeleTelephone modeleTelephone) {
        this.nom = nom;
        this.modeleTelephone = modeleTelephone;
    }
}
