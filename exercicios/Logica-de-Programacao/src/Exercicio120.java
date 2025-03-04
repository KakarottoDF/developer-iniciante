/*
SINTESE
    ENTRADA: idade, sexo e salario
    PROCESSAMENTO: mediaDoSalarioDoGrupo, maiorIdade, menorIdade, quantidadeDeMulheresComSalarioDeAte100
    SAIDA: mediaDoSalarioDoGrupo, maiorIdade, menorIdade, quantidadeDeMulheresComSalarioDeAte100
    Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os
dados de idade, sexo (M/F) e salário. Faça um algoritmo que informe:
a) a média de salário do grupo;
b) a maior e a menor idade do grupo;
c) a quantidade de mulheres com salário até R$100,00.
Encerre a entrada de dados quando for digitada uma idade negativa.
*/

import java.util.Scanner;

public class Exercicio120 {

    public static void main(String[] args) {

        int idade;
        String sexo = "";
        double salario;
        double totalSalarios = 0;
        int quantidadeDePessoasDoGrupo = 0;
        double mediaDoSalarioDoGrupo = 0;
        int maiorIdade = 0;
        int menorIdade = 0;
        int quantidadeDeMulheresComSalarioDeAte100 = 0;
        boolean fimPrograma = true;
        int encerraPrograma = 0;
        String validarSexo = "N";

        Scanner scan = new Scanner(System.in);

        while(fimPrograma){

            System.out.print("Digite a sua idade: ");
            idade = scan.nextInt();

            scan.nextLine();

            while(validarSexo.equals("N")){
                System.out.print("Digite o seu sexo [M]Masculino [F]Feminino: ");
                sexo = scan.nextLine().toUpperCase();

                if(sexo.equals("M") || sexo.equals("F")){
                    validarSexo = "S";
                }else{
                    System.out.println("Sexo inválido!");
                    validarSexo = "N";
                }
            }

            System.out.print("Digite o seu salário R$ ");
            salario = scan.nextDouble();

            totalSalarios += salario;
            quantidadeDePessoasDoGrupo++;
            mediaDoSalarioDoGrupo = totalSalarios / quantidadeDePessoasDoGrupo;

            if(quantidadeDePessoasDoGrupo == 1 && maiorIdade == 0){
                maiorIdade = idade;
                menorIdade = idade;
            }else{
                if(idade > maiorIdade){
                    maiorIdade = idade;
                }else{
                    if(idade < menorIdade){
                        menorIdade = idade;
                    }
                }
            }

            if(sexo.equals("F") && salario <= 100){
                quantidadeDeMulheresComSalarioDeAte100++;
            }

            System.out.print("Deseja encerrar o programa? Se sim, digite um número negativo: ");
            encerraPrograma = scan.nextInt();

            if(encerraPrograma < 0){
                fimPrograma = false;
            }else{
                validarSexo = "N";
            }
        }
        System.out.println("A média de salário do grupo é de R$ " + mediaDoSalarioDoGrupo);
        System.out.println("A maior idade do grupo é de " + maiorIdade + " anos.");
        System.out.println("A menor idade do grupo é de " + menorIdade + " anos.");
        System.out.println("A quantidade de mulheres com salário até R$100,00 é de " + quantidadeDeMulheresComSalarioDeAte100 + ".");
    }
}