public class Carro extends Veiculo {
    private int passageiros; ///< 1 a 4 passageiros

    public Carro(){
        super(2, 4);
        setPassageiros();
    }
    private void setPassageiros(){
        this.passageiros = gen.nextInt(4) + 1;
    }
    public int getPassageiros(){
        return passageiros;
    }
}
