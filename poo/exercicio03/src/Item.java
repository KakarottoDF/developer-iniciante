public class Item{
    private String descricao;
    private String codigo;
    private double preco;
    private final int TIPO; //(TECNOLOGIA OU OUTROS)

    public Item(int tipo){
        this.TIPO = tipo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTIPO() {
        return this.TIPO;
    }

    @Override
    public String toString() {
        return "\nItens deste Laboratório: " +
                "\nDescrição: " + getDescricao() +
                "\nCódigo: " + getCodigo() +
                "\nPreço: " + getPreco() +
                "\nTipo: " + (getTIPO() == 1 ? "TECNOLOGIA" : "OUTROS") + "\n";
    }
}
