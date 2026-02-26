package br.edu.ufape.poo.ordemparanormal.dados;

import br.edu.ufape.poo.ordemparanormal.modelo.EntidadeParanormal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioSerializacao implements RepositorioDados{

    // Variavel privada, imutavel e pertencente a classe, nao ao objeto.
    private static final String FILE = "entidades.dat";

    // Nunca engesse um repositório tornando-o estático.
    @Override
    public void salvarDados(List<EntidadeParanormal> entidades) throws Exception{
        try (FileOutputStream fos = new FileOutputStream(FILE);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

             oos.writeObject(entidades);

             // TODO: Remover println e outros comentários quando ciarmos camada de interacao com usuario.
             System.out.println("Entidades agora pertencem ao Outro Lado em: " + FILE + ".");
        }
        /* Comentado, pois não é responsabilidade desta camada.
        catch (IOException e) {
            System.err.println("Erro ao salvar Entidades no Outro Lado.\n" + e.getMessage());
        }
        */
    }

    // SuppressWarnings("unchecked") para evitar warning:
    // 'java.lang.Object' to 'java.util.List<br.edu.ufape.poo.ordemparanormal.modelo.EntidadeParanormal>'
    // pois o uso do "if (entidade instanceof List<?>)" nos da a certeza que a lista eh exclusivamente de
    // EntidadeParanormal.
    @Override
    @SuppressWarnings("unchecked")
    public List<EntidadeParanormal> carregarDados() throws Exception{
        // Guard Clause para arquivo nao encontrado.
        File file = new File(FILE);
        if(!file.exists()) {
            return new ArrayList<>();
        }

        try (FileInputStream fis = new FileInputStream(FILE);
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Object entidade = ois.readObject();

            if (entidade instanceof List<?>) {
                // Cast seguro
                return (List<EntidadeParanormal>) entidade;
            } else {
                throw new Exception("Os arquivos da Ordem estão corrompidos ou inválidos.");
            }

        }
        /* Comentado, pois não é responsabilidade desta camada.
        catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao conjurar Entidades do Outro Lado.\n" + e.getMessage());
        }
         */
    }

}
