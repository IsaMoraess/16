public class Login {
    public void verificarSenha(String senha){
        int tamanhoMinimoSenha = 7;

        if (senha.length() < tamanhoMinimoSenha) {
            System.out.println("Senha valida");
        } else {
            System.out.println("Senha invalida!");
        }
    }
}
