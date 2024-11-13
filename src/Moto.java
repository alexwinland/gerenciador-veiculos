public class Moto extends Veiculo implements Manutencao {
    int cilindrada;

    public Moto(String placa, int ano, int cilindrada) {
        super(placa, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularValorSeguro() {
        double valorBase = 500;
        valorBase += cilindrada * 2;
        return valorBase;
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção realizada na moto de " + getPlaca() + ".";
    }

    public int getCilindrada() {
        return cilindrada;
    }
}
