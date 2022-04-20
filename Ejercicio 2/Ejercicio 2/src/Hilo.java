public class Hilo extends Thread {

    public Hilo(String name){
        setName(name);
    }

    @Override
    public void run(){
        System.out.println("Hola Mundo!!!");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Hilo " + getName() + " finalizado.");
    }

  
}