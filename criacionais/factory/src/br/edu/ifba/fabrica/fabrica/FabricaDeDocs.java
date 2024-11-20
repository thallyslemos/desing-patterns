package br.edu.ifba.fabrica.fabrica;

import java.io.IOException;

import br.edu.ifba.fabrica.arquivos.GeradorDeDocs;

public class FabricaDeDocs implements FabricaDeArquivos {

    @Override
    public String criar(String nomeDOArquivo) throws IOException {
        return new GeradorDeDocs().criar(nomeDOArquivo);
    }
    
}
