package br.edu.ufape.poo.ordemparanormal.excecoes;
//TODO: Criar subpacotes organizando o tipo de exceção conforme o projeto for crescendo,
// Ex: excecoes.crud
public class EntidadeNaoEncontradaException extends Exception{

    public EntidadeNaoEncontradaException(String id) {
        super("A Entidade com ID:" + id + " não foi encontrada nos registros da Ordem.");
    }

}
