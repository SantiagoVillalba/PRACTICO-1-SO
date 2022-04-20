public class Liebre extends Thread{

    private int timesFaster;
    public int vueltas;
    private int vueltasTotales;
    public boolean carreraTerminada = false;

    public Liebre(int timesFaster, int total){
        this.timesFaster = timesFaster;
        vueltas = 0;
        vueltasTotales = total;
    }

    @Override
    public void run() {
        while (vueltas <= vueltasTotales) {
            if (carreraTerminada)
                return;
            for (int i = 0; i < timesFaster; i++) {
                vueltas++;
                System.out.println("La liebre dio " + vueltas + " vueltas");
                if (vueltas ==vueltasTotales)
                    return;
            }
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        
    }
    
}
