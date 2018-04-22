import java.util.ArrayList;
///
/// Classe executavel do programa. É ela que contem todas as chamadas de função para o funcionamento do mesmo.
///
public class Main {

    public static void main(String[] args) {

        Mundo m = new Mundo(); ///< Cria um Mundo.
        ArrayList <Caminhao> caminhoes = new ArrayList<>(); ///< Cria uma lista de caminhões da classe Caminhao.
        ArrayList <Carro> carros = new ArrayList<>(); ///< Cria uma lista de carros da classe Carro.
        ArrayList <Moto> motos = new ArrayList<>(); ///< Cria uma lista de motos da classe Moto.
        ///
        /// For que adiciona 10 novos veiculos de cada tipo para o teste do mundo de grades.
        ///
        for (int i = 0; i < 10; i++){
            caminhoes.add(new Caminhao());
            carros.add(new Carro());
            motos.add(new Moto());
        }
        int contadorPrints = 0; ///< contador para limitar o numero de prints.
        ///
        /// While que permite o programa rodar até o momento em que apenas um tipo de veiculo sobrar ou os prints
        /// excederem o limite que impus.
        ///
        while (!caminhoes.isEmpty() && !carros.isEmpty() || !caminhoes.isEmpty() && !motos.isEmpty() ||
                !carros.isEmpty() && !motos.isEmpty() || contadorPrints == 10001){
            m.attMapa(); /// Volta o mapa a sua forma original.
            for (Caminhao caminhao : caminhoes) { /// For que percorre cada caminhao.
                caminhao.move(); /// Move o caminhão.
            }
            for (Carro carro : carros) { /// For que percorre cada carro.
                carro.move(); /// Move o carro.
            }
            for (Moto moto : motos) { /// For que percorre cada moto.
                moto.move(); /// Move a moto.
            }
            m.attMundo(caminhoes, carros, motos); ///< Atualiza o mundo.
            ///
            /// Conta cada print no objetivo de evitar o excesso de prints,
            /// para que não seja uma run "infinita".
            ///
            contadorPrints ++;
            ///
            /// Manda um aviso de que ja foram atingidos 10000 prints.
            ///
            if(contadorPrints == 10000){
                System.out.println("10000 prints atingidos(seria um exagero continuar)");
            }
            ///
            /// Pausa o programa durante um tempo determinado em milisegundos.
            ///
            try {
                Thread.sleep(500);
            } catch (Exception e) { e.printStackTrace(); }
        }
    }
}
