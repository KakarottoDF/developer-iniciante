public class Item{
    private String descricao;
    private String codigo;
    private double preco;
    private int tipo; //(TECNOLOGIA OU OUTROS)

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

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nItens deste Laboratório: " +
                "\nDescrição: " + getDescricao() +
                "\nCódigo: " + getCodigo() +
                "\nPreço: " + getPreco() +
                "\nTipo: " + (getTipo() == 1 ? "TECNOLOGIA" : "OUTROS") + "\n";
    }
}
