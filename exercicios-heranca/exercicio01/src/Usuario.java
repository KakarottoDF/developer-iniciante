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
            if (c == 'A') {
                contador++;
            }
        }

        return contador;
    }
}
