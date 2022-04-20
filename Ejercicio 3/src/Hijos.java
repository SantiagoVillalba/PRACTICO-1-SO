import java.util.concurrent.Semaphore;
public class Hijos implements Runnable{

    private int id;
    private Semaphore sem;

    public Hijos(Semaphore sem,int id){
        this.sem = sem;
        this.id = id;
    }

    @Override
    public void run() {
        while(true){
            try {
                sem.acquire();
                System.out.println("Hilo "+id+" recibio de la Señora e indicará la hora: "+ Contador.ciclos);
                Thread.sleep(10);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
