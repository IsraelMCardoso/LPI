package atividades.imagem2;

public class Ciclista {

    private String nome;
    private int idade;
    private double velocidade;

    public Ciclista(String nome, int idade, double velocidade) {
        this.nome = nome;
        this.idade = idade;
        this.velocidade = velocidade;
    }

    public void pedalar() {
        System.out.println(nome + " está pedalando.");
    }

    public void acelerar() {
        velocidade += 5;
        System.out.println(nome + " acelerou para " + velocidade + " km/h.");
    }

    public void frear() {
        velocidade -= 5;

        if (velocidade < 0) {
            velocidade = 0;
        }

        System.out.println(nome + " reduziu para " + velocidade + " km/h.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}