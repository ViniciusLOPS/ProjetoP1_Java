import java.util.Random;

public class Veiculo {
    protected int x;  ///< valores aleatorios de 0 a 39
    protected int y;  ///< valores aleatorios de 0 a 39
    protected boolean fabrica; ///< true ou false para saber se cria ou não um veiculo novo
    protected int speed;  ///< velocidade fixa do veiculo
    protected int cor;  ///< cor fixa de um veiculo

    public Veiculo(){}
    public Random gen = new Random();
    public Veiculo(int speed, int cor){
        setX(gen.nextInt(40));
        setY(gen.nextInt(40));
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
    public void move(){
        int m = gen.nextInt(4) + 1;
        if (m == 1){
            y -= speed;
        }
        else if (m == 2){
            y += speed;
        }
        else if (m == 3){
            x -= speed;
        }
        else if (m == 4){
            x += speed;
        }
        /// confirma se x e y estão de acordo com o tamanho do mundo
        if (x < 0) {
            x += 40;
        }
        else if (x > 39) {
            x -= 40;
        }
        else if (y < 0) {
            y += 40;
        }
        else if (y > 39) {
            y -= 40;
        }
    }
}
