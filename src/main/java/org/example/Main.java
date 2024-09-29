package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produit> produitList=new ArrayList<>();
        produitList.add(new Produit(TypeProduit.LAPTOP));
        produitList.add(new Produit(TypeProduit.LAPTOP));
        produitList.add(new Produit(TypeProduit.TELEPHONE,ModeleTelephone.HAUT_DE_GAMME));
        produitList.add(new Produit(TypeProduit.TELEPHONE,ModeleTelephone.MOYEN_DE_GAMME));
        produitList.add(new Produit(TypeProduit.TELEPHONE,ModeleTelephone.MOYEN_DE_GAMME));
        // Création d'un client particulier
        ClientParticulier clientParticulier = new ClientParticulier(1, "OUESLATI", "Sondes",produitList);

        System.out.println("Total pour le particulier: " + clientParticulier.calculerSommePrixProduits(clientParticulier.getProduitList()) + " euros");
        // Création d'un client professionnel
        ClientProfessionnel clientProfessionnel = new ClientProfessionnel(2, "LovoTech", "FR123456789", "123456789", 12_000_000D,produitList);


        System.out.println("Total pour le professionnel: " + clientProfessionnel.calculerSommePrixProduits(clientProfessionnel.getProduits()) + " euros");
    }

}