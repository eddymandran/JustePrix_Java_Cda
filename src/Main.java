import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le juste prix");
        int categRandom = new Random().nextInt(1, 3);
        switch (categRandom) {
            case 1 -> {
                System.out.println("Categorie Vetement");
                System.out.println("Prix compris entre 5 et 200 €");
                int priceRandomVetement = new Random().nextInt(5, 200);
                System.out.println("Aide : " + priceRandomVetement);
                Scanner scan = new Scanner(System.in);
                int inputPrice = 0;
                int compteur = 0;
                do {
                    System.out.println("Entrez le prix : ");
                    inputPrice = scan.nextInt();
                    if (inputPrice == priceRandomVetement) {
                        System.out.println("Felicitation, vous avez deviné");
                    }
                    if (inputPrice > priceRandomVetement) {
                        System.out.println("C'est moins");
                    }
                    if (inputPrice < priceRandomVetement) {
                        System.out.println("C'est plus");
                    }
                    compteur++;
                }
                while (priceRandomVetement != inputPrice);
                System.out.println("Vous avez devinez le prix en " + compteur + " tentatives");
            }
            case 2 -> {
                System.out.println("Categorie Voiture");
                System.out.println("Prix compris entre 5000 et 7500 €");
                int priceRandomVoiture = new Random().nextInt(5000, 7500);
                System.out.println("Aide : " + priceRandomVoiture);
                Scanner scanVoiture = new Scanner(System.in);
                int inputPriceVoiture = 0;
                int compteurVoiture = 0;
                do {
                    System.out.println("Entrez le prix : ");
                    inputPriceVoiture = scanVoiture.nextInt();
                    if (inputPriceVoiture == priceRandomVoiture) {
                        System.out.println("Felicitation, vous avez deviné");
                    }
                    if (inputPriceVoiture > priceRandomVoiture) {
                        System.out.println("C'est moins");
                    }
                    if (inputPriceVoiture < priceRandomVoiture) {
                        System.out.println("C'est plus");
                    }
                    compteurVoiture++;
                }
                while (priceRandomVoiture != inputPriceVoiture);
                System.out.println("Vous avez devinez le prix en " + compteurVoiture + " tentatives");
            }
            case 3 -> {
                System.out.println("Categorie Immobilier");
                System.out.println("Prix compris entre 90 000 et 500 000 €");
                int priceRandomImmobilier = new Random().nextInt(90000, 500000);
                System.out.println("Aide : " + priceRandomImmobilier);
                Scanner scanImmo = new Scanner(System.in);
                int inputPriceImmo = 0;
                int compteurImmo = 0;
                do {
                    System.out.println("Entrez le prix : ");
                    inputPriceImmo = scanImmo.nextInt();
                    if (inputPriceImmo == priceRandomImmobilier) {
                        System.out.println("Felicitation, vous avez deviné");
                    }
                    if (inputPriceImmo > priceRandomImmobilier) {
                        System.out.println("C'est moins");
                    }
                    if (inputPriceImmo < priceRandomImmobilier) {
                        System.out.println("C'est plus");
                    }
                    compteurImmo++;
                }
                while (priceRandomImmobilier != inputPriceImmo);
                System.out.println("Vous avez devinez le prix en " + compteurImmo + " tentatives");
            }
        }

    }
}
