public class Endereco {
    private String logradouro;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, String cidade, String estado) {
        setLogradouro(logradouro);
        setCidade(cidade);
        setEstado(estado);
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

    @Override
    public String toString() {
        return  "\nENDEREÇO: " + getLogradouro() + '\'' +
                "\nCIDADE: " + getCidade() + '\'' +
                "\nESTADO: " + getEstado();
    }
}
