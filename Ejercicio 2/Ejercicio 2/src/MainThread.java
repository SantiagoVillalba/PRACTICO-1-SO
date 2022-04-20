public class MainThread {
    public static void main(String[] args) throws Exception {

        int vueltasTotales = 5;
        int timesLower = 4;
        ContadorVueltas clock = new ContadorVueltas(vueltasTotales, timesLower);

        LiebreNueva liebre = new LiebreNueva(vueltasTotales);
        TortugaNueva tortuga = new TortugaNueva(vueltasTotales, timesLower);
        clock.start();
        liebre.start();
        tortuga.start();

    }
 
}
