package br.edu.ufape.poo.ordemparanormal.negocio;

import br.edu.ufape.poo.ordemparanormal.modelo.EntidadeParanormal;
import br.edu.ufape.poo.ordemparanormal.dados.RepositorioDados;
import br.edu.ufape.poo.ordemparanormal.dados.RepositorioSerializacao;
import br.edu.ufape.poo.ordemparanormal.excecoes.*;

import java.util.List;

public class GerenciadorEntidades {

    private final List<EntidadeParanormal> entidades; // Cache rápido na RAM
    private final RepositorioDados repositorio;       // Contrato com o HD

    // Construtor
    public GerenciadorEntidades() throws Exception {
        // Instancia a implementação de serialização
        this.repositorio = new RepositorioSerializacao();

        // Puxa os dados do HD para a RAM
        this.entidades = this.repositorio.carregarDados();
    }


    // CREATE
    public void adicionar(EntidadeParanormal novaEntidade) throws EntidadeJaCadastradaException, Exception {
        // - Checa se o ID da 'novaEntidade' já existe dentro da lista 'entidades'.
        // - Se existir -> throw new EntidadeJaCadastradaException(eId);
        // - Se não existir -> entidades.add(novaEntidade);
        // - Salvar no HD -> repositorio.salvarDados(entidades);

        // Compara existencia de ID igual na lista
        String id = novaEntidade.getId();

        // foreach (enhanced for)
        for (EntidadeParanormal entidade : entidades) {
            if (entidade.getId().equals(id)) {
                throw new EntidadeJaCadastradaException(id);
            }
        }

        // Adiciona nova entidade caso o ID seja novo
        entidades.add(novaEntidade);
        repositorio.salvarDados(entidades);
    }


    // READ
    public EntidadeParanormal buscarPorId(String id) throws EntidadeNaoEncontradaException {
        // - Itera pela lista 'entidades'.
        // - Se encontrar alguém com o mesmo ID -> retorna a entidade.
        // - Se o laço acabar e não achar ninguém -> throw new EntidadeNaoEncontradaException(id);


        for (EntidadeParanormal entidade : entidades) {
            if (entidade.getId().equals(id)) {
                return entidade;  // Case: True
            }
        }
        // Case: False
        throw new EntidadeNaoEncontradaException(id);
    }

    // READ ALL
    public List<EntidadeParanormal> listarTodas() {
        return this.entidades;
    }


    // DELETE
    public void remover(String id) throws EntidadeNaoEncontradaException, Exception {
        // Busca a Entidade pelo ID
        // Se não encontrar -> Retorna Exception personalizada automaticamente
        // Se encontrar -> Deleta Entidade e salva Lista de Entidade atualizada
        EntidadeParanormal entidade = buscarPorId(id);

        entidades.remove(entidade);
        repositorio.salvarDados(entidades);
    }


    // TODO: UPDATE será implementado em breve
    // tera que verificar se é um Agente ou Criatura para substituir o objeto correto.
    // entidade instanceof Agente

}