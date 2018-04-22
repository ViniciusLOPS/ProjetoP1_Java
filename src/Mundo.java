import java.util.ArrayList;
///
/// Classe para criação de um Mundo de grades. Capaz de montar um mundo de grades de forma colorida e decidir
/// como o Mundo vai reagir em relação as classes Veiculo.
///
public class Mundo {
    private int mapa[][] =///< Mundo de grades 40 x 40, 0 = vazio, 1 = bordas, 2 = fabricas.
                          ///< Serve para quando ouverem batidas substituir o espaço da batida pelo mapa original.
                          ///<
            {
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                    {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                    {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                    {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                    {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                    {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                    {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    private int attmapa[][];  ///< Mundo de grades para atualizações de posição.
    private int contVitimas; ///< Contador de vitimas em batidas.
    private int contCarga; ///< Contador de carga perdida em batidas.
    ///
    /// Construtor padrão de Mundo. Cria um mundo para atualizações, com sua forma inicial.
    ///
    public Mundo() {
        attmapa = new int[][] ///< Mundo de grades 40 x 40, 0 = vazio, 1 = bordas, 2 = fabricas.
                              ///< Serve para criar um mundo como o mapa original.
                {
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    }
    ///
    /// Método para atualização do mapa. Atualiza o mapa para sua versão original, para realocação e interação
    /// de cada Veiculo.
    ///
    public void attMapa(){
        attmapa = new int[][]  ///< Mundo de grades 40 x 40, 0 = vazio, 1 = bordas, 2 = fabricas.
                               ///< Serve para atualizar posições.
                {
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    }
    ///
    /// Método para atualização do Mundo. Percorre cada tipo de Veiculo para confirmar se: ele está em um espaço vazio,
    /// em uma borda, em uma fabrica ou em cima de outro Veiculo; onde a fabrica duplica veiculos, os veiculos que batem
    /// dependendo de quem é 'maior', vai sair ganhando ou se ambos forem iguais ambos 'morrem'.
    ///
    public void attMundo(ArrayList<Caminhao> caminhoes, ArrayList<Carro> carros, ArrayList<Moto> motos) {
        int x, y; ///< Declarando x e y, que seram usados para saber a posição exata de cada Veiculo criado.
        /// percorre todo o Arraylist de Moto.
        for (int i = 0; i < motos.size(); i++) {
            x = motos.get(i).getX(); /// Da para x o valor da posição x do Moto.
            y = motos.get(i).getY(); /// Da para y o valor da posição y do Moto.
            /// Se a Moto se movimentou para uma borda ou uma área vazia, entra neste if.
            if (attmapa[x][y] == 0 || attmapa[y][x] == 1) {
                motos.get(i).setFabrica(false); /// Seta fabrica como false. Afinal a Moto está fora da fabrica.
                attmapa[x][y] = motos.get(i).getCor(); /// Seta a cor do mapa para o valor que está em Moto.
            }
            /// Cria nova Moto. Se uma Moto se depara com uma fabrica ela se duplica.
            else if (attmapa[x][y] == 2) {
                /// Só entra no if se a fabrica ainda não foi visitada no movimento anterior.
                if (!motos.get(i).getFabrica()){
                    /// Seta a fabrica como true. Para que uma Moto não repita sua duplicação sem antes
                    /// sair e voltar a fabrica.
                    motos.get(i).setFabrica(true);
                    motos.add(new Moto()); /// Adiciona uma nova Moto se o Veiculo visitou a fabrica.
                }
                attmapa[x][y] = motos.get(i).getCor(); /// Seta a cor do mapa para o valor que está em Moto.
            }
            /// Exclui as motos batidas. Se uma Moto se depara com outra Moto, então será nescessario
            /// excluir ambas.
            else if (attmapa[x][y] == 3) {
                /// Percorre todas as motos que ja existem para descobrir quem bateu.
                for (int j = 0; j < i; j++) {
                    /// Se for a Moto que sofreu a batida entra no if.
                    if (x == motos.get(j).getX() && y == motos.get(j).getY()){
                        /// Adiciona os passageiros da Moto ao contador de vitimas.
                        contVitimas += motos.get(j).getPassageiros();
                        motos.remove(j); /// Remove o Moto que sofreu a batida.
                        break; /// Para sair do for no momento em que achar a Moto que sofreu o acidente.
                    }
                }
                /// Voltando no array pois uma Moto que bateu foi retirado de la, assim precisando voltar atraz
                /// para retirar o proximo que sofreu a batida.
                i--;
                /// Adiciona os passageiros da Moto ao contador de vitimas.
                contVitimas += motos.get(i).getPassageiros();
                motos.remove(i); /// Remove o Moto que sofreu a batida.
                /// voltando no array pois uma Moto que bateu e foi retirado de la, assim precisando voltar atraz
                /// para continuar o for vizualizando todos as motos que faltaram.
                i--;

                attmapa[x][y] = mapa[x][y]; /// o ponto da batida será substituido pelo valor no mapa original.
            }
        }
        /// percorre todo o Arraylist de Carro.
        for (int i = 0; i < carros.size(); i++) {
            x = carros.get(i).getX(); /// Da para x o valor da posição x do Carro.
            y = carros.get(i).getY(); /// Da para y o valor da posição y do Carro.
            /// Se o Carro se movimentou para uma borda ou uma área vazia, entra neste if.
            if (attmapa[x][y] == 0 || attmapa[x][y] == 1) {
                carros.get(i).setFabrica(false); /// Seta fabrica como false. Afinal o Carro está fora da fabrica.
                attmapa[x][y] = carros.get(i).getCor(); /// Seta a cor do mapa para o valor que está em Carro.
            }
            /// Cria novo Carro. Se um Carro se depara com uma fabrica ele se duplica.
            else if (attmapa[x][y] == 2) {
                /// Só entra no if se a fabrica ainda não foi visitada no movimento anterior.
                if (!carros.get(i).getFabrica()){
                    /// Seta a fabrica como true. Para que um carro não repita sua duplicação sem antes
                    /// sair e voltar a fabrica.
                    carros.get(i).setFabrica(true);
                    carros.add(new Carro()); /// Adiciona um novo Carro se o Veiculo visitou a fabrica.
                }
                attmapa[x][y] = carros.get(i).getCor(); /// Seta a cor do mapa para o valor que está em Carro.
            }
            /// Exclui as motos batidas. Se um Carro se depara com uma Moto, a Moto "morre".
            else if (attmapa[x][y] == 3) {
                /// Percorre todas as motos para descobrir quem bateu.
                for (int j = 0; j < motos.size(); j++) {
                    /// Se for a Moto que sofreu a batida entra no if.
                    if (x == motos.get(j).getX() && y == motos.get(j).getY()){
                        /// Adiciona os passageiros da Moto ao contador de vitimas.
                        contVitimas += motos.get(j).getPassageiros();
                        motos.remove(j); /// Remove o Moto que sofreu a batida.
                        break; /// Para sair do for no momento em que achar o Moto que sofreu o acidente.
                    }
                }
                attmapa[x][y] = carros.get(i).getCor(); /// Seta a cor do mapa para o valor que está em Carro.
            }
            /// Exclui os carros batidos. Se um Carro se depara com outro Carro, então será nescessario
            /// excluir ambos.
            else if (attmapa[x][y] == 4) {
                /// Percorre todos os carros que ja existem para descobrir quem bateu.
                for (int j = 0; j < i; j++) {
                    /// Se for o Carro que sofreu a batida entra no if.
                    if (x == carros.get(j).getX() && y == carros.get(j).getY()){
                        /// Adiciona os passageiros do Carro ao contador de vitimas.
                        contVitimas += carros.get(j).getPassageiros();
                        carros.remove(j); /// Remove o Carro que sofreu a batida.
                        break; /// Para sair do for no momento em que achar o Carro que sofreu o acidente.
                    }
                }
                /// Voltando no array pois um Carro que bateu foi retirado de la, assim precisando voltar atraz
                /// para retirar o proximo que sofreu a batida.
                i--;
                /// Adiciona os passageiros do Carro ao contador de vitimas.
                contVitimas += carros.get(i).getPassageiros();
                carros.remove(i); /// Remove o Carro que sofreu a batida.
                /// voltando no array pois um Carro que bateu e foi retirado de la, assim precisando voltar atraz
                /// para continuar o for vizualizando todos os carros que faltaram.
                i--;
                attmapa[x][y] = mapa[y][x]; /// o ponto da batida será substituido pelo valor no mapa original.
            }

        }
        /// percorre todo o Arraylist de Caminhao.
        for (int i = 0; i < caminhoes.size(); i++) {
            x = caminhoes.get(i).getX(); /// Da para x o valor da posição x do Caminhao.
            y = caminhoes.get(i).getY(); /// Da para y o valor da posição y do Caminhao.
            /// Se o Caminhao se movimentou para uma borda ou uma área vazia, entra neste if.
            if (attmapa[x][y] == 0 || attmapa[x][y] == 1) {
                caminhoes.get(i).setFabrica(false); /// Seta fabrica como false. Afinal o Caminhao está fora da fabrica.
                attmapa[x][y] = caminhoes.get(i).getCor(); /// Seta a cor do mapa para o valor que está em Caminhao.
            }
            /// Cria novo Caminhao. Se um Caminhao se depara com uma fabrica ele se duplica.
            else if (attmapa[x][y] == 2) {
                /// Só entra no if se a fabrica ainda não foi visitada no movimento anterior.
                if (!caminhoes.get(i).getFabrica()){
                    /// Seta a fabrica como true. Para que um caminhao não repita sua duplicação sem antes
                    /// sair e voltar a fabrica.
                    caminhoes.get(i).setFabrica(true);
                    caminhoes.add(new Caminhao()); /// Adiciona um novo Caminhao se o Veiculo visitou a fabrica.
                }
                attmapa[x][y] = caminhoes.get(i).getCor(); /// Seta a cor do mapa para o valor que está em Caminhao.
            }
            /// Exclui as motos batidas. Se um Caminhao se depara com uma Moto, a Moto "morre".
            else if (attmapa[x][y] == 3) {
                /// Percorre todas as motos para descobrir quem bateu.
                for (int j = 0; j < motos.size(); j++) {
                    /// Se for a Moto que sofreu a batida entra no if.
                    if (x == motos.get(j).getX() && y == motos.get(j).getY()){
                        /// Adiciona os passageiros da Moto ao contador de vitimas.
                        contVitimas += motos.get(j).getPassageiros();
                        motos.remove(j); /// Remove o Moto que sofreu a batida.
                        break; /// Para sair do for no momento em que achar a moto que sofreu o acidente.
                    }
                }
                attmapa[x][y] = caminhoes.get(i).getCor(); /// Seta a cor do mapa para o valor que está em Caminhao.
            }
            /// Exclui os carros batidos. Se um Caminhao se depara com um Carro, o Carro "morre".
            else if (attmapa[x][y] == 4) {
                /// Percorre todos os carros para descobrir quem bateu.
                for (int j = 0; j < carros.size(); j++) {
                    /// Se for o Carro que sofreu a batida entra no if.
                    if (x == carros.get(j).getX() && y == carros.get(j).getY()){
                        /// Adiciona os passageiros do Carro ao contador de vitimas.
                        contVitimas += carros.get(j).getPassageiros();
                        carros.remove(j); /// Remove o Carro que sofreu a batida.
                        break; /// Para sair do for no momento em que achar o carro que sofreu o acidente.
                    }
                }
                attmapa[x][y] = caminhoes.get(i).getCor(); /// Seta a cor do mapa para o valor que está em Caminhao.
            }
            /// Exclui os caminhoes batidos. Se um Caminhao se depara com outro Caminhao, então será nescessario
            /// excluir ambos.
            else if (attmapa[x][y] == 5) {
                /// Percorre todos os caminhoes que ja existem para descobrir quem bateu.
                for (int j = 0; j < i; j++) {
                    /// Se for o Caminhao que sofreu a batida entra no if.
                    if (x == caminhoes.get(j).getX() && y == caminhoes.get(j).getY()){
                        /// Adiciona 1 ao contador de Vitimas. Estou considerando caminhoes cargueiros onde normalmente
                        /// so tem o piloto.
                        contVitimas += 1;
                        contCarga += caminhoes.get(j).getCarga(); /// Contador de toneladas perdidas pelas batidas.
                        caminhoes.remove(j); /// Remove o Caminhao que sofreu a batida.
                        break; /// Para sair do for no momento em que achar o Caminhao que sofreu o acidente.
                    }
                }
                /// Voltando no array pois um Caminhao que bateu foi retirado de la, assim precisando voltar atraz
                /// para retirar o proximo que sofreu a batida.
                i--;
                contCarga += caminhoes.get(i).getCarga(); /// Contador de toneladas perdidas pelas batidas.
                /// Adiciona 1 ao contador de Vitimas. Estou considerando caminhoes cargueiros onde normalmente
                /// so tem o piloto.
                contVitimas += 1;
                caminhoes.remove(i); /// Remove o Caminhao que sofreu a batida.
                /// voltando no array pois um Caminhao que bateu e foi retirado de la, assim precisando voltar atraz
                /// para continuar o for vizualizando todos os caminhoes que faltaram.
                i--;
                attmapa[x][y] = mapa[x][y]; /// o ponto da batida será substituido pelo valor no mapa original.
            }
        }
        System.out.println("\033[2;31m  Caminhoes: \033[0m" + caminhoes.size() + "\033[2;34m Carros: \033[0m" +
                carros.size() + "\033[2;32m Motos: \033[0m" + motos.size()); /// Printa o numero de veiculos existentes.
        printMundo(); /// Chama o metodo printMundo.
        System.out.println("\033[2;31mVitimas: \033[0m" + contVitimas + "\033[2;32m Carga Perdida:\033[0m" + contCarga +
                "\033[2;32mToneladas \033[0m"); /// Printa uma linha que contem numero de vitimas e toneladas de carga.
    }
    ///
    /// Método para printar o mundo com as cores escolhidas, construindo assim
    /// um mundo de grades.
    ///
    public void printMundo() {
        /// For para ver todas as colunas.
        for (int i = 0; i < 40; i++){
            /// For para ver todas as linhas.
            for (int j = 0; j < 40; j++){
                /// 0 é vazio.
                if (attmapa[i][j] == 0){
                    System.out.print("\033[7;0m \033[0m"); /// 0 = black.
                }
                /// 1 é borda.
                else if (attmapa[i][j] == 1){
                    System.out.print("\033[7;37m \033[0m"); /// 1 = lightgray.
                }
                /// 2 é fabrica.
                else if (attmapa[i][j] == 2){
                    System.out.print("\033[7;35m \033[0m"); /// 2 = roxo.
                }
                /// 3 representa as motos.
                else if (attmapa[i][j] == 3){
                    System.out.print("\033[7;32m \033[0m"); /// 3 = Green.
                }
                /// 4 representa os carros.
                else if (attmapa[i][j] == 4){
                    System.out.print("\033[7;34m \033[0m"); /// 4 = blue.
                }
                /// 5 representa os caminhões.
                else if (attmapa[i][j] == 5){
                    System.out.print("\033[7;31m \033[0m"); /// 5 = red.
                }
            }
            System.out.println(); /// Print para pular linha.
        }
    }

}
