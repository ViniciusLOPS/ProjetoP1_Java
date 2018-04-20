///
/// Classe Moto que herda da classe Veiculo. Tem como função criar um objeto Moto e guardar suas especificações.
///
public class Moto extends Veiculo {
    private int passageiros;  ///< De 1 a 2 passageiros em uma Moto.
    /// Construtor padrão. Chama a classe Mãe e chama o set de passageiros.
    ///
    public Moto(){
        super(3, 3); /// Chama a classe Mãe entrando a velocidade e cor especificas da classe Moto.
        setPassageiros(); /// Chama o set de passageiros.
    }
    /// Metodo set para passageiros. Gera um numero aleatorio de passageiros entre 1 e 2.
    ///
    private void setPassageiros(){
        this.passageiros = gen.nextInt(2) + 1;
    }
    /// Metodo get de passageiros. retorna o numero de passageiros na Moto.
    ///
    public int getPassageiros(){
        return passageiros;
    }
}
