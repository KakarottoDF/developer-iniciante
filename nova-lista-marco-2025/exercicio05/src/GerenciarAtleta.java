public class GerenciarAtleta{
    Atleta[] atletas;

    public Atleta[] findAtletas(){
        return this.atletas;
    }

    public boolean validarNumeroDeIncricao(int inscricao) {
        for (Atleta atleta : this.atletas) {
            if (atleta != null && atleta.getInscricao() == inscricao) {
                return true;
            }
        }
        return false;
    }
}
