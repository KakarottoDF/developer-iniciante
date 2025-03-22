import java.util.Scanner;

public class Reader{
    public int getInt(){
        return new Scanner(System.in).nextInt();
    }

    public int getInt(String msg){
        System.out.print(msg);
        return getInt();
    }

    public double getDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public double getDouble(String msg){
        System.out.print(msg);
        return getDouble();
    }

    public String getString(){
        return new Scanner(System.in).nextLine().trim().toLowerCase();
    }

    public String getString(String msg){
        System.out.print(msg);
        return getString();
    }

    public Anatel setQuantidadeDeFranquias(){
        int quantidadeDeFranquias = getInt("Quantas franquias você deseja informar? ");
        return setQuantidadeDeFranquias(quantidadeDeFranquias);
    }

    public Anatel setQuantidadeDeFranquias(int totalDeFranquias){
        Anatel anatel = new Anatel();
        anatel.quantidadeDeFranquias = totalDeFranquias;
        anatel.franquias = new Franquia[totalDeFranquias];
        for(int i = 0; i < anatel.franquias.length; i++){
            anatel.franquias[i] = setFranquia();
        }
        return anatel;
    }

    public Franquia setFranquia(){
        Franquia franquias = new Franquia();
        franquias.quantidadeDeGB = getInt("Digite a quantidade de GB: ");
        franquias.diaDeExpiracao = getString("Digite o dia de expiração: ");
        franquias.preco = getDouble("Digite o preço da franquia: R$ ");
        franquias.nomeDaEmpresa = getString("Qual é o nome da empresa que fornece o serviço: ");

        return franquias;
    }
}
