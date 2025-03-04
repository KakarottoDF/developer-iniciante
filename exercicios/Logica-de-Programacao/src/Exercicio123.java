/*
SINTESE
    ENTRADA: sexo (masculino e feminino), cor dos olhos (azuis, verdes ou castanhos), cor dos cabelos (louros, castanhos, pretos) e idade
    PROCESSAMENTO: maiorIdade, quantidadeDeSexoFemininoEntre18E35Anos, quantidadeDeIndividuosDeOlhosVerdesECabelosLouros
    SAIDA: maiorIdade, quantidadeDeSexoFemininoEntre18E35Anos, quantidadeDeIndividuosDeOlhosVerdesECabelosLouros
*/

import java.util.Scanner;

public class Exercicio123 {

    public static void main(String[] args) {

        char sexo = ' ';
        char corDosOlhos = ' ';
        char corDosCabelos = ' ';
        int idade = 0;
        int finalizarConjuntoDeHabitantes = 0;
        boolean validarSexo = true;
        boolean validarCorDosOlhos = true;
        boolean validarCorDosCabelos = true;
        boolean validarIdade = true;
        int maiorIdade = 0;
        int quantidadeDeSexoFemininoEntre18E35Anos = 0;
        int quantidadeDeIndividuosDeOlhosVerdesECabelosLouros = 0;

        Scanner scan = new Scanner(System.in);

        while(finalizarConjuntoDeHabitantes >= 0 || finalizarConjuntoDeHabitantes <-1){
            while(validarSexo) {
                System.out.print("Digite o sexo M[Masculino] [F]Feminino: ");
                sexo = scan.next().toUpperCase().charAt(0);

                if(sexo == 'F' || sexo == 'M'){
                    validarSexo = false;
                }else{
                    System.out.println("Sexo inválido, digite novamente.");
                }
            }

            while(validarCorDosOlhos) {
                System.out.print("Digite a cor dos seus olhos [A]Azuis [V]Verdes [C]Castanhos: ");
                corDosOlhos = scan.next().toUpperCase().charAt(0);

                if(corDosOlhos == 'A' || corDosOlhos == 'V' || corDosOlhos == 'C'){
                    validarCorDosOlhos = false;
                }else{
                    System.out.println("Cor dos olhos inválida, digite novamente.");
                }
            }

            while(validarCorDosCabelos) {
                System.out.print("Digite a cor dos seus cabelos [L]Louros [C]Castanhos [P]Pretos: ");
                corDosCabelos = scan.next().toUpperCase().charAt(0);

                if(corDosCabelos == 'L' || corDosOlhos == 'C' || corDosOlhos == 'P'){
                    validarCorDosCabelos = false;
                }else{
                    System.out.println("Cor dos olhos inválida, digite novamente.");
                }
            }

            if(corDosOlhos == 'V' && corDosCabelos == 'L'){
                quantidadeDeIndividuosDeOlhosVerdesECabelosLouros++;
            }

            while(validarIdade) {
                System.out.print("Digite a sua idade: ");
                idade = scan.nextInt();

                if(idade > 0){
                    if(idade > maiorIdade){
                        maiorIdade = idade;
                    }
                    validarIdade = false;
                }else{
                    System.out.println("Idade inválida, digite novamente.");
                }
            }
//a quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos, inclusive;
            if(sexo == 'F' && (idade >= 18 && idade <= 35)){
                quantidadeDeSexoFemininoEntre18E35Anos++;
            }

            System.out.println("Deseja finalizar o conjunto de habitantes?");
            System.out.print("Digite -1 para finalizar: ");
            finalizarConjuntoDeHabitantes = scan.nextInt();
            validarSexo = true;
            sexo = ' ';
            validarCorDosOlhos = true;
            corDosOlhos = ' ';
            validarCorDosCabelos = true;
            corDosCabelos = ' ';
            validarIdade = true;
            idade = 0;
        }
        System.out.println("A maior idade dos habitante é de " + maiorIdade + " anos.");
        System.out.println("A quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos é de " + quantidadeDeSexoFemininoEntre18E35Anos + ".");
        System.out.println("A quantidade de indivíduos que tenham olhos verdes e cabelos louros é de " + quantidadeDeIndividuosDeOlhosVerdesECabelosLouros + ".");
    }
}