import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Arranca el programa:");
        Semaphore sem = new Semaphore(0);
        Contador cont = new Contador(sem,5);
        List<Runnable> hijos = new ArrayList<>();
        Hijos h1 = new Hijos(sem,1);
        Hijos h2 = new Hijos(sem,2);
        Hijos h3 = new Hijos(sem,3);
        Hijos h4 = new Hijos(sem,4);
        Hijos h5 = new Hijos(sem,5);
        hijos.add(h1);
        hijos.add(h2);
        hijos.add(h3);
        hijos.add(h4);
        hijos.add(h5);

        cont.run();
        for(Runnable hijo : hijos){
            hijo.run();
        }


    }
}
