package br.edu.ifba.singleton;

import br.edu.ifba.singleton.arquivos.GeradorDeArquivos;
import br.edu.ifba.singleton.modelo.TipoDeArquivo;

public class App {
    private static final String ARQUIVO = "/home/thallys/arquitetura/desing-patterns/criacionais/singleton/src/br/edu/ifba/singleton/arquivos/arquivo";
    public static void main(String[] args) throws Exception {
        String arquivo = GeradorDeArquivos.getInstancia().criar(ARQUIVO, TipoDeArquivo.PDF);

        System.out.println("Nome do arquivo: " + arquivo);
    
    }
}
