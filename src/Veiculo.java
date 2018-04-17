import java.util.Random;

public class Veiculo {
    protected int x;
    protected int y;
    protected String fabrica;
    protected int speed;
    protected int cor;

    public Veiculo(){}
    public Random gen = new Random();
    public Veiculo(int speed, int cor){
        setX(gen.nextInt(60));
        setY(gen.nextInt(30));
        setFabrica("false");
        setSpeed(speed);
        setCor(cor);
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setFabrica(String fabrica){
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
    public String getFabrica() {
        return fabrica;
    }
    public int getSpeed(){
        return speed;
    }
    public int getCor() {
        return cor;
    }
}
