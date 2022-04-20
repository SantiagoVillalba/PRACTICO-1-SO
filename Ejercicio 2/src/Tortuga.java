public class Tortuga extends Thread{

    public int vueltas;
    private int vueltasTotales;
    public boolean carreraTerminada = false;
    
    public Tortuga(int total){
        vueltas = 0;
        vueltasTotales = total;
    }

    @Override
    public void run() {
        while (vueltas < vueltasTotales) {
            if (carreraTerminada)
                return;
            try {
                sleep(4000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            vueltas++;
            System.out.println("La tortuga dio " + vueltas + " vueltas");
        }
        
    }

    public void comenzarAdelantada(int vueltasAdelante){
        this.vueltas += vueltasAdelante;
    }
    
}
