package br.edu.ufape.poo.ordemparanormal;

import br.edu.ufape.poo.ordemparanormal.negocio.OrdemParanormalFacade;
import br.edu.ufape.poo.ordemparanormal.modelo.Agente;
import br.edu.ufape.poo.ordemparanormal.modelo.Criatura;
import br.edu.ufape.poo.ordemparanormal.modelo.EntidadeParanormal;
import br.edu.ufape.poo.ordemparanormal.excecoes.EntidadeJaCadastradaException;
import br.edu.ufape.poo.ordemparanormal.excecoes.EntidadeNaoEncontradaException;

public class Main {
    public static void main(String[] args) {
        System.out.println(">> Iniciando o Sistema da Ordem Paranormal...");

        try {
            // 1. Ao ser instanciada, a Fachada já manda o Gerenciador ler o arquivo .dat!
            OrdemParanormalFacade fachada = new OrdemParanormalFacade();

            // 2. Imprimimos o que já existe no HD (na primeira vez, estará vazio)
            System.out.println("\n[Catálogo Atual nos Registros]: " + fachada.listarTodasEntidades().size() + " entidades encontradas.");

            // 3. Criamos nossos dados de teste
            Agente kaiser = new Agente("A01", "Kaiser", "Conhecimento", "Especialista", "Atirador de Elite");
            Criatura zumbi = new Criatura("C01", "Zumbi de Sangue", "Sangue", 20, false);

            // 4. Testamos a Inserção (CREATE) e a Serialização automática
            System.out.println("\n[Tentando cadastrar entidades...]");
            fachada.cadastrarEntidade(kaiser);
            fachada.cadastrarEntidade(zumbi);
            System.out.println("Entidades cadastradas com sucesso!");

            // 5. Testamos as Exceções Customizadas
            System.out.println("\n[Testando as Exceções Customizadas...]");
            try {
                // Tentando cadastrar o mesmo ID novamente para forçar o erro
                Agente clone = new Agente("A01", "Clone do Kaiser", "Sangue", "Ocultista", "Lâmina Paranormal");
                fachada.cadastrarEntidade(clone);
            } catch (EntidadeJaCadastradaException e) {
                System.out.println("ALERTA ESPERADO: " + e.getMessage());
            }

            try {
                // Tentando buscar um ID que não existe
                fachada.buscarEntidade("X99");
            } catch (EntidadeNaoEncontradaException e) {
                System.out.println("ALERTA ESPERADO: " + e.getMessage());
            }

            // 6. Listamos novamente para provar que estão na memória RAM
            System.out.println("\n[Listando o Catálogo Final na Memória]:");
            for (EntidadeParanormal entidade : fachada.listarTodasEntidades()) {
                System.out.println("- " + entidade.getNome() + " (ID: " + entidade.getId() + ")");
                System.out.println("  Dica: " + entidade.obterDica()); // Provando o Polimorfismo!
            }

        } catch (Exception e) {
            System.err.println("Erro crítico no sistema: " + e.getMessage());
            System.err.println(e.getMessage());
        }
    }
}