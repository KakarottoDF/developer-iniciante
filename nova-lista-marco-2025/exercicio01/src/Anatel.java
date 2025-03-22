public class Anatel {
    Franquia[] franquias;
    public int quantidadeDeFranquias;

    public int contarFranquiasPorEmpresa(String empresa){
        int contador = 0;
        for(Franquia franquia: franquias){
            if(franquia.nomeDaEmpresa.equalsIgnoreCase(empresa)){
                contador++;
            }
        }
        return contador;
    }

    public int contarFranquiasporGB(int limite){
        int contador = 0;
        for(Franquia franquia : franquias){
            if(franquia.quantidadeDeGB > limite){
                contador++;
            }
        }
        return contador;
    }

    public String franquiaMaisBarata(){
        double menor = Double.MAX_VALUE;
        String franquiaBarata = "";

        for(Franquia franquia : franquias){
            if(franquia.preco < menor){
                menor = franquia.preco;
                franquiaBarata = franquia.nomeDaEmpresa;
            }
        }
        return franquiaBarata;
    }

    public double somarFranquias(){
        double soma = 0;
        for(Franquia franquia : franquias){
            soma += franquia.preco;
        }
        return soma;
    }

    public double mediaFranquias(){
        return somarFranquias() / this.quantidadeDeFranquias;
    }
}