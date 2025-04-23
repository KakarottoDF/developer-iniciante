public class Pessoa extends UsuarioSistema {
    private String nome;
    private int codigoInteiro;
    private double salario;
    private ClasseSocial classeSocial;

    public Pessoa(String nome, int codigoInteiro, double salario) {
        setNome(nome);
        setCodigoInteiro(codigoInteiro);
        setSalario(salario);
        setClasseSocial(classeSocial());
    }

    @Override
    public boolean equals(Object obj) {
        if (/*this*/getPessoa() == obj){
            return true;
        }else{
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
        }
        Pessoa pessoa = (Pessoa) obj;
        return getCodigoInteiro() == pessoa.getCodigoInteiro();
    }

    public ClasseSocial classeSocial() {
        for (ClasseSocial cs : ClasseSocial.values()) {
            if (getSalario() > cs.getRendaMinima()) {
                return cs;
            }
        }
        return null;
    }

    /*public String classeSocial(){
        if(getSalario() > ClasseSocial.A1.getRendaMinima()){
            return ClasseSocial.A1.toString();
        }else{
            if(getSalario() > ClasseSocial.A2.getRendaMinima()) {
                return ClasseSocial.A2.toString();
            }else{
                if(getSalario() > ClasseSocial.B.getRendaMinima()) {
                    return ClasseSocial.B.toString();
                }else{
                    if(getSalario() > ClasseSocial.C.getRendaMinima()) {
                        return ClasseSocial.C.toString();
                    }else{
                        if(getSalario() > ClasseSocial.D.getRendaMinima()) {
                            return ClasseSocial.D.toString();
                        }else{
                            if(getSalario() > ClasseSocial.E.getRendaMinima()) {
                                return ClasseSocial.E.toString();
                            }else{
                                if(getSalario() > ClasseSocial.F.getRendaMinima()) {
                                    return ClasseSocial.F.toString();
                                }
                            }
                        }
                    }
                }
            }
        }
        return "Sua renda não se encaixa em nenhuma classe social.";
    }*/

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoInteiro() {
        return this.codigoInteiro;
    }

    public void setCodigoInteiro(int codigoInteiro) {
        this.codigoInteiro = codigoInteiro;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ClasseSocial getClasseSocial() {
        return this.classeSocial;
    }

    public void setClasseSocial(ClasseSocial classeSocial) {
        this.classeSocial = classeSocial;
    }

    @Override
    public String toString() {
        return  "\nNOME: " + getNome() +
                "\nCÓDIGO: " + getCodigoInteiro() +
                "\nSALÁRIO R$ " + getSalario() +
                "\nCLASSE SOCIAL: " + (getClasseSocial() != null ? getClasseSocial() : "NÃO CLASSIFICADO") +
                "\n";
    }
}
