import java.util.Arrays;

public class Pasta {
    private int ano;
    private Documento[] documentos;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pasta(){
        this.documentos = new Documento[0];
    }

    public void setDocumentos(Documento[] documento){
        this.documentos = documento;
    }

    public Documento[] getDocumentos(){
        return this.documentos;
    }

    public void adicionar(Documento documento){
        Documento[] novosDocumentos = new Documento[documentos.length +1];

        for (int i = 0; i < documentos.length; i++) {
            novosDocumentos[i] = documentos[i];
        }

        novosDocumentos[novosDocumentos.length -1] = documento;
        setDocumentos(novosDocumentos);
    }

    @Override
    public String toString() {
        return "Pasta{" +
                "ano=" + getAno() +
                ", documentos=" + Arrays.toString(documentos) +
                '}';
    }
}
