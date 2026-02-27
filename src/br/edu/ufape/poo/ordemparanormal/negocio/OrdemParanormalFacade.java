package br.edu.ufape.poo.ordemparanormal.negocio;

import br.edu.ufape.poo.ordemparanormal.modelo.EntidadeParanormal;

import br.edu.ufape.poo.ordemparanormal.excecoes.*;

import java.util.List;

public class OrdemParanormalFacade {

    // Instancias dos Gerenciadores imutaveis
    private final GerenciadorEntidades gerenciadorEntidades;
    // TODO: Implementar e adicionar Gerenciador Partida


    public OrdemParanormalFacade() throws Exception {
        this.gerenciadorEntidades = new GerenciadorEntidades();
    }


    // A Fachada servira como ponte entre as camadas

    public void cadastrarEntidade(EntidadeParanormal entidade) throws EntidadeJaCadastradaException, Exception {
        this.gerenciadorEntidades.adicionar(entidade);
    }

    public EntidadeParanormal buscarEntidade(String id) throws EntidadeNaoEncontradaException {
        return this.gerenciadorEntidades.buscarPorId(id);
    }

    public void removerEntidade(String id) throws EntidadeNaoEncontradaException, Exception {
        this.gerenciadorEntidades.remover(id);
    }

    public List<EntidadeParanormal> listarTodasEntidades() {
        return this.gerenciadorEntidades.listarTodas();
    }

}
