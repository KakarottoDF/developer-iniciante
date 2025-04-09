public class Acao {
    private String descricao;
    private int mes;
    private int ano;

    public boolean isAcaoPrioritaria(){
        return (getAno() == 2015 || getAno() == 2016);
    }

    public int getTrimestre(){

        return switch (this.mes) {
            case 1, 2, 3 -> 1;
            case 4, 5, 6 -> 2;
            case 7, 8, 9 -> 3;
            case 10, 11, 12 -> 4;
            default -> 0;
        };
    }

    public String getNomeTrimestre(){
        switch (getTrimestre()) {
            case 1:
                return "Primeiro";
            case 2:
                return "Segundo";
            case 3:
                return "Terceiro";
            case 4:
                return "Quarto";
            default:
                return "Trimestre não informado!";
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return  "Descrição: " + getDescricao() +
                "\nMês: " + getMes() +
                "\nAno: " + getAno() +
                "\nA ação é prioritária? " + (isAcaoPrioritaria() ? "Sim" : "Não") +
                "\nTrimestre: " + getNomeTrimestre();
    }
}
