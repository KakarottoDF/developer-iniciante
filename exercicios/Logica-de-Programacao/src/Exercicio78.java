/*
SINTESE
    ENTRADA: i, a, b, c
    PROCESSAMENTO: ordemCrescente, ordemDecrescente, maiorValorNoMeio
    SAIDA: ordemCrescente, ordemDecrescente, maiorValorNoMeio
*/

import java.util.Scanner;

public class Exercicio78 {

    public static void main(String[] args) {

        int i;
        double a;
        double b;
        double c;

        i = lerInteiro("Digite um valor entre 1 e 3: ");

        switch(i){
            case 1:
                a = lerDouble("Digite a 1ª valor: ");
                b = lerDouble("Digite a 2ª valor: ");
                c = lerDouble("Digite a 3ª valor: ");

                ordemDecrescente(a, b, c);
                break;
            case 2:
                a = lerDouble("Digite a 1ª valor: ");
                b = lerDouble("Digite a 2ª valor: ");
                c = lerDouble("Digite a 3ª valor: ");

                ordemCrescente(a, b, c);
                break;
            case 3:
                a = lerDouble("Digite a 1ª valor: ");
                b = lerDouble("Digite a 2ª valor: ");
                c = lerDouble("Digite a 3ª valor: ");

                maiorNumeroNoMeio(a, b, c);
                break;
            default:
                System.out.println("Número inválido. Programa Encerrado");
                break;
        }
}

    public static int lerInteiro(String msg) {
        System.out.print(msg);
        return lerInteiro();
    }

    public static int lerInteiro() {
        return new Scanner(System.in).nextInt();
    }

    public static double lerDouble(String msg) {
        System.out.print(msg);
        return lerDouble();
    }

    public static double lerDouble() {
        return new Scanner(System.in).nextDouble();
    }

    public static void ordemDecrescente(double num1, double num2, double num3) {
        System.out.println("ORDEM DECRESCENTE");
        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.print(num1 + " | " + num2 + " | " + num3);
        } else {
            if ((num1 > num2 && num1 > num3 && num3 > num2)) {
                System.out.print(num1 + " | " + num3 + " | " + num2);
            } else {
                if ((num2 > num1 && num2 > num3 && num1 > num3)) {
                    System.out.print(num2 + " | " + num1 + " | " + num3);
                } else {
                    if ((num2 > num1 && num2 > num3 && num3 > num1)) {
                        System.out.print(num2 + " | " + num3 + " | " + num1);
                    } else {
                        if ((num3 > num1 && num3 > num2 && num1 > num2)) {
                            System.out.print(num3 + " | " + num1 + " | " + num2);
                        } else {
                            if ((num3 > num1 && num3 > num2 && num2 > num1)) {
                                System.out.print(num3 + " | " + num2 + " | " + num1);
                            }
                        }
                    }
                }
            }
        }
    }
    public static void ordemCrescente(double num1, double num2, double num3){
        System.out.println("ORDEM CRESCENTE");
        if (num1 < num2 && num1 < num3 && num2 < num3) {
            System.out.print(num1 + " | " + num2 + " | " + num3);
        } else {
            if ((num1 < num2 && num1 < num3 && num3 < num2)) {
                System.out.print(num1 + " | " + num3 + " | " + num2);
            } else {
                if ((num2 < num1 && num2 < num3 && num1 < num3)) {
                    System.out.print(num2 + " | " + num1 + " | " + num3);
                } else {
                    if ((num2 < num1 && num2 < num3 && num3 < num1)) {
                        System.out.print(num2 + " | " + num3 + " | " + num1);
                    } else {
                        if ((num3 < num1 && num3 < num2 && num1 < num2)) {
                            System.out.print(num3 + " | " + num1 + " | " + num2);
                        } else {
                            if ((num3 < num1 && num3 < num2 && num2 < num1)) {
                                System.out.print(num3 + " | " + num2 + " | " + num1);
                            }
                        }
                    }
                }
            }
        }
    }
    public static void maiorNumeroNoMeio(double num1, double num2, double num3) {
        System.out.println("MAIOR NÚMERO NO MEIO");
        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.print(num2 + " | " + num1 + " | " + num3);
        } else {
            if ((num1 > num2 && num1 > num3 && num3 > num2)) {
                System.out.print(num3 + " | " + num1 + " | " + num2);
            } else {
                if ((num2 > num1 && num2 > num3 && num1 > num3)) {
                    System.out.print(num1 + " | " + num2 + " | " + num3);
                } else {
                    if ((num2 > num1 && num2 > num3 && num3 > num1)) {
                        System.out.print(num3 + " | " + num2 + " | " + num1);
                    } else {
                        if ((num3 > num1 && num3 > num2 && num1 > num2)) {
                            System.out.print(num1 + " | " + num3 + " | " + num2);
                        } else {
                            if ((num3 > num1 && num3 > num2 && num2 > num1)) {
                                System.out.print(num2 + " | " + num3 + " | " + num1);
                            }
                        }
                    }
                }
            }
        }
    }
}