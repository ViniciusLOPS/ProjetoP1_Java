import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Mundo m = new Mundo();
        Veiculo v = new Veiculo(1, 5);
        ArrayList <Caminhao> caminhoes = new ArrayList<>();
        ArrayList <Carro> carros = new ArrayList<>();
        for (int i = 0; i < 1; i++){
            caminhoes.add(new Caminhao());
            carros.add(new Carro());
        }
        m.printMundo();
        m.attMapa();
        m.printMundo();
        System.out.println( " " + v.getX() + " " + v.getY() + " " +  v.getFabrica() + " " +  v.getCor() + " " +  v.getSpeed());
        System.out.println( " " + caminhoes.get(0).getX() + " " + caminhoes.get(0).getY() + " " +  caminhoes.get(0).getFabrica() +
                " " +  caminhoes.get(0).getCor() + " " +  caminhoes.get(0).getSpeed() + " " + caminhoes.get(0).getCarga());
        System.out.println( " " + carros.get(0).getX() + " " + carros.get(0).getY() + " " +  carros.get(0).getFabrica() +
                " " +  carros.get(0).getCor() + " " +  carros.get(0).getSpeed() + " " + carros.get(0).getPassageiros());
    }
}
