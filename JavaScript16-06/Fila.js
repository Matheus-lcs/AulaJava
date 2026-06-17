class Fila {
    constructor() {
        this.clientes = [];
    }

    adicionarCliente(cliente) {
        this.clientes.push(cliente);
    }

    atenderCliente() {
        if (this.clientes.length > 0) {
            const cliente = this.clientes.shift();
            console.log("Atendendo cliente: " + cliente.nome);
        }
    }
}