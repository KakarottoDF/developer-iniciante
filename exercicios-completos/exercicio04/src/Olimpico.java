public class Olimpico extends Atleta{
    private int quantidadeDeTitulosMundiais;

    public Olimpico(String nome, char sexo, int idade, int numero, int quantidadeDeTitulosMundiais) {
        super(nome, sexo, idade, numero);
        setQuantidadeDeTitulosMundiais(quantidadeDeTitulosMundiais);
    }

    public int getQuantidadeDeTitulosMundiais() {
        return this.quantidadeDeTitulosMundiais;
    }

    public void setQuantidadeDeTitulosMundiais(int quantidadeDeTitulosMundiais) {
        this.quantidadeDeTitulosMundiais = quantidadeDeTitulosMundiais;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
               "\nSexo: " + getSexo() +
               "\nIdade: " + getIdade() +
               "\nNúmero: " + getNumero() +
               "quantidadeDeTitulosMundiais=" + getQuantidadeDeTitulosMundiais();
    }
}
