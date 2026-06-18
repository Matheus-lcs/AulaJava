class Fila {
    constructor() {
        this.clientes = [];
    }

    adicionarCliente(cliente) {

        if (cliente.tipo === "prioritario") {

            // procura o último prioritário
            let posicao = -1;

            for (let i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i].tipo === "prioritario") {
                    posicao = i;
                }
            }

            // se não existe prioritário, entra no início
            if (posicao === -1) {
                this.clientes.unshift(cliente);
            } else {
                // entra após o último prioritário
                this.clientes.splice(posicao + 1, 0, cliente);
            }

        } else {
            // comum sempre entra no final
            this.clientes.push(cliente);
        }
    }

    chamarProximo() {

        if (this.clientes.length === 0) {
            console.log("Fila vazia.");
            return null;
        }

        const cliente = this.clientes.shift();

        console.log(
            `Chamando ${cliente.nome} - Senha ${cliente.senha}`
        );

        return cliente;
    }

    exibirFila() {

        if (this.clientes.length === 0) {
            console.log("Nenhum cliente aguardando.");
            return;
        }

        console.log("=== FILA DE ESPERA ===");

        this.clientes.forEach((cliente, indice) => {
            console.log(
                `${indice + 1}. ${cliente.nome} - ${cliente.senha} (${cliente.tipo})`
            );
        });
    }
}