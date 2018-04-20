///
/// Classe Caminhao que herda da classe Veiculo. Tem como função criar um objeto Caminhao e guardar suas especificações.
///
public class Caminhao extends Veiculo {
    private int carga; ///< De 1 a 14 toneladas de carga em um Caminhao.
    ///Construtor padrão. Chama a classe Mãe e chama o set de carga.
    ///
    public Caminhao(){
        super(1, 5);/// Chama a classe Mãe entrando a velocidade e cor especificas da classe Carro.
        setCarga(); /// Chama o set de carga.
    }
    /// Metodo set para carga. Gera uma carga aleatoria entre 1 e 14 toneladas.
    ///
    private void setCarga(){
        this.carga = gen.nextInt(14) + 1;
    }
    /// Metodo get para carga. Retorna a carga presente no Caminhao.
    ///
    public int getCarga(){
        return carga;
    }
}
