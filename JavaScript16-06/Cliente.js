class Cliente {
    constructor(nome, email) {
        this.nome = nome;
        this.email = email;
    }

    apresentar() {
        console.log("Ola, meu nome é " + this.nome + " e meu email é " + this.email);
    }
}