public class ContadorVueltas extends Thread {

    public static int vueltas;
    public int vueltasMax;

    public ContadorVueltas(int vueltasMax, int timesLower){
        this.vueltasMax = vueltasMax * timesLower;

    }

    @Override
    public void run(){
        vueltas = 0;
        try{
            while (vueltas < vueltasMax){
                vueltas++;
                System.out.println(vueltas);
                Thread.sleep(1000);
            }
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
