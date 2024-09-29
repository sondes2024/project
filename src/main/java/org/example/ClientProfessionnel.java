package org.example;

import java.util.List;

public class ClientProfessionnel extends Client implements ICalculateurPrixProduit{
    private String raisonSociale;
    private String numeroTVA;
    private String siren;
    private Double chiffreAffaireAnnuel;
    private List<Produit>produits;

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getNumeroTVA() {
        return numeroTVA;
    }

    public void setNumeroTVA(String numeroTVA) {
        this.numeroTVA = numeroTVA;
    }

    public String getSiren() {
        return siren;
    }

    public void setSiret(String siren) {
        this.siren = siren;
    }

    public Double getChiffreAffaireAnnuel() {
        return chiffreAffaireAnnuel;
    }

    public void setChiffreAffaireAnnuel(Double chiffreAffaireAnnuel) {
        this.chiffreAffaireAnnuel = chiffreAffaireAnnuel;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }


    public ClientProfessionnel(String raisonSociale, String numeroTVA, String siren, Double chiffreAffaireAnnuel) {
        this.raisonSociale = raisonSociale;
        this.numeroTVA = numeroTVA;
        this.siren = siren;
        this.chiffreAffaireAnnuel = chiffreAffaireAnnuel;
    }

    public ClientProfessionnel(long id, String raisonSociale, String numeroTVA, String siren, Double chiffreAffaireAnnuel, List<Produit> produits) {
        super(id);
        this.raisonSociale = raisonSociale;
        this.numeroTVA = numeroTVA;
        this.siren = siren;
        this.chiffreAffaireAnnuel = chiffreAffaireAnnuel;
        this.produits = produits;
    }

    @Override
    public long calculerSommePrixProduits(List<Produit>produits) {
        long montantGlobal= 0L;
        if(!produits.isEmpty()) {
            for (Produit produit : produits) {
                if(10_000_000<chiffreAffaireAnnuel) {
                    if (TypeProduit.LAPTOP.equals(produit.getNom())) {
                        montantGlobal += 900L;
                    } else if (TypeProduit.TELEPHONE.equals(produit.getNom())) {
                        if (ModeleTelephone.HAUT_DE_GAMME.equals(produit.getModeleTelephone()))
                            montantGlobal += 1000L;
                        else {
                            montantGlobal += 550L;
                        }

                    }
                }else {
                    if (TypeProduit.LAPTOP.equals(produit.getNom())) {
                        montantGlobal += 1000L;
                    } else if (TypeProduit.TELEPHONE.equals(produit.getNom())) {
                        if (ModeleTelephone.HAUT_DE_GAMME.equals(produit.getModeleTelephone()))
                            montantGlobal += 1150L;
                        else {
                            montantGlobal += 600L;
                        }

                    }
                }
            }
        }
        return montantGlobal;
    }
}
