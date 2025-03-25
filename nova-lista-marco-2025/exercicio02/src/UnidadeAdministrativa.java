public class UnidadeAdministrativa {
    Acao[] acoes;
    String nome;

    //criar métodos de regras de negócios
    //findBySemestre
    //findByAno
    //findByPrioridade
    //pensar sempre em criar coisas especializadas

    public Acao[] findEmpresas() {
        return this.acoes;
    }

    public int quantidadeAcoesPrioritarias(UnidadeAdministrativa unidadeAdministrativa){
        int count = 0;

        for(Acao acao: unidadeAdministrativa.acoes){
            if(acao.isAcaoPrioritaria()){
                count++;
            }
        }

            return count;
    }

}


