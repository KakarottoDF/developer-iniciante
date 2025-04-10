public class Acao {
    private String descricao;
    private int mes;
    private int ano;

    public boolean isAcaoPrioritaria(){
        return (getAno() == 2015 || getAno() == 2016);
    }

    public int getTrimestre(){

        return switch (getMes()) {
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
                return "primeiro";
            case 2:
                return "segundo";
            case 3:
                return "terceiro";
            case 4:
                return "quarto";
            default:
                return "trimestre não informado!";
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
        return  "descrição: " + getDescricao() +
                "\nmês: " + getMes() +
                "\nano: " + getAno() +
                "\na ação é prioritária? " + (isAcaoPrioritaria() ? "sim" : "não") +
                "\ntrimestre: " + getNomeTrimestre();
    }
}
