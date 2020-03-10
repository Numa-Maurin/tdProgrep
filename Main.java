package td4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        BalSimple B1=new BalSimple();
        Client C1,C2,C3;
        Serveur s1;

        C1= new Client("C1",B1);
        C2= new Client("C1",B1);
        C3= new Client("C1",B1);
        s1 = new Serveur(B1);

        ExecutorService es= Executors.newFixedThreadPool(10);
        es.execute(C1);
        es.execute(C2);
        es.execute(C3);
        es.execute(s1);
        es.shutdown();
    }
}
