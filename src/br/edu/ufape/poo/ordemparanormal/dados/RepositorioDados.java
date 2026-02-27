package br.edu.ufape.poo.ordemparanormal.dados;

import br.edu.ufape.poo.ordemparanormal.modelo.EntidadeParanormal;
import java.util.List;

public interface RepositorioDados {

    // Metodo para salvar a lista inteira no arquivo.
    // Joga Exceptions como IOException e ClassNotFoundException
    void salvarDados(List<EntidadeParanormal> entidades) throws Exception;

    // Metodo para ler o arquivo e devolver para a memória.
    List<EntidadeParanormal> carregarDados() throws Exception;
}
