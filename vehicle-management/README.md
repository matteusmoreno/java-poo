# Sistema de Gerenciamento de Veículos em Java

Este é um projeto de exemplo em Java que demonstra os conceitos de orientação a objetos, herança e polimorfismo. O projeto é um Sistema de Gerenciamento de Veículos, onde diferentes tipos de veículos (carros e motocicletas) podem ser registrados e seus preços médios podem ser calculados.

## Funcionalidades

- Cadastro de veículos do tipo carro e motocicleta.
- Cálculo do valor médio dos veículos cadastrados.

## Estrutura do Projeto

O projeto está organizado em diferentes classes:

- `Vehicle`: Classe base que representa um veículo, contendo atributos como marca, modelo, ano e preço.
- `Car`: Subclasse de `Vehicle` que representa um carro, com detalhes como número de portas e capacidade do porta-malas.
- `Motorcycle`: Subclasse de `Vehicle` que representa uma motocicleta, com detalhes como cilindrada e tipo.
- `VehicleManagement`: Classe responsável por gerenciar a adição de veículos e cálculos estatísticos.
- `Main`: Classe principal que contém o método `main`, onde os veículos são criados, adicionados e o valor médio é calculado.

## Como Usar

1. Clone este repositório para sua máquina local.
2. Compile e execute o código Java.

```properties
javac Main.java
java Main
```

3. O programa exibirá os detalhes dos veículos cadastrados e o valor médio dos veículos.

## Contribuição

Sinta-se à vontade para contribuir com melhorias, correções ou adições a este projeto. Basta abrir uma issue ou enviar um pull request.


