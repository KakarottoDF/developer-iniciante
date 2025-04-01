

public class Anatel {
   Franquia []franquias;

   public Anatel(){
       this.franquias = new Franquia[0];
   }

    public boolean adicionar(Franquia franquia) {

        for (Franquia f : franquias) {
            if (f != null && f.codigo.equals(franquia.codigo)) {
                System.out.println("Franquia já cadastrada.");
                return false;
            }
        }

        // Cria um novo array com +1 posição e copia os valores
        Franquia[] novoArray = new Franquia[franquias.length + 1];
        for (int i = 0; i < franquias.length; i++) {
            novoArray[i] = franquias[i];
        }
        novoArray[franquias.length] = franquia;
        franquias = novoArray; // Atualiza o array

        return true;
    }

   public int countFranquiasByGB(int limite){
       int count = 0;

       for(Franquia franquia : franquias){
           if(franquia != null && franquia.quantidadeGB > limite){
               count++;
           }
       }
       return count;
   }

    public Franquia[] getFranquias() { // Método para acessar o array
        return franquias;
    }
}