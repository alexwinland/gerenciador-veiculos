public abstract class Veiculo {
    String placa;
    int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public abstract double calcularValorSeguro();

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
}
