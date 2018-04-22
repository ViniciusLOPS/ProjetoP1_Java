///
/// Classe Carro que herda da classe Veiculo. Tem como função criar um objeto Carro e guardar suas especificações.
///
public class Carro extends Veiculo {
    private int passageiros; ///< De 1 a 4 passageiros em um Carro.

    /// Construtor padrão. Chama a classe Mãe e chama o set de passageiros.
    ///
    public Carro(){
        super(2, 4); /// Chama a classe Mãe entrando a velocidade e cor especificas da classe Carro.
        setPassageiros(); /// Chama o set de passageiros.
    }
    /// Metodo set para passageiros. Gera um numero aleatorio de passageiros entre 1 e 4.
    ///
    private void setPassageiros(){
        this.passageiros = gen.nextInt(4) + 1;
    }
    /// Metodo get de passageiros. retorna o numero de passageiros no Carro.
    ///
    public int getPassageiros(){
        return passageiros;
    }
}
