class Main {
    constructor() {

        const atendente1 = new Atendente("João", "123456");

        const fila = new Fila();

        fila.adicionarCliente(
            new Cliente("Carlos", "carlos@email.com", "comum")
        );

        fila.adicionarCliente(
            new Cliente("Ana", "ana@email.com", "prioritario")
        );

        fila.adicionarCliente(
            new Cliente("Pedro", "pedro@email.com", "comum")
        );

        fila.adicionarCliente(
            new Cliente("Mariana", "mariana@email.com", "prioritario")
        );

        fila.adicionarCliente(
            new Cliente("Lucas", "lucas@email.com", "comum")
        );

        fila.adicionarCliente(
            new Cliente("Fernanda", "fernanda@email.com", "comum")
        );

        fila.adicionarCliente(
            new Cliente("Juliana", "juliana@email.com", "prioritario")
        );

        fila.adicionarCliente(
            new Cliente("Rafael", "rafael@email.com", "comum")
        );

        console.log("FILA ANTES DOS ATENDIMENTOS:");
        fila.exibirFila();

        while (fila.clientes.length > 0) {

            const cliente = fila.chamarProximo();

            atendente1.atender(cliente);
        }

        console.log("\nRELATÓRIO FINAL:");
        atendente1.gerarRelatorio();
    }
}

new Main();

/*
RESPOSTAS TEÓRICAS:

1) Se surgir um novo tipo "VIP" que entra antes dos prioritários:

Seria necessário alterar apenas a classe Fila.js, adicionando uma nova regra de prioridade.
A lógica de inserção teria que considerar:
VIP > prioritário > comum

Isso provavelmente exigiria:
- Criar uma nova condição no método adicionarCliente()
- Ou melhor ainda: transformar a prioridade em um sistema de ranking (ex: VIP = 1, prioritário = 2, comum = 3)

O main.js NÃO deveria ser alterado, porque ele apenas usa a fila.
Isso evita retrabalho e mantém o sistema escalável.

------------------------------------------------------

2) Por que faz sentido a lógica de prioridade estar dentro da Fila.js e não no main.js?

Porque a fila é a responsável pelas regras de organização dos dados.

O main.js deve apenas:
- criar objetos
- chamar métodos
- executar o fluxo

Se a lógica de prioridade ficasse no main.js:
- o código ficaria repetitivo
- difícil de manter
- qualquer mudança de regra exigiria alterar várias partes do sistema

Separando corretamente:
- Fila.js = regras do negócio (prioridade e ordem)
- Main.js = execução do sistema

Isso é um princípio de boa programação (separação de responsabilidades).

------------------------------------------------------

3) Diferença entre .shift() e .pop():

- shift():
  remove o PRIMEIRO elemento do array
  (início da fila)

- pop():
  remove o ÚLTIMO elemento do array
  (final da estrutura)

------------------------------------------------------

4) Qual faz sentido numa fila?

.shift() faz sentido em uma fila.

Porque fila funciona como:
FIFO → First In, First Out

Ou seja:
- quem entra primeiro, sai primeiro

.pop() seria usado em uma pilha (stack), não em uma fila.
*/