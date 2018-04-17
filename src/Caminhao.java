import java.util.Random;

public class Caminhao extends Veiculo {
    private int carga; //1 a 14
    public Caminhao(){
        super(1, 5);
        setCarga();
    }
    public void setCarga(){
        this.carga = gen.nextInt(14) + 1;
    }
    public int getCarga(){
        return carga;
    }
}
