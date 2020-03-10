package td4;

public class Serveur implements Runnable {
    private BalSimple bal;

    public Serveur(BalSimple bal) {
        this.bal = bal;
    }

    @Override
    public void run() {
        this.bal.retireRequete();
    }
}
