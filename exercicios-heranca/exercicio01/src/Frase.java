public class Frase {
    private String frase;

    public Frase(String nome){
        setFrase(nome);
    }

    public String getFrase() {
        return this.frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int contarLetraA(char letra){
        int contador = 0;
        char c;

        letra = Character.toUpperCase(letra);

        for (int i = 0; i < getFrase().length(); i++) {
            c = frase.charAt(i);
            //Percorre o for e retorna o caractere da posição i
            if (c == letra) {
                contador++;
            }
        }

        return contador;
    }

    public int quantidadeDeCaracteres(){
        if (getFrase() == null || getFrase().isEmpty()) {
            return 0;
        }
        return getFrase().length();
    }

    public Tamanho qualificacaoDaFrase(){

        if(quantidadeDeCaracteres() < 10){
            return Tamanho.PEQUENA;
        }else{
            if(quantidadeDeCaracteres() > 9 && quantidadeDeCaracteres() < 29){
                return Tamanho.MEDIA;
            }else{
                return Tamanho.GRANDE;
            }
        }
    }

    public int quantidadeDePalavras(){
        if(getFrase().isEmpty()){
            return 0;
        }

        String[] palavras = getFrase().split("\\s+");
        // Divide por espaços em branco e a diferença entre \\s+ e " " é que o segundo só quebra em espaços simples. Se tiver vários espaços seguidos (" "), ele considera como vários espaços vazios, e o array vai ter strings vazias no meio.

        return palavras.length;
    }
}
