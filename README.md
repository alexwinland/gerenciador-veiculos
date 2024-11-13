# Gerenciador de Veículos

Este é um projeto simples em Java para **gerenciamento de uma frota de veículos**. Ele simula o gerenciamento de veículos de diferentes tipos, como **carros** e **motos**, calculando o valor do seguro e realizando manutenções de acordo com as características específicas de cada tipo de veículo.

## Funcionalidades

- **Gerenciamento de veículos**: O sistema permite adicionar veículos do tipo **Carro** e **Moto** a uma lista.
- **Cálculo do valor do seguro**: O valor do seguro é calculado de acordo com a quantidade de portas do carro ou a cilindrada da moto.
- **Manutenção dos veículos**: Cada veículo pode ter sua manutenção realizada, com uma mensagem indicando que a manutenção foi concluída.
- **Exibição dos detalhes**: O sistema exibe os detalhes de cada veículo, como placa, ano e valor do seguro.

## Tecnologias Usadas

- **Java 8 ou superior**: A linguagem de programação usada para implementar o projeto.
- **IDE de sua escolha** (como VS Code, Eclipse, IntelliJ IDEA ou NetBeans): Para desenvolver e rodar o código Java.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes e interface:

1. **`Veiculo` (Classe Abstrata)**: Define os atributos e métodos comuns para todos os tipos de veículos. Possui:
   - Atributos: `placa` (String) e `ano` (int).
   - Método abstrato `calcularValorSeguro()`, que é implementado pelas subclasses.
   - Método concreto `exibirDetalhes()`, que exibe os detalhes do veículo.
   
2. **`Manutencao` (Interface)**: Define o método `realizarManutencao()`, que deve ser implementado por todos os veículos para indicar que a manutenção foi realizada.

3. **`Carro` (Subclasse de `Veiculo`)**: Representa um carro e implementa os métodos necessários. Adiciona o atributo `numeroPortas` (int) e calcula o valor do seguro com base nas portas do carro.
   - Implementa a interface `Manutencao` para realizar a manutenção do carro.

4. **`Moto` (Subclasse de `Veiculo`)**: Representa uma moto e implementa os métodos necessários. Adiciona o atributo `cilindrada` (int) e calcula o valor do seguro com base na cilindrada da moto.
   - Implementa a interface `Manutencao` para realizar a manutenção da moto.

5. **`GerenciadorVeiculos` (Classe Principal)**: Responsável por criar e gerenciar a lista de veículos. Adiciona instâncias de `Carro` e `Moto` à lista, exibe os detalhes, calcula o seguro e realiza a manutenção.

## Como Usar

### 1. **Clone o Repositório**

Para clonar este repositório, execute o comando abaixo no seu terminal:

```bash
git clone https://github.com/seu-usuario/gerenciador-veiculos.git
```

### 2. **Compilar e Executar o Projeto**

- Abra o projeto na IDE de sua escolha (VS Code, Eclipse, IntelliJ IDEA, NetBeans, etc.).
- Certifique-se de ter o **Java 8 ou superior** instalado.
- Compile e execute a classe **`GerenciadorVeiculos`**.

### 3. **Resultado Esperado**

Ao rodar o projeto, a saída será exibida no console com detalhes sobre cada veículo, incluindo o valor do seguro calculado e a execução da manutenção. Exemplo de saída:

```
Placa: ABC-1234
Ano: 2020
Valor do seguro: R$ 1400.0
Manutenção realizada no carro de ABC-1234.
------------------------------
Placa: DEF-5678
Ano: 2018
Valor do seguro: R$ 2000.0
Manutenção realizada na moto de DEF-5678.
------------------------------
```

## Arquitetura

- **Classe Abstrata `Veiculo`**: Serve como base para as subclasses `Carro` e `Moto`, garantindo que ambas implementem os métodos necessários, como o cálculo do seguro e a manutenção.
- **Interface `Manutencao`**: Define um contrato para veículos que devem realizar manutenção.
- **Subclasses `Carro` e `Moto`**: Cada uma implementa o cálculo do valor do seguro de maneira diferente e fornece uma implementação para o método de manutenção.
- **Classe Principal `GerenciadorVeiculos`**: Organiza a execução do sistema, gerenciando a lista de veículos e realizando as ações de exibição, cálculo e manutenção.

## Contribuições

Se você deseja contribuir para este projeto, fique à vontade para abrir um **pull request**. Se você encontrar algum problema ou tiver sugestões de melhorias, por favor, **abra uma issue**.
