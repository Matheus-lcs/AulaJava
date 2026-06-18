const Pessoa = require("./Pessoa");


class Cliente extends Pessoa {
    static contadorComum = 0;
    static contadorPrioritario = 0;

    static TipoCliente = object.freeze({
        COMUM: "comum",
        PRIORITARIO: "prioritario"
    })

    constructor(nome, email, tipo) {
        super(nome);

        this.email = email;
        this.tipo = tipo;
        this.senha = this.gerarSenha();
    }

    gerarSenha() {
        if (this.tipo === "comum") {
            Cliente.contadorComum++;
            return `A${String(Cliente.contadorComum).padStart(3, "0")}`;
        }

        if (this.tipo === "prioritario") {
            Cliente.contadorPrioritario++;
            return `P${String(Cliente.contadorPrioritario).padStart(3, "0")}`;
        }

        throw new Error("Tipo de cliente inválido.");
    }

    apresentar() {
        console.log(
            `Nome: ${this.nome} | E-mail: ${this.email} | Tipo: ${this.tipo} | Senha: ${this.senha}`
        );
    }
}

module.exports = Cliente;