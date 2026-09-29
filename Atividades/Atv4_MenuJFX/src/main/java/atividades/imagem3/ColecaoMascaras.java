package atividades.imagem3;

public class ColecaoMascaras {

    private String nome;
    private int quantidade;
    private String origem;

    public ColecaoMascaras(String nome, int quantidade, String origem) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.origem = origem;
    }

    public void adicionarMascara() {
        quantidade++;
        System.out.println("Máscara adicionada. Quantidade: " + quantidade);
    }

    public void removerMascara() {
        if (quantidade > 0) {
            quantidade--;
        }

        System.out.println("Máscara removida. Quantidade: " + quantidade);
    }

    public void mostrarColecao() {
        System.out.println("Coleção: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Origem: " + origem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}