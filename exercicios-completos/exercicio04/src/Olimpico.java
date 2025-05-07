public class Olimpico extends Atleta {
    private int quantidadeDeTitulosMundiais;

    public Olimpico(String nome, char sexo, int idade, int numero, int quantidadeDeTitulosMundiais) {
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
        setNumero(numero);
        setQuantidadeDeTitulosMundiais(quantidadeDeTitulosMundiais);
    }

    public int getQuantidadeDeTitulosMundiais() {
        return this.quantidadeDeTitulosMundiais;
    }

    public void setQuantidadeDeTitulosMundiais(int quantidadeDeTitulosMundiais) {
        this.quantidadeDeTitulosMundiais = quantidadeDeTitulosMundiais;
    }

    @Override
    public double calcularCusto() {
        double custoBase = 10.0 * getQuantidadeDeTitulosMundiais();
        int idadeDesconto = 100 - getIdade();
        return custoBase - idadeDesconto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de Títulos Mundiais: " + getQuantidadeDeTitulosMundiais();
    }
}
