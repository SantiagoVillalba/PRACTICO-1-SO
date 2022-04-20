public class HiloSaludador extends Thread {

    public HiloSaludador(String name){
        setName(name);
    }

    @Override
    public void run(){
        System.out.println("Hola soy el hilo " + getName());
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Hilo " + getName() + " finalizado.");
    }
}