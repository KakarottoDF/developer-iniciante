public class GerenciarAtleta{
    Atleta[] atletas;

    public Atleta[] findAtletas(){
        return this.atletas;
    }

    public boolean validarNumeroDeIncricao(int inscricao) {
        for (int i = 0; i < this.atletas.length; i++) {
            if (this.atletas[i] != null && this.atletas[i].getInscricao() == inscricao) {
                return true;
            }
        }
        return false;
    }
}
