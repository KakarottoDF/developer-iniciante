import java.util.Scanner;

public class Read{
    public String setString(){
        return new Scanner(System.in).nextLine().toUpperCase();
    }

    public String setString(String msg){
        System.out.print(msg);
        return setString();
    }

    public String setString(String msg, String msgError, String primeiraEntrada, String segundaEntrada){
        String entrada;
        do{
            entrada = setString(msg);
            if(entrada.equalsIgnoreCase(primeiraEntrada) || entrada.equalsIgnoreCase(segundaEntrada)){
                System.out.println(msgError);
            }
        }while(entrada.equalsIgnoreCase(primeiraEntrada) || entrada.equalsIgnoreCase(segundaEntrada));
        return entrada;
    }

    public int setInt(){
        return new Scanner(System.in).nextInt();
    }

    public int setInt(String msg){
        System.out.print(msg);
        return setInt();
    }

    public double setDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public double setDouble(String msg){
        System.out.print(msg);
        return setDouble();
    }

    public Laboratorio setLaboratorio(){
        Laboratorio laboratorios = new Laboratorio();

        laboratorios.local = setString("Informe o local deste laboratório: ");

        int qtdItens = setInt("Quantos itens tem neste laboratório? ");

        laboratorios.itens = new Item[qtdItens];
        for (int i = 0; i < laboratorios.itens.length; i++){
            laboratorios.itens[i] = setItem();
        }

        laboratorios.responsaveisTecnicos = setResponsavelTecnico();

        return laboratorios;
    }

    public ResponsavelTecnico setResponsavelTecnico(){
        ResponsavelTecnico responsavelTecnico = new ResponsavelTecnico();

        responsavelTecnico.matricula = setString("Informe a matrícula do responsável técnico: ");
        responsavelTecnico.nome = setString("Informe o nome do responsável técnico do laboratório: ");
        responsavelTecnico.cargo = setString("Informe o cargo do responsável técnico do laboratório: ", "Digite somente TECNICO ou ANALISTA!", "TECNICO", "ANALISTA");

        return  responsavelTecnico;
    }

    public Item setItem(){
        Item itens = new Item();
        itens.descricao = setString("Informe a descrição deste item: ");
        itens.codigo = setString("Informe o código deste item: ");
        itens.preco = setDouble("Informe o preço deste item: R$ ");
        itens.tipo = setString("Informe o tipo deste item (TECNOLOGIA ou OUTROS: ", "Digite somente TECNOLOGOA ou OUTROS!", "TECNOLOGIA", "OUTROS");

        return itens;
    }
}
