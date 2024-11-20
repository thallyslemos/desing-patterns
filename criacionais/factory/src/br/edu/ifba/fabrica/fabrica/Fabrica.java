package br.edu.ifba.fabrica.fabrica;

import java.io.IOException;

import br.edu.ifba.fabrica.modelo.NaoImplementado;
import br.edu.ifba.fabrica.modelo.TipoDeArquivo;

public class Fabrica {
    public String criarArquivo(String nome, TipoDeArquivo tipo) throws NaoImplementado, IOException {
        FabricaDeArquivos fabrica = null;

        if(tipo == TipoDeArquivo.PDF) {
            fabrica = new FabricaDePdf();
        } else if (tipo == TipoDeArquivo.DOC) {
            fabrica = new FabricaDeDocs();
        } else {
            throw new NaoImplementado();
        }

        return fabrica.criar(nome);
    }
}
