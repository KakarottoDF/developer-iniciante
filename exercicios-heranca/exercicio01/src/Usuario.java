public class Usuario{
    private String frase;

    public Usuario(String nome){
        setFrase(nome);
    }

    public String getFrase() {
        return this.frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int contarLetraA(){
        int contador = 0;
        char c;
        String frase;

        frase = getFrase().toUpperCase();

        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            //Percorre o for e retorna o caractere da posição i
            if (c == 'A') {
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

    public String qualificacaoDaFrase(){
        String resposta;

        if(quantidadeDeCaracteres() < 10){
            resposta = "PEQUENA";
        }else{
            if(quantidadeDeCaracteres() > 9 && quantidadeDeCaracteres() < 29){
                resposta = "MEDIA";
            }else{
                resposta = "GRANDE";
            }
        }

        return resposta;
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
