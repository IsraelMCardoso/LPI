package atividades.imagem2;

public class Trilha {

    private String nome;
    private String tipoPiso;
    private double extensao;

    public Trilha(String nome, String tipoPiso, double extensao) {
        this.nome = nome;
        this.tipoPiso = tipoPiso;
        this.extensao = extensao;
    }

    public void iniciarPercurso() {
        System.out.println("Percurso iniciado na trilha " + nome + ".");
    }

    public void finalizarPercurso() {
        System.out.println("Percurso finalizado na trilha " + nome + ".");
    }

    public void mostrarInformacoes() {
        System.out.println("Trilha: " + nome);
        System.out.println("Tipo de piso: " + tipoPiso);
        System.out.println("Extensão: " + extensao + " km");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public double getExtensao() {
        return extensao;
    }

    public void setExtensao(double extensao) {
        this.extensao = extensao;
    }
}