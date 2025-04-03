public class View {

    public static Documento cadastrarDocumento(){
        Documento documentos = new Documento();

        documentos.setNomeDoArquivo(Reader.lerString("Informe o nome do arquivo: "));
        documentos.setExtensao(Reader.lerString("Informe a extensão do arquivo: "));
        documentos.setTamanhoEmBytes(Reader.lerInt("Informe o tamanho do arquivo em bytes: "));

        return documentos;
    }

    public static Pasta cadastrarPasta(){
        Pasta pasta = new Pasta();
        boolean continuar = true;

        while(continuar){
            pasta.adicionar(cadastrarDocumento());
            int controlarSaida = Reader.lerInt("Deseja sair do sistema? [1]Sim [2]Não: ", "Digite somente 1 ou 2", 1, 2);
            if(controlarSaida == 1){
                continuar = false;
            }
        }
        return pasta;
    }
}
