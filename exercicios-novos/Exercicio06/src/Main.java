/*
SINTESE
    ENTRADA: primeiroValor, segundoValor
    PROCESSAMENTO: fatorial, maior, numeroPar, numeroPrimo
    SAIDA: resultado
*/
public class Main{
    public static void main(String[] args) {
        MyMath usuario = new MyMath();

        while(usuario.continuarPrograma.equals("S")) {

            usuario.primeiroValor = MyMath.lerValores("Insira um valor: ");
            System.out.println(MyMath.fatorial(usuario.primeiroValor));

            usuario.primeiroValor = MyMath.lerValores("Insira o primeiro valor: ");
            usuario.segundoValor = MyMath.lerValores("Insira o segundo valor: ");
            System.out.println("O maior número digitado foi " + MyMath.maiorNumero(usuario.primeiroValor, usuario.segundoValor));

            usuario.primeiroValor = MyMath.lerValores("Insira um valor: ");
            System.out.println(MyMath.numeroPar(usuario.primeiroValor));

            usuario.primeiroValor = MyMath.lerValores("Insira um valor: ");
            System.out.println(MyMath.numeroPrimo(usuario.primeiroValor));

            usuario.continuarPrograma = MyMath.lerContinuarPrograma("Deseja continuar com o programa? [S]Sim [N]Não: ");
            MyMath.validarContinuarPrograma(usuario.continuarPrograma);

        }
    }
}
