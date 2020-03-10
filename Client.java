package td4;

public class Client implements Runnable {
    private String nom;
    private BalSimple bal;

    public Client(String nom, BalSimple bal) {
        this.nom = nom;
        this.bal = bal;
    }

    @Override
    public void run() {
        this.bal.deposeRequete("requete client"+this.nom);
    }
}
