public class Usuario {
    Franquia[] franquias;
    public int quantidadeDeFranquias;

    public static Usuario quantidadeDeFranquias(){
        int quantidadeDeFranquias = Reader.getInt("Quantas franquias você deseja informar?");
        return quantidadeDeFranquias(quantidadeDeFranquias);
    }

    public static Usuario quantidadeDeFranquias(int totalDeFranquias){
        Usuario usuarios = new Usuario();
        usuarios.quantidadeDeFranquias = totalDeFranquias;
        usuarios.franquias = new Franquia[totalDeFranquias];
        for(int i = 0; i < usuarios.franquias.length; i++){
            usuarios.franquias[i] = Franquia.setFranquia();
        }
        return usuarios;
    }

}
