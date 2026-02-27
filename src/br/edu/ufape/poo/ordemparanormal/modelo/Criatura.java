package br.edu.ufape.poo.ordemparanormal.modelo;

public class Criatura extends EntidadeParanormal {


    // TODO: Trocar atributo "nivelAmeaca" por "VD" (Valor de Dificuldade) baseado no livro de regras do RPG de Ordem Paranormal,
    // e adicionar atributos como:
    // - Enigma do medo (se a criatura tem um medo específico que pode ser explorado para enfraquecê-la);

    private int vd;
    private boolean enigmaMedo;


    // Construtor
    public Criatura(String id, String nome, String elemento, int vd, boolean enigmaMedo) {
        super(id, nome, elemento);

        this.vd = vd;
        this.enigmaMedo = enigmaMedo;
    }


    // Getters e Setters
    public int getVd() { return this.vd; }
    public void setVd(int vd) { this.vd = vd;}

    // hasEnigmaMedo() é um nome mais apropriado para um método booleano (Convençãol de Mercado!),
    // indicando que ele retorna true ou false dependendo se a criatura tem ou não um enigma do medo.
    public boolean hasEnigmaMedo() { return this.enigmaMedo; }
    public void setEnigmaMedo(boolean enigmaMedo) { this.enigmaMedo = enigmaMedo; }


    // Implementação concreta do método obterDica() da interface Investigavel
    @Override
    public String obterDica() {
        // TODO: Personalizar a dica com base na quantidade de dicas pedidas e 
        // na VD e elemento da Criatura.
        // Ex: Demonstrar uma parte da dica por vez, nunca o Nome, já que é o que o usuário deve adivinhar,
        // e ir revelando mais detalhes a cada dica pedida, como:
        // - "Criatura de VD X, relacionada ao elemento Y. Ela tem um enigma do medo? " + (enigmaMedo ? "Sim" : "Não") + "."

        return "A Criatura é uma entidade paranormal com um nível de ameaça de " + vd + ", relacionada ao elemento " + getElemento() + ". Ela tem um enigma do medo? " + (enigmaMedo ? "Sim" : "Não") + ".";
    }


}