const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Quantos termos da sequência de Fibonacci deseja ver? ", (input) => {
    const n = parseInt(input);

    if (n <= 0) {
        console.log("Por favor, insira um número positivo.");
    } else if (n === 1) {
        console.log("Sequência: 0");
    } else {
        let anterior = 0;
        let atual = 1;

        let resultado = "Sequência: 0, 1";

        for (let i = 2; i < n; i++) {
            let proximo = anterior + atual;
            resultado += ", " + proximo;

            anterior = atual;
            atual = proximo;
        }

        console.log(resultado);
    }

    rl.close();
});