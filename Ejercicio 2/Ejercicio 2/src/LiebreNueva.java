public class LiebreNueva extends Thread {

    int vueltasMax;
    public LiebreNueva (int vueltasMax){
        this.vueltasMax = vueltasMax;
    }
    
    @Override
    public void run() {
        int vueltasL = 0;
        int contViejo = 0;
        while (vueltasL < vueltasMax) {
            int cont = ContadorVueltas.vueltas;
            //System.out.println(contViejo + " " + ContadorVueltas.vueltas);
            if (contViejo != cont){
                vueltasL++;
                System.out.println("La liebre dio " + vueltasL + " vueltas");
                contViejo = cont;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //System.out.println("hola");
           
        }
        System.out.println("Liebre termina la carrera " + vueltasL);
    }
}
