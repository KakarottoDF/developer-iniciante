public class Endereco {
    private String logradouro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String logradouro, String cidade, String estado, String cep) {
        setLogradouro(logradouro);
        setCidade(cidade);
        setEstado(estado);
        setCep(cep);
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + getLogradouro() + '\'' +
                ", cidade='" + getCidade() + '\'' +
                ", estado='" + getEstado() + '\'' +
                ", cep='" + getCep() + '\'' +
                '}';
    }
}
