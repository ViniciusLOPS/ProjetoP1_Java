import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Mundo m = new Mundo();
        Veiculo v = new Veiculo(1, 5);
        m.printMundo();
        m.attMapa();
        m.printMundo();
        System.out.println( " " + v.getX() + " " + v.getY() + " " +  v.getFabrica() + " " +  v.getCor() + " " +  v.getSpeed());
    }
}
