import java.util.ArrayList;

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        ArrayList<Veiculo> frota = new ArrayList<>();

        frota.add(new Carro("ABC-1234", 2020, 4));
        frota.add(new Moto("DEF-5678", 2018, 150));

        for (Veiculo veiculo : frota) {

            veiculo.exibirDetalhes();

            System.out.println("Valor do seguro: R$ " + veiculo.calcularValorSeguro());

            if (veiculo instanceof Manutencao) {
                Manutencao manutencao = (Manutencao) veiculo;
                System.out.println(manutencao.realizarManutencao());
            }

            System.out.println("------------------------------");
        }
    }
}
