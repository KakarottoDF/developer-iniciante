public class Printer{
    public static void print(Pasta pasta){
        System.out.println("----- PASTA -----");
        System.out.println("Ano: " + pasta.getAno());
        Documento[] documentos = pasta.getDocumentos();
        print(documentos);
    }

    public static void print(Documento[] documentos){
        for(Documento documento : documentos){
            print(documento);
            System.out.println("___");
        }
    }

    public static void print(Documento documento){
        System.out.println(documento.toString());
    }

    public static void menu(){
        System.out.println("------ APP4U MENU ------");
        System.out.println("1 - Cadastrar Pasta");
        System.out.println("2 - Imprimir Pastas Cadastradas");
        System.out.println("3 - Imprimir Documentos de Todas as Pastas");
        System.out.println("4 - Imprimir Documentos de 2021");
        System.out.println("5 - Tamanho em Bytes de Todo o Armazenamento da Empresa");
        System.out.println("6 - Imprimir Documentos em Demanda");
    }

    public static void printDocumentos(Pasta pasta) {
        System.out.println("Documentos cadastrados na pasta de " + pasta.getAno() + ":");
        for (Documento doc : pasta.getDocumentos()) {
            System.out.println(doc);
        }
    }

    public static void printDocumentosPorAno(Pasta pasta, int ano) {
        if (pasta.getAno() == ano) {
            for (Documento doc : pasta.getDocumentos()) {
                System.out.println(doc);
            }
        } else {
            System.out.println("Nenhuma pasta encontrada para o ano de " + ano);
        }
    }

    public static void printDocumentosPorExtensao(Pasta pasta, String extensao) {
        for (Documento doc : pasta.getDocumentos()) {
            if (doc.getExtensao().equalsIgnoreCase(extensao)) {
                System.out.println(doc);
            }
        }
    }
}
