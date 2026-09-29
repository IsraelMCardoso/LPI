package atividades.imagem1;

public class Loja {

    private String nome;
    private String endereco;
    private int quantidadeFuncionarios;

    public Loja(String nome, String endereco, int quantidadeFuncionarios) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void abrirLoja() {
        System.out.println("A loja " + nome + " está aberta.");
    }

    public void fecharLoja() {
        System.out.println("A loja " + nome + " está fechada.");
    }

    public void mostrarProdutos() {
        System.out.println("A loja " + nome + " possui produtos disponíveis.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
}