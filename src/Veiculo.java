import java.util.Random;

public class Veiculo {
    protected int x;  ///< valores aleatorios de 0 a 59
    protected int y;  ///< valores aleatorios de 0 a 29
    protected boolean fabrica; ///< true ou false para saber se cria ou não um veiculo novo
    protected int speed;  ///< velocidade fixa do veiculo
    protected int cor;  ///< cor fixa de um veiculo

    public Veiculo(){}
    public Random gen = new Random();
    public Veiculo(int speed, int cor){
        setX(gen.nextInt(60));
        setY(gen.nextInt(30));
        setFabrica(false);
        setSpeed(speed);
        setCor(cor);
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setFabrica(boolean fabrica){
        this.fabrica = fabrica;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setCor(int cor){
        this.cor = cor;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean getFabrica() {
        return fabrica;
    }
    public int getSpeed(){
        return speed;
    }
    public int getCor() {
        return cor;
    }
}
