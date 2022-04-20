import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(0);

        List<Thread> threads = new ArrayList<Thread>();
        int cantHijos = 5;

        // Creo el hilo contador
        Contador cont = new Contador(sem, cantHijos);
        threads.add(new Thread(cont));

        // Creo los hilos hijos
        for (int i = 1; i <= cantHijos; i++) {
            threads.add(new Thread(new Hijos(sem, i)));
        }

        System.out.println("Comienzo la ejecución");

        // Inicio los hilos
        for (Thread thread: threads) {
            thread.start();
        }


    }
}
