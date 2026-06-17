const readline = require("readline/promises");
const { stdin, stdout } = require("process");

const rl = readline.createInterface({
  input: stdin,
  output: stdout,
});

async function ask(question) {
  return rl.question(question);
}

async function main() {
  const nome = await ask("Digite seu nome: ");
  const idade = await ask("Digite sua idade: ");
  const cidade = await ask("Digite sua cidade: ");

  console.log("\nDados informados:");
  console.log("Nome:", nome);
  console.log("Idade:", idade);
  console.log("Cidade:", cidade);

  rl.close();
}

main().catch((error) => {
  console.error(error);
  rl.close();
});
