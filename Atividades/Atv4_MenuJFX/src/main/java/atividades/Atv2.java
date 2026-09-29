package atividades;

public class Atv2 {

    public static String verificarSenha(int senha) {

        if (senha == 1234) {
            return "Acesso permitido";
        }

        return "Acesso negado";
    }
}