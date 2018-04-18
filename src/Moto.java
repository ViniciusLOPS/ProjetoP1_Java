public class Moto extends Veiculo {
    private int passageiros;  ///< 1 a 2 passageiros
    public Moto(){
        super(3, 3);
        setPassageiros();
    }
    private void setPassageiros(){
        this.passageiros = gen.nextInt(2) + 1;
    }
    public int getPassageiros(){
        return passageiros;
    }
}
