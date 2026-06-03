# Beecrowd 1159 - Soma de Pares Consecutivos

## Descrição do problema

O programa deve ler vários valores inteiros `X` até que o valor `0` seja lido. Para cada valor `X` lido, deve-se imprimir a soma dos 5 números pares consecutivos a partir de `X`.

- Se `X` for par, a soma começa por `X`.
- Se `X` for ímpar, a soma começa pelo próximo número par.
- A entrada termina quando `X == 0`.

## Exemplo

- Entrada: `4`
  - Soma: `4 + 6 + 8 + 10 + 12 = 40`
- Entrada: `11`
  - Próximo par: `12`
  - Soma: `12 + 14 + 16 + 18 + 20 = 80`

## O que foi preciso para resolver

1. Criar a classe `Main` com o método `main`.
2. Ler a entrada usando `Scanner`.
3. Usar um laço `while` para processar cada valor até encontrar `0`.
4. Verificar se o valor `X` é ímpar e, se for, incrementar `X` em `1` para torná-lo par.
5. Somar os 5 valores pares consecutivos começando de `X`.
6. Imprimir o resultado para cada valor lido.
7. Fechar o objeto `Scanner` ao final.

## Observações

- O programa deve aceitar vários valores até o fim da entrada.
- O valor `0` não deve produzir saída; ele apenas encerra o processamento.
- A solução deve seguir o formato padrão de entrada e saída do Beecrowd, sem textos extras.
