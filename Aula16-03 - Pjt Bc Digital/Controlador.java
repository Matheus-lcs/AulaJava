public class Controlador {

    public static void criarConta() {
        Telas.cabecalhoCadastro();
        Cliente cliente = new Cliente();

        // --- Nome ---
        String nomeInformado;
        boolean nomeValido;
        do {
            Telas.limparTela();
            nomeInformado = Telas.lerTexto("Digite o nome completo: ");
            nomeValido = cliente.setNome(nomeInformado);
            if (!nomeValido) {
                Telas.mensagem("Nome inválido!", true);
            }
        } while (!nomeValido);

        // --- CPF ---
        String cpfInformado;
        boolean cpfValido;
        do {
            Telas.limparTela();
            cpfInformado = Telas.lerTexto("Digite o CPF: ");
            cpfValido = cliente.setCpf(cpfInformado);
            if (!cpfValido) {
                Telas.mensagem("CPF inválido.", true);
            }
        } while (!cpfValido);

        // --- Data de Nascimento ---
        String data;
        boolean dataValida;
        do {
            Telas.limparTela();
            data = Telas.lerTexto("Data de nascimento (dd/mm/aaaa): ");
            dataValida = cliente.setDataNascimento(data);
            if (!dataValida) {
                Telas.mensagem("Data de nascimento inválida. Use o formato dd/mm/aaaa.", true);
            }
        } while (!dataValida);

        // --- Senha ---
        boolean senhaValida = false;
        do {
            String senha = Telas.lerTexto("Crie sua senha (4 dígitos): ");
            String confirma = Telas.lerTexto("Confirme sua senha: ");

            if (!senha.equals(confirma)) {
                Telas.mensagem("As senhas não conferem. Tente novamente.", true);
                continue;
            }

            if (!cliente.setSenha(senha)) {
                Telas.mensagem("Senha inválida. Use exatamente 4 dígitos numéricos.", true);
                continue;
            }

            senhaValida = true;
        } while (!senhaValida);

        // --- Mensagem final ---
        Telas.mensagem(
                "Dados validados com sucesso!\n" +
                        "Nome : " + cliente.getNome() + "\n" +
                        "CPF  : " + ValidaCPF.imprimeCPF(cliente.getCpf()) + "\n" +
                        "Nasc.: " + cliente.getDataNascimento() + "\n\n" +
                        "(Envio à CentralBancaria será implementado na Aula 06)",
                false);
    }

    public static void acessarConta() {
        Telas.cabecalhoLogin();

        String numeroConta = Telas.lerTexto("Número da conta: ");
        // String senha = Telas.lerTexto("Senha: ");

        // Login completo será implementado na Aula 06, com a CentralBancaria.
        Telas.mensagem("Login recebido para a conta " + numeroConta + " (em breve).", false);
    }
}