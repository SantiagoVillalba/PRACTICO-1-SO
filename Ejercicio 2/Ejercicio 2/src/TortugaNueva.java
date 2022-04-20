public class TortugaNueva extends Thread {

    int vueltasMax;
    int timesLower;

    public TortugaNueva (int vueltasMax, int tL){
        this.vueltasMax = vueltasMax;
        this.timesLower = tL;
    }
    
    @Override
    public void run(){
        int vueltas = 0;
        int vueltasT = 0;
        int contViejo = 0;
        while (vueltasT < vueltasMax) {
            int cont = ContadorVueltas.vueltas;
            if (contViejo != cont){
                vueltas++;
                //vueltasT += vueltas % timesLower == 0 ? 1 : 0;
                if (vueltas % timesLower == 0) {
                    vueltasT++;
                    System.out.println("La tortuga dio " + vueltasT + " vueltas");
                }
                contViejo = cont;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        
    }
}
