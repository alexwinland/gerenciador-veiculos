public class Carro extends Veiculo implements Manutencao {
    int numeroPortas;

    public Carro(String placa, int ano, int numeroPortas) {
        super(placa, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularValorSeguro() {
        double valorBase = 1000;
        valorBase += numeroPortas * 100;
        return valorBase;
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção realizada no carro de " + getPlaca() + ".";
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
}
