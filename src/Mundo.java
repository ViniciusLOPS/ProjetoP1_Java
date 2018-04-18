import java.util.ArrayList;

public class Mundo {
    private int mapa[][] = ///< Mundo de grades 60 x 30, 0 = vazio, 1 = bordas, 2 = fabricas
            {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},};
    private int attmapa[][];  ///< mundo de grades para atualizações de posição
    private int size_x;  ///< linhas do mundo de grades
    private int size_y;  ///< colunas y do mundo de grades
    public Mundo() {
        size_x = 60;
        size_y = 30;
        attmapa = mapa;
    }

    public void attMapa(){
        attmapa= mapa;
    }

    public void attMundo(ArrayList<Caminhao> caminhoes, ArrayList<Carro> carros, ArrayList<Moto> motos) {
        attMapa();
        int x, y;
        for (int i = 0; i < motos.size(); i++) {
            x = motos.get(i).getX();
            y = motos.get(i).getY();
            if (attmapa[y][x] == 0 || attmapa[y][x] == 1) {
                motos.get(i).setFabrica(false);
                attmapa[y][x] = motos.get(i).getCor();
            } else if (attmapa[y][x] == 2) {
                if (motos.get(i).getFabrica() == false){
                    motos.get(i).setFabrica(true);
                    motos.add(new Moto());
                }
                attmapa[y][x] = motos.get(i).getCor();
            } else if (attmapa[y][x] == 3) {
                for (int j = 0; j < i; j++) {
                    if (x == motos.get(j).getX() && y == motos.get(j).getY()){
                        motos.remove(j);
                        break;
                    }
                }
                i--;
                motos.remove(i);
                i--;
                attmapa[y][x] = mapa[y][x];
            }
        }
        for (int i = 0; i < carros.size(); i++) {
            x = carros.get(i).getX();
            y = carros.get(i).getY();
            if (attmapa[y][x] == 0 || attmapa[y][x] == 1) {
                carros.get(i).setFabrica(false);
                attmapa[y][x] = carros.get(i).getCor();
            } else if (attmapa[y][x] == 2) {
                if (carros.get(i).getFabrica() == false){
                    carros.get(i).setFabrica(true);
                    carros.add(new Carro());
                }
                attmapa[y][x] = carros.get(i).getCor();
            } else if (attmapa[y][x] == 3) {
                for (int j = 0; j < motos.size(); j++) {
                    if (x == motos.get(j).getX() && y == motos.get(j).getY()){
                        motos.remove(j);
                        break;
                    }
                }
                attmapa[y][x] = carros.get(i).getCor();
            } else if (attmapa[y][x] == 4) {
                for (int j = 0; j < i; j++) {
                    if (x == carros.get(j).getX() && y == carros.get(j).getY()){
                        carros.remove(j);
                        break;
                    }
                }
                i--;
                carros.remove(i);
                i--;
                attmapa[y][x] = mapa[y][x];
            }

        }
        for (int i = 0; i < caminhoes.size(); i++) {
            x = caminhoes.get(i).getX();
            y = caminhoes.get(i).getY();
            if (attmapa[y][x] == 0 || attmapa[y][x] == 1) {
                caminhoes.get(i).setFabrica(false);
                attmapa[y][x] = caminhoes.get(i).getCor();
            } else if (attmapa[y][x] == 2) {
                if (caminhoes.get(i).getFabrica() == false){
                    caminhoes.get(i).setFabrica(true);
                    caminhoes.add(new Caminhao());
                }
                attmapa[y][x] = caminhoes.get(i).getCor();
            } else if (attmapa[y][x] == 3) {
                for (int j = 0; j < motos.size(); j++) {
                    if (x == motos.get(j).getX() && y == motos.get(j).getY()){
                        motos.remove(j);
                        break;
                    }
                }
                attmapa[y][x] = caminhoes.get(i).getCor();
            } else if (attmapa[y][x] == 4) {
                for (int j = 0; j < carros.size(); j++) {
                    if (x == carros.get(j).getX() && y == carros.get(j).getY()){
                        carros.remove(j);
                        break;
                    }
                }
                attmapa[y][x] = caminhoes.get(i).getCor();
            } else if (attmapa[y][x] == 5) {
                for (int j = 0; j < i; j++) {
                    if (x == caminhoes.get(j).getX() && y == caminhoes.get(j).getY()){
                        caminhoes.remove(j);
                        break;
                    }
                }
                i--;
                caminhoes.remove(i);
                i--;
                attmapa[y][x] = mapa[y][x];
            }

        }
        System.out.println("\033[2;31m Caminhoes: \033[0m" + caminhoes.size() + "\033[2;34m Carros: \033[0m" + carros.size()
                + "\033[2;32m Motos: \033[0m" + motos.size());
        printMundo();
    }

    public void printMundo() {
        for (int i = 0; i < size_y; i++){
            for (int j = 0; j < size_x; j++){
                if (attmapa[i][j] == 0){
                    System.out.print("\033[7;37m \033[0m"); /// 0 = lightgray
                }
                else if (attmapa[i][j] == 1){
                    System.out.print("\033[7;30m \033[0m"); /// 1 = black
                }
                else if (attmapa[i][j] == 2){
                    System.out.print("\033[7;35m \033[0m"); /// 2 = magenta
                }
                else if (attmapa[i][j] == 3){
                    System.out.print("\033[7;32m \033[0m"); /// 3 = green
                }
                else if (attmapa[i][j] == 4){
                    System.out.print("\033[7;34m \033[0m"); /// 4 = blue
                }
                else if (attmapa[i][j] == 5){
                    System.out.print("\033[7;31m \033[0m"); /// 5 = red
                }
            }
            System.out.println();
        }
    }

}
