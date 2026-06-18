const Pessoa = require("./Pessoa");

class Atendente extends Pessoa {
    constructor(nome, matricula) {
        super(nome);

        this.matricula = matricula;
        this.historico = [];
    }

    atender(cliente) {
        this.historico.push(cliente);

        console.log(
            `${this.nome} atendeu ${cliente.nome} (${cliente.senha})`
        );
    }

    gerarRelatorio() {
        console.log("===== RELATÓRIO DO ATENDENTE =====");
        console.log(`Nome: ${this.nome}`);
        console.log(`Matrícula: ${this.matricula}`);
        console.log(`Total de atendimentos: ${this.historico.length}`);

        console.log("\nClientes atendidos:");

        if (this.historico.length === 0) {
            console.log("Nenhum cliente atendido.");
        } else {
            this.historico.forEach((cliente, indice) => {
                console.log(
                    `Atendimento ${indice + 1}:\t${cliente.nome}\t${cliente.senha}\t${cliente.tipo}\t${cliente.email}`
                );
            });
        }
    }
}

module.exports = Atendente;