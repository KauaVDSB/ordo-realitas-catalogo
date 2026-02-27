package br.edu.ufape.poo.ordemparanormal.modelo;

// O uso de extends indica que a classe Agente é uma subclasse de EntidadeParanormal,
// herdando seus atributos, métodos e comportamento, além de implementar a interface Investigavel,
// o que obriga a classe Agente a fornecer uma implementação concreta do método obterDica() definido na interface.
public class Agente extends br.edu.ufape.poo.ordemparanormal.modelo.EntidadeParanormal {

    /*
    TODO: Adicionar atributos específicos, como:
    - Vivo ou morto;
    - Idade (ou expectativa aproximada);
    - Organizações a quem está ou esteve afiliado;
    - Frase marcante ou bordão;
    - etc... (Me baseafr no site Paranordle para mais atributos e dicas personalizadas!)
    */

    private String patente;
    private String classe;


    // Construtor
    public Agente(String id, String nome, String elemento, String patente, String classe) {
        // Obrigatoriamente chamar o construtor da classe pai
        // para inicializar os atributos herdados na primeira linha do construtor da classe filha.
        super(id, nome, elemento);

        // Inicializar os atributos específicos da classe Agente
        this.patente = patente;
        this.classe = classe;
    }


    // Getters e Setters
    public String getPatente() { return this.patente; }
    public void setPatente(String patente) { this.patente = patente; }

    public String getClasse() { return this.classe; }
    public void setClasse(String classe) { this.classe = classe; }


    // Implementação concreta do método obterDica() da interface Investigavel
    // Utiliza @Override para indicar que estamos sobrescrevendo o método da interface
    @Override
    public String obterDica() {
        // TODO: Personalizar a dica com base na quantidade de dicas pedidas e
        // na classe e patente do agente, além do elemento que ele lida.
        // Ex: Demonstrar uma parte da dica por vez, nunca o Nome, já que é o que o usuário deve adivinhar,
        // e ir revelando mais detalhes a cada dica pedida, como:
        // - "Agente de classe X, especializado em lidar com entidades do elemento Y."

        // Misturamos variáveis (classe e patente) com atributos herdados (nome e elemento)
        // pois os herdados estão definidos como private e só podem ser buscados através de getters.
        return "O Agente é um membro da Ordem Paranormal, classificado como " + classe + " com patente de "
                + patente + ". Ele é especializado em lidar com entidades paranormais relacionadas ao elemento " + getElemento() + ".";
    }
}