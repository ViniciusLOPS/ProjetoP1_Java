import java.util.Random;

///
/// Classe Veiculo. Tem como função criar um objeto Veiculo que é chamado pelas classes herdadas.
///
public class Veiculo {
    protected int x;  ///< Variavel com valor aleatorio de 0 a 39.
    protected int y;  ///< Variavel com valor aleatorio de 0 a 39.
    protected boolean fabrica; ///< True ou false para saber se cria ou não um veiculo novo.
    protected int speed;  ///< Velocidade fixa do veiculo.
    protected int cor;  ///< Cor fixa de um veiculo.
    /// Construtor padrão.
    public Veiculo(){}
    /// Gerador de numeros randomicos da biblioteca random.
    public Random gen = new Random();
    /// Um construtor parametrizado. Cria um veiculo que recebe das suas subclasses a velocidade e
    /// a cor que o representa.
    public Veiculo(int speed, int cor){
        setX(gen.nextInt(40)); /// chama o metodo set entrando um numero aleatorio de 0 a 39.
        setY(gen.nextInt(40)); /// chama o metodo set entrando um numero aleatorio de 0 a 39.
        setFabrica(false); /// chama o metodo set entrando o boolean false como padrão.
        setSpeed(speed); /// chama o metodo set entrando a velocidade oferecida por uma das subclasses do Veiculo.
        setCor(cor); /// chama o metodo set entrando a cor oferecida por uma das subclasses do Veiculo.
    }
    /// Metodo set para x.
    public void setX(int x){
        this.x = x;
    }
    /// Metodo set para y.
    public void setY(int y){
        this.y = y;
    }
    /// Metodo set para fabrica, true ou false.
    public void setFabrica(boolean fabrica){
        this.fabrica = fabrica;
    }
    /// Metodo set para velocidade.
    public void setSpeed(int speed){
        this.speed = speed;
    }
    /// Metodo set para cor.
    public void setCor(int cor){
        this.cor = cor;
    }
    /// Metodo get para x.
    public int getX() {
        return x;
    }
    /// Metodo get para y.
    public int getY() {
        return y;
    }
    /// Metodo get para fabrica, true ou false.
    public boolean getFabrica() {
        return fabrica;
    }
    /// Metodo get para velocidade.
    public int getSpeed(){
        return speed;
    }
    /// Metodo get para cor.
    public int getCor() {
        return cor;
    }
    ///
    /// Metodo para mover o Veiculo de forma aleatoria, utilizando a biblioteca random.
    ///
    public void move(){
        int m = gen.nextInt(4) + 1; ///< variavel com valor aleatorio entre 1 e 4.
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
        /// Confirma se x e y estão de acordo com o tamanho do mundo.
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
