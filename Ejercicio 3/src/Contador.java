import java.util.concurrent.Semaphore;
public class Contador implements Runnable{

    private Semaphore sem;
    public static int ciclos;
    private int cantHijos;

    public Contador(Semaphore sem,int cant) {
        this.sem = sem;
        this.cantHijos= cant;
    }

    @Override
    public void run() {
        ciclos = 0;
        try{
            while (true){
                Thread.sleep(1000);
                ciclos++;
                System.out.println("La señora indicará la hora: "+ ciclos);
                sem.release(cantHijos);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
