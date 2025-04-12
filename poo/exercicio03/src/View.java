public class View{
    public static Laboratorio cadastrarLaboratorio() {
        Laboratorio laboratorio = new Laboratorio();
        laboratorio.setLocal(Reader.lerString("Informe o local deste laboratório: "));

        return laboratorio;
    }

    public static ResponsavelTecnico cadastrarResponsavelTecnico() {
        ResponsavelTecnico responsavelTecnico = new ResponsavelTecnico();
        responsavelTecnico.setMatricula(Reader.lerInt("Informa a matrícula do responsável técnico deste laboratório: "));
        responsavelTecnico.setNome(Reader.lerString("Informe o nome dele: "));
        responsavelTecnico.setCargo(Reader.lerInt("Informe o cargo dele [1]TÉCNICO [2]ANALISTA: ", "Digite somente: [1]TÉCNICO [2]ANALISTA", 1, 2));

        return responsavelTecnico;
    }

    public static Item cadastraItem(){
        int tipo;

        tipo = Reader.lerInt("Informe o tipo do item [1]TECNOLOGIA [2]OUTROS: ", "Digite somente: [1]TECNOLOGIA [2]OUTROS", 1, 2);

        Item item = new Item(tipo);

        item.setDescricao(Reader.lerString("Informe a descrição deste item: "));
        item.setCodigo(Reader.lerString("Informe o código: "));
        item.setPreco(Reader.lerDouble("Informe o preço R$ "));

        return item;
    }

    public static void cadastrar(GerenciadorLaboratorio gerenciadorLaboratorio){
        boolean continuar = true;

        while(continuar){
            Laboratorio laboratorio = cadastrarLaboratorio();
            ResponsavelTecnico responsavel = cadastrarResponsavelTecnico();
            Item item = cadastraItem();
            laboratorio.adicionar(responsavel, item);
            gerenciadorLaboratorio.adicionar(laboratorio);

            continuar = Reader.lerBoolean("Deseja continuar? [S]Sim [N]Não: ", "Digite somente [S]Sim [N]Não", "S", "N");
        }
    }
}
