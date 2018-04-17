import java.util.Random;

public class Caminhao extends Veiculo {
    private int carga; ///< 1 a 14 toneladas de carga
    public Caminhao(){
        super(1, 5);
        setCarga();
    }
    private void setCarga(){
        this.carga = gen.nextInt(14) + 1;
    }
    public int getCarga(){
        return carga;
    }
}
