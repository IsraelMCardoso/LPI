package atividades.imagem4;

public class Penteado {

    private String nome;
    private String estilo;
    private int nivelDificuldade;

    public Penteado(String nome, String estilo, int nivelDificuldade) {
        this.nome = nome;
        this.estilo = estilo;
        this.nivelDificuldade = nivelDificuldade;
    }

    public void criar() {
        System.out.println(
            "Penteado criado: " + nome
        );
    }

    public void alterarEstilo(String novoEstilo) {
        estilo = novoEstilo;

        System.out.println(
            "Novo estilo: " + estilo
        );
    }

    public void mostrarPenteado() {
        System.out.println("Nome: " + nome);
        System.out.println("Estilo: " + estilo);
        System.out.println(
            "Nível de dificuldade: " + nivelDificuldade
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }
}