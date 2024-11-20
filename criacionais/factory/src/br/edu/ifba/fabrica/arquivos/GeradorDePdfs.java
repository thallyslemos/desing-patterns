package br.edu.ifba.fabrica.arquivos;

import java.io.IOException;

public class GeradorDePdfs extends GeradorDeArquivos {

    @Override
    public String criar(String nome) throws IOException {
        return super.criar(nome, ".pdf");
    }
    
}
