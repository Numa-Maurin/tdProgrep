package td4;

import java.util.concurrent.Semaphore;

class BalSimple {
    String message;
    Semaphore sDepot, sRetrait;

    public BalSimple() {
        this.sDepot = new Semaphore(1,true);
        this.sRetrait = new Semaphore(2,true);
    }

    public void deposeRequete(String mess) {
        try {
            this.sDepot.acquire();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.message=message;
        this.sRetrait.release();
    }

    public String retireRequete(){
        try {
            this.sRetrait.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String mess=this.message;
        this.sDepot.release();
        return mess;
    }
}