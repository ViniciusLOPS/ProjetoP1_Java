import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Mundo m = new Mundo();
        ArrayList <Caminhao> caminhoes = new ArrayList<>();
        ArrayList <Carro> carros = new ArrayList<>();
        ArrayList <Moto> motos = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            caminhoes.add(new Caminhao());
            carros.add(new Carro());
            motos.add(new Moto());
        }
        int contadorPrints = 0;
        while (!caminhoes.isEmpty() && !carros.isEmpty() || !caminhoes.isEmpty() && !motos.isEmpty() ||
                !carros.isEmpty() && !motos.isEmpty() || contadorPrints == 10001){
            m.attMapa();
            for (int i = 0; i < caminhoes.size(); i++) {
                caminhoes.get(i).move();
            }
            for (int i = 0; i < carros.size(); i++) {
                carros.get(i).move();
            }
            for (int i = 0; i < motos.size(); i++) {
                motos.get(i).move();
            }
            m.attMundo(caminhoes, carros, motos);
            contadorPrints ++;
            if(contadorPrints == 10000){
                System.out.println("10000 prints atingidos(seria um exagero continuar)");
            }
            try {
                Thread.sleep(100); ///< Pausa o programa durante 333 milisegundos
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
