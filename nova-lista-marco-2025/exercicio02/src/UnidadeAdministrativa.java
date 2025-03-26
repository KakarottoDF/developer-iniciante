public class UnidadeAdministrativa {
    Acao[] acoes;
    String nome;
    public final int TRIMESTRE_DESEJADO = 3;
    public final int ANO_DESEJADO = 2017;

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
            if (acao.ano == ANO_DESEJADO) {
                count++;
            }
        }
        return count;
    }

    private int contarAcoesPorTrimestre() {
        int count = 0;
        for (Acao acao : this.acoes) {
            if (acao.getTrimestre() == TRIMESTRE_DESEJADO) {
                count++;
            }
        }
        return count;
    }

    private Acao[] filtrarAcoesPorTrimestre(int quantidade) {
        Acao[] acoesTrimestreFinal = new Acao[quantidade];
        int index = 0;

        for (Acao acao : acoes) {
            if (acao.getTrimestre() == TRIMESTRE_DESEJADO) {
                acoesTrimestreFinal[index++] = acao;
            }
        }

        return acoesTrimestreFinal;
    }

    public Acao[] findByTrimestre() {
        int quantidadeAcoes = contarAcoesPorTrimestre();
        return filtrarAcoesPorTrimestre(quantidadeAcoes);
    }
}