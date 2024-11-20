package br.edu.ifba.fabrica;

import br.edu.ifba.fabrica.fabrica.Fabrica;
import br.edu.ifba.fabrica.modelo.TipoDeArquivo;

public class App {
    private static final String ARQUIVO = "/home/thallys/arquitetura/desing-patterns/criacionais/factory/arquivos/arquivo";

    public static void main(String[] args) throws Exception {
        Fabrica fabrica = new Fabrica();
        fabrica.criarArquivo(ARQUIVO, TipoDeArquivo.PDF);
        fabrica.criarArquivo(ARQUIVO, TipoDeArquivo.DOC);
    }
}
