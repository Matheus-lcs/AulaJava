class Pessoa {
    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;

    }

    apresentar() {
        console.log("Ola, meu nome é " + this.nome + " e tenho " + this.idade + " anos.");
    }
}