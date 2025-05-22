public class View {

    public static AgentePublico alimentarAgentePublico(){
        return new AgentePublico(
                Reader.lerString("NOME DO AGENTE: "),
                Reader.lerString("MATRÍCULA: ")
        );
    }

    public static Facultativo alimentarArrayFacultativo(){
        AgentePublico agente = alimentarAgentePublico();
        String assunto = Reader.lerString("ASSUNTO: ");


        String exposicao = Reader.lerString("EXPOSIÇÃO DE MOTIVOS: ");

        return new Facultativo(
                agente,
                assunto,
                exposicao,
                Reader.lerString("CONCLUSÃO: ")
        );
    }

    public static void cadastrarFacultativo(ControleDeAtosAdministrativos controleDeAtosAdministrativos){
        boolean continuar = true;

        while (continuar) {
            controleDeAtosAdministrativos.adicionar(alimentarArrayFacultativo());

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO: ", "S", "N");
        }
    }

    public static Tecnico alimentarArrayTecnico(){
        AgentePublico agente = alimentarAgentePublico();
        String assunto = Reader.lerString("ASSUNTO: ");

        String exposicao = Reader.lerString("EXPOSIÇÃO DE MOTIVOS: ");

        return new Tecnico(
                agente,
                assunto,
                exposicao,
                Reader.lerString("NOTA TÉCNICA: ")
        );
    }

    public static void cadastrarTecnico(ControleDeAtosAdministrativos controleDeAtosAdministrativos){
        boolean continuar = true;

        while (continuar) {
            controleDeAtosAdministrativos.adicionar(alimentarArrayTecnico());

            continuar = Reader.lerBoolean("DESEJA CONTINUAR COM O CADASTRO? [S]SIM [N]NÃO: ", "DIGITE SOMENTE [S]SIM [N]NÃO: ", "S", "N");
        }
    }
}
