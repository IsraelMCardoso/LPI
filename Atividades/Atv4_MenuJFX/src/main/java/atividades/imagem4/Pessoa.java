package atividades.imagem4;

public class Pessoa {

    private String nome;
    private int idade;
    private String tipoCabelo;

    public Pessoa(String nome, int idade, String tipoCabelo) {
        this.nome = nome;
        this.idade = idade;
        this.tipoCabelo = tipoCabelo;
    }

    public void escolherPenteado() {
        System.out.println(
            nome + " escolheu um novo penteado."
        );
    }

    public void mudarCabelo(String novoTipo) {
        tipoCabelo = novoTipo;

        System.out.println(
            "Novo tipo de cabelo: " + tipoCabelo
        );
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println(
            "Tipo de cabelo: " + tipoCabelo
        );
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

    public String getTipoCabelo() {
        return tipoCabelo;
    }

    public void setTipoCabelo(String tipoCabelo) {
        this.tipoCabelo = tipoCabelo;
    }
}