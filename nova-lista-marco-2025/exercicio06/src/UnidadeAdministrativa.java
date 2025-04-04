public class UnidadeAdministrativa{
    private String nome;
    Acao[] acoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Acao[] getAcoes() {
        return acoes;
    }

    public void setAcoes(Acao[] acoes) {
        this.acoes = acoes;
    }

    public UnidadeAdministrativa(){
        this.acoes = new Acao[0];
    }

    public void adicionar(Acao acao){
        Acao[] novasAcoes = new Acao[acoes.length +1];
        int i = 0;

        for(Acao ac : acoes){
            novasAcoes[i++] = ac;
        }

        novasAcoes[novasAcoes.length -1] = acao;
        setAcoes(novasAcoes);
    }
}
