package br.edu.ufape.poo.ordemparanormal.modelo;

import java.io.Serializable;

public abstract class EntidadeParanormal implements Serializable, Investigavel {

        // TODO: Adicionar atributo "Quantidade de dicas pedidas" para personalizar as dicas fornecidas pelas entidades,
        // e criar um método para incrementar essa quantidade a cada vez que uma dica for solicitada,
        // permitindo que as dicas se tornem mais específicas e detalhadas com base no histórico de interações do usuário.
        // Adicionar também os atributos comuns:
        // - Temporadas que aparece em Ordem Paranormal;

        private String id;
        private String nome;
        private String elemento;

        // Construtor
        public EntidadeParanormal(String id, String nome, String elemento) {
            this.id = id;
            this.nome = nome;
            this.elemento = elemento;
        }

        // Getters e Setters
        public String getId() { return this.id; }
        public void setId(String id) { this.id = id;}

        public String getNome() { return this.nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getElemento() { return this.elemento; }
        public void setElemento(String elemento) { this.elemento = elemento;}


    /*
    Como classe Abstrata, apesar de implementar a interface,
    não é obrigada a fornecer uma implementação concreta do método obterDica().
    Deixaremos essa responsabilidade para as subclasses concretas que estenderem EntidadeParanormal:
    - Agente;
    - Criatura;
    */
}

