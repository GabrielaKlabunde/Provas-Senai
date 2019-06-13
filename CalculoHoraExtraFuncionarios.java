package avaliacao;

import java.util.Scanner;

public class Avaliacao {

    public static void main(String[] args) {
        //Declarar variáveis
        Scanner leia = new Scanner(System.in);
        String nomeFuncionario = "";
        String cargoFuncionario = "";
        int salario = 0;
        int tempoServico = 0;
        int codigoFuncionario = 0;
        double aumento = 0;
        double novoSalario = 0;
        int contador = 0;
        //Declarar as informações sobre os cargos
        String gerente = "gerente";
        String engenheiro = "engenheiro";
        String tecnico = "tecnico";
        String aux = "não";
        String resposta;

        //Loop para pedir as informações pro funcionario
        while (true) {
            System.out.println("Informe o Nome do funcionário: ");
            nomeFuncionario = leia.next();
            System.out.println("Informe o Código do funcionário: ");
            codigoFuncionario = leia.nextInt();
            System.out.println("Informe o  Salário do funcionário: ");
            salario = leia.nextInt();
            System.out.println("Informe o tempo de Serviço (em anos) do funcionário: ");
            tempoServico = leia.nextInt();
            System.out.println("Informe o Nome do Cargo do Funcionário: ");
            cargoFuncionario = leia.next();
            // se o cargo não existir
            if (cargoFuncionario != gerente & cargoFuncionario != engenheiro & cargoFuncionario != tecnico) {
            } else if (tempoServico >= 3) {
                System.out.println("Nome do funcionário: " + nomeFuncionario);
                System.out.println("Código do funcionário: " + codigoFuncionario);
                System.out.println("Tempo serviço do funcionario: " + tempoServico);
                System.out.println("Cargo do funcionário não cadastrado. ");
                aumento = (salario * 35) / 100;
                System.out.println("Seu aumento é de R$: " + aumento);
                novoSalario = salario + (salario * 35) / 100;
                System.out.println("Seu novo salario é de R$: " + novoSalario);
                System.out.println("Seu antigo salario é de R$: " + salario);
            }
            //GERENTE= Informações sobre+(calculo do aumento e do salario novo)

            if (gerente.equals(cargoFuncionario)) {
                if (tempoServico == 1) {
                    System.out.println("Nome do funcionário: " + nomeFuncionario);
                    System.out.println("Código do funcionário: " + codigoFuncionario);
                    System.out.println("Tempo serviço do funcionario: " + tempoServico);
                    System.out.println("Cargo do funcionário: " + cargoFuncionario);
                    aumento = (salario * 10) / 100;
                    System.out.println("Seu aumento é de R$: " + aumento);
                    novoSalario = salario + (salario * 10) / 100;
                    System.out.println("Seu novo salario é de R$: " + novoSalario);
                    System.out.println("Seu antigo salario é de R$: " + salario);

                } else if (tempoServico == 2) {
                    System.out.println("Nome do funcionário: " + nomeFuncionario);
                    System.out.println("Código do funcionário: " + codigoFuncionario);
                    System.out.println("Tempo serviço do funcionario: " + tempoServico);
                    System.out.println("Cargo do funcionário: " + cargoFuncionario);
                    aumento = (salario * 20) / 100;
                    System.out.println("Seu aumento é de R$: " + aumento);
                    novoSalario = salario + (salario * 20) / 100;
                    System.out.println("Seu novo salario é de " + novoSalario);
                    System.out.println("Seu antigo salario é de R$: " + salario);

                } else if (tempoServico >= 3) {
                    System.out.println("Nome do funcionário: " + nomeFuncionario);
                    System.out.println("Código do funcionário: " + codigoFuncionario);
                    System.out.println("Tempo serviço do funcionario: " + tempoServico);
                    System.out.println("Cargo do funcionário: " + cargoFuncionario);
                    aumento = (salario * 25) / 100;
                    System.out.println("Seu aumento é de R$: " + aumento);
                    novoSalario = salario + (salario * 25) / 100;
                    System.out.println("Seu salario é de " + novoSalario);
                    System.out.println("Seu antigo salario é de R$: " + salario);

                }    //ENGENHEIRO=Informações sobre+(calculo do aumento e do salario novo)
            }
            if (engenheiro.equals(cargoFuncionario)) {
                if (tempoServico == 1) {
                    System.out.println("Nome do funcionário: " + nomeFuncionario);
                    System.out.println("Código do funcionário: " + codigoFuncionario);
                    System.out.println("Tempo serviço do funcionario: " + tempoServico);
                    System.out.println("Cargo do funcionário: " + cargoFuncionario);
                    aumento = (salario * 15) / 100;
                    System.out.println("Seu aumento é de R$: " + aumento);
                    novoSalario = salario + (salario * 15) / 100;
                    System.out.println("Seu salario é de " + novoSalario);
                    System.out.println("Seu antigo salario é de R$: " + salario);

                } else if (tempoServico == 2) {
                    System.out.println("Nome do funcionário: " + nomeFuncionario);
                    System.out.println("Código do funcionário: " + codigoFuncionario);
                    System.out.println("Tempo serviço do funcionario: " + tempoServico);
                    System.out.println("Cargo do funcionário: " + cargoFuncionario);
                    aumento = (salario * 30) / 100;
                    System.out.println("Seu aumento é de R$: " + aumento);
                    novoSalario = salario + (salario * 30) / 100;
                    System.out.println("Seu salario é de " + novoSalario);
                    System.out.println("Seu antigo salario é de R$: " + salario);

                } else if (tempoServico >= 3) {
                    System.out.println("Nome do funcionário: " + nomeFuncionario);
                    System.out.println("Código do funcionário: " + codigoFuncionario);
                    System.out.println("Tempo serviço do funcionario: " + tempoServico);
                    System.out.println("Cargo do funcionário: " + cargoFuncionario);
                    aumento = (salario * 35) / 100;
                    System.out.println("Seu aumento é de R$: " + aumento);
                    novoSalario = salario + (salario * 35) / 100;
                    System.out.println("Seu salario é de R$" + novoSalario);
                    System.out.println("Seu antigo salario é de R$: " + salario);

                }   //TECNICO =Informações sobre+(calculo do aumento e do salario novo)
            }
            if (tecnico.equals(cargoFuncionario)) {
                if (tempoServico == 1) {
                    System.out.println("Nome do funcionário: " + nomeFuncionario);
                    System.out.println("Código do funcionário: " + codigoFuncionario);
                    System.out.println("Tempo serviço do funcionario: " + tempoServico);
                    System.out.println("Cargo do funcionário: " + cargoFuncionario);
                    aumento = (salario * 5) / 100;
                    System.out.println("Seu aumento é de R$: " + aumento);
                    novoSalario = salario + (salario * 5) / 100;
                    System.out.println("Seu novo salário é de R$: " + novoSalario);
                    System.out.println("Seu antigo salario é de R$: " + salario);

                } else if (tempoServico == 2) {
                    System.out.println("Nome do funcionário: " + nomeFuncionario);
                    System.out.println("Código do funcionário: " + codigoFuncionario);
                    System.out.println("Tempo serviço do funcionario: " + tempoServico);
                    System.out.println("Cargo do funcionário: " + cargoFuncionario);
                    aumento = (salario * 10) / 100;
                    System.out.println("Seu aumento é de R$: " + aumento);
                    novoSalario = salario + (salario * 10) / 100;
                    System.out.println("Seu salario é de R$" + novoSalario);
                    System.out.println("Seu antigo salario é de R$: " + salario);

                } else if (tempoServico >= 3) {
                    System.out.println("Nome do funcionário: " + nomeFuncionario);
                    System.out.println("Código do funcionário: " + codigoFuncionario);
                    System.out.println("Tempo serviço do funcionario: " + tempoServico);
                    System.out.println("Cargo do funcionário: " + cargoFuncionario);
                    aumento = (salario * 15) / 100;
                    System.out.println("Seu aumento é de R$: " + aumento);
                    novoSalario = salario + (salario * 15) / 100;
                    System.out.println("Seu salario é de R$" + novoSalario);
                    System.out.println("Seu antigo salario é de R$: " + salario);
                }
            }
              // perguntar se deseja realizar novamente o reajuste
            System.out.println("Você deseja realizar um novo cálculo?");
            resposta = leia.next();
            if (resposta.equals("não")) {
                break;
            }

        }

    }

}
    

