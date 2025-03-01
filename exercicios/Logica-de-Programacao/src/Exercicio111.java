/*
SINTESE
    ENTRADA: quantidadeDeGrupoDeAlunos, valorDeUtilizacaoDeCadaAluno
    PROCESSAMENTO: % de alunos que utilizaram - de 10 X orestaurante, % de alunos que utilizaram entre 10 e 15 X e % de alunos que utilizaram acima de 15
    SAIDA: porcentagemDeAlunosMenosDeDezVezes, porcentagemDeAlunosEntreDezEQuinzeVezes, porcentagemDeAlunosAcimaDeQuinzeVezes
*/

import java.util.Scanner;

public class Exercicio111 {

    public static void main(String[] args) {
        String escolha = "N";
        int quantidadeDeGrupoDeAlunos;
        int valorDeUtilizacaoDeCadaAluno;
        int quantidadeDeAlunosMenosDeDezVezes = 0;
        double porcentagemDeAlunosMenosDeDezVezes = 0;
        int quantidadeDeAlunosEntreDezEQuinzeVezes = 0;
        double porcentagemDeAlunosEntreDezEQuinzeVezes = 0;
        int quantidadeDeAlunosAcimaDeQuinzeVezes = 0;
        double porcentagemDeAlunosAcimaDeQuinzeVezes = 0;

        Scanner scan = new Scanner(System.in);

        while(escolha.equals("N")){
            System.out.print("Digite a quantidade de alunos que irá responder a pesquisa: ");
            quantidadeDeGrupoDeAlunos = scan.nextInt();

            for(int i = 1; i <= quantidadeDeGrupoDeAlunos; i++){
                System.out.println("Aluno " + i + ", qual o número de vezes que utilizou o restaurante da universidade no último mês: ");
                valorDeUtilizacaoDeCadaAluno = scan.nextInt();

                if(valorDeUtilizacaoDeCadaAluno < 10){
                    quantidadeDeAlunosMenosDeDezVezes++;
                    porcentagemDeAlunosMenosDeDezVezes = (quantidadeDeAlunosMenosDeDezVezes * 100.0) / quantidadeDeGrupoDeAlunos;
                    }else{
                        if(valorDeUtilizacaoDeCadaAluno >= 10 && valorDeUtilizacaoDeCadaAluno < 15){
                            quantidadeDeAlunosEntreDezEQuinzeVezes++;
                            porcentagemDeAlunosEntreDezEQuinzeVezes = (quantidadeDeAlunosEntreDezEQuinzeVezes * 100.0) / quantidadeDeGrupoDeAlunos;
                        }else{
                            if(valorDeUtilizacaoDeCadaAluno > 15){
                                quantidadeDeAlunosAcimaDeQuinzeVezes++;
                                porcentagemDeAlunosAcimaDeQuinzeVezes = (quantidadeDeAlunosAcimaDeQuinzeVezes * 100.0) / quantidadeDeGrupoDeAlunos;
                            }
                        }
                    }
            
            }
            System.out.printf("Percentual de alunos que utilizaram menos que 10 vezes o restaurante = %.2f%%\n", porcentagemDeAlunosMenosDeDezVezes);
            System.out.printf("Percentual de alunos que utilizaram entre 10 e 15 vezes o restaurante = %.2f%%\n", porcentagemDeAlunosEntreDezEQuinzeVezes);
            System.out.printf("Percentual de alunos que utilizaram o restaurante acima de 15 vezes = %.2f%%\n", porcentagemDeAlunosAcimaDeQuinzeVezes);

            System.out.println("Deseja sair do sistema?\n[S]Sim [N]Não");
            scan.nextLine();
            escolha = scan.nextLine().toUpperCase();

            quantidadeDeGrupoDeAlunos = 0;
            valorDeUtilizacaoDeCadaAluno = 0;
            quantidadeDeAlunosMenosDeDezVezes = 0;
            porcentagemDeAlunosMenosDeDezVezes = 0;
            quantidadeDeAlunosEntreDezEQuinzeVezes = 0;
            porcentagemDeAlunosEntreDezEQuinzeVezes = 0;
            quantidadeDeAlunosAcimaDeQuinzeVezes = 0;
            porcentagemDeAlunosAcimaDeQuinzeVezes = 0;
        }

    }
}