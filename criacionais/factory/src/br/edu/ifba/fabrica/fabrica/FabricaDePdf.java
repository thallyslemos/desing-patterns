package br.edu.ifba.fabrica.fabrica;

import java.io.IOException;

import br.edu.ifba.fabrica.arquivos.GeradorDeArquivos;
import br.edu.ifba.fabrica.arquivos.GeradorDePdfs;

public class FabricaDePdf implements FabricaDeArquivos {

    @Override
    public String criar(String nomeDOArquivo) throws IOException {
        return new GeradorDePdfs().criar(nomeDOArquivo);
    }
    
}
