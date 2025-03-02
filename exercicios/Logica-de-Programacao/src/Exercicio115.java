/*
SINTESE
    ENTRADA: quantidadeDeFuncionariosDaEmpresa, nomeFuncionario, salarioFuncionario
    PROCESSAMENTO: mediaDeSalariosDaEmpresa, salarioMaisAlto, salarioMaisBaixo
    SAIDA: mediaDeSalariosDaEmpresa, salarioMaisAlto, salarioMaisBaixo
*/

import java.util.Scanner;

public class Exercicio115 {

    public static void main(String[] args) {

        int quantidadeDeFuncionariosDaEmpresa = 0;
        String nomeFuncionario;
        double salarioFuncionario;
        double mediaDeSalariosDaEmpresa = 0;
        double totalDeSalariosDosFuncionarios = 0;
        double salarioMaisAlto = 0;
        double salarioMaisBaixo = 0;
        String controleSistema = "CONTINUE";

        Scanner scan = new Scanner(System.in);

        while(controleSistema.equals("CONTINUE")){

            System.out.print("Digite o nome do funcionário: ");
            nomeFuncionario = scan.nextLine();

            System.out.print("Digite o salário deste funcionário R$ ");
            salarioFuncionario = scan.nextDouble();

            quantidadeDeFuncionariosDaEmpresa++;

            if(salarioMaisAlto == 0 && salarioMaisBaixo == 0){
                salarioMaisAlto = salarioFuncionario;
                salarioMaisBaixo = salarioFuncionario;
            }else{
                if(salarioFuncionario > salarioMaisAlto){
                    salarioMaisAlto = salarioFuncionario;
                }else{
                    if(salarioFuncionario < salarioMaisBaixo){
                        salarioMaisBaixo = salarioFuncionario;
                    }
                }
            }

            totalDeSalariosDosFuncionarios+= salarioFuncionario;
            mediaDeSalariosDaEmpresa = totalDeSalariosDosFuncionarios / quantidadeDeFuncionariosDaEmpresa;


            System.out.print("Deseja encerrar a leitura? Digite fim para encerrar o programa: ");
            scan.nextLine();
            controleSistema = scan.nextLine().toUpperCase();

            if(controleSistema.equals("FIM")){
                continue;
            }else{
                salarioFuncionario = 0;
                controleSistema = "CONTINUE";
            }
        }
        System.out.println("A média dos salários da empresa é de R$ " + mediaDeSalariosDaEmpresa);
        System.out.println("O salário mais alto é de R$ " + salarioMaisAlto);
        System.out.println("O salário mais baixo é de R$ " + salarioMaisBaixo);
    }
}