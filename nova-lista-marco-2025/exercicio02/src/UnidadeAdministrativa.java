public class UnidadeAdministrativa {
    Acao[] acoes;
    String nome;
    public final int TRIMESTRE_DESEJADO = 3;

    //criar métodos de regras de negócios
    //findBySemestre
    //findByAno
    //findByPrioridade
    //pensar sempre em criar coisas especializadas

    public Acao[] findEmpresas() {
        return this.acoes;
    }

    public int quantidadeAcoesPorAno() {
        int count = 0;
        for (Acao acao : this.acoes) {
            if (acao.ano == 2017) {
                count++;
            }
        }
        return count;
    }

    private int contarAcoesPorSemestre() {
        int count = 0;
        for (Acao acao : acoes) {
            if (acao.getTrimestre() == TRIMESTRE_DESEJADO) {
                count++;
            }
        }
        return count;
    }

    private Acao[] preencherAcoesPorSemestre(int quantidade) {
        Acao[] acoesTrimestreFinal = new Acao[quantidade];
        int index = 0;

        for (Acao acao : acoes) {
            if (acao.getTrimestre() == TRIMESTRE_DESEJADO) {
                acoesTrimestreFinal[index++] = acao;
            }
        }

        return acoesTrimestreFinal;
    }

    public Acao[] findBySemestre() {
        int quantidadeAcoes = contarAcoesPorSemestre();
        return preencherAcoesPorSemestre(quantidadeAcoes);
    }
}



