public class Printer{
    public static void print(Pasta pasta){
        System.out.println("----- PASTAS E DOCUMENTOS -----");
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
}
