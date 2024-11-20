package br.edu.ifba.singleton.arquivos;

import java.io.File;
import java.io.IOException;

import br.edu.ifba.singleton.modelo.NaoImplementado;
import br.edu.ifba.singleton.modelo.TipoDeArquivo;

public class GeradorDeArquivos {
    
    // A variavel referente a instancia deve ser estatica
    private static GeradorDeArquivos instancia = null;
    public static GeradorDeArquivos getInstancia() {
        if (instancia == null) {
            instancia = new GeradorDeArquivos();
        }

        return instancia;
    }

    private GeradorDeArquivos(){}

    // SImulação de uma inicialização demorada
    public void iniciar() {
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private String criarPdf(String nomeDoArquivo) throws IOException {
        return criar(nomeDoArquivo,".pdf");
    }

    private String criarDoc(String nomeDoArquivo) throws IOException {
        return criar(nomeDoArquivo, ".doc");
    }

    public String criar(String nome, TipoDeArquivo tipo)  {
        String novoArquivo = "";

        if(tipo == TipoDeArquivo.PDF) {
            try {
                novoArquivo = criarPdf(nome);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if (tipo == TipoDeArquivo.DOC) {
            try {
                novoArquivo = criarDoc(nome);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            try {
                throw new NaoImplementado();
            } catch (NaoImplementado e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return novoArquivo;
    }

    private String criar(String nome, String extensao) throws IOException {
        if(!nome.endsWith(extensao)) {
            nome += extensao;
        }

        File arquivo = new File(nome);
        arquivo.createNewFile();

        return arquivo.getAbsolutePath();
    }
}
