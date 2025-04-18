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
        String frase;

        frase = getFrase().toUpperCase();
        letra = Character.toUpperCase(letra);

        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            //Percorre o for e retorna o caractere da posição i
            if (c == letra) {
                contador++;
            }
        }

        return contador;
    }

    public int quantidadeDeCaracteres(){
        String frase = getFrase();

        if (frase == null || frase.isEmpty()) {
            return 0;
        }

        return frase.length();
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

        String frase;
        frase = getFrase().trim().toUpperCase();

        if(frase.isEmpty()){
            return 0;
        }

        String[] palavras = frase.split("\\s+");
        // Divide por espaços em branco e a diferença entre \\s+ e " " é que o segundo só quebra em espaços simples. Se tiver vários espaços seguidos (" "), ele considera como vários espaços vazios, e o array vai ter strings vazias no meio.

        return palavras.length;
    }
}
