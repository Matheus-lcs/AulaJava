// Class Carro: Nome da classe definida para Carro, ela é uma classe base que tem atributos comuns.
class Carro {

    // String Nome: Declaração de atributo, todo objeto tem atributo definido, como por exemplo;...
    // ...atributo "Carro", apesar de não ter um valor inicial ainda o java atribui como "null". 
    String nome;

    // Void Fazer Som: É a declaração do método "Carro", o 'Void' realiza ação mas não retorna nenhum dado.
    void fazerSom() {
        System.out.println("O carro faz barulho!");
    }   // "sout" ou System.out.println: É a saída de dados para o console e após imprimir o texto ele pula linha.

}

 // Veículo extends Carro: o 'extends' pega praticamente tudo que tem no 'carro' e coloca no 'veículo'...
 // ...ela herda o atributo "nome" e o método "fazerSom()".
class Veiculo extends Carro {
    void RoncoDoMotor() {
        System.out.println(nome + " Tem um ronco incrivel!");
    } // o 'Void RoncoDoMotor' irá chamar pelo método 'fazerSom()' e depois o "sout" irá imprimir o nome do veículo...
      // ...e dizer que ele tem um ronco incrível.
}

public class Heranca {
    public static void main(String[] args) {
        System.out.println("---Herança---");
        System.out.println();

        Veiculo v = new Veiculo();
        v.nome = "Mustang";

        v.fazerSom(); // Método herdado da classe Carro(PAI)
        v.RoncoDoMotor(); // Método da classe Veiculo(Filha/Subclasse)
    }
    // Na linha 'Herança' será a classe principal, ela usa o void main para se tornar como o ponto de partida enquanto o 'sout'...
    // ...faz a formatação do console para criar uma inteface visual.
    //  "Veiculo v = new Veiculo()"; aqui o objeto está na memória real do PC, sendo seu tipo que é apenas 'Veiculo'...
    // ...é o modo construtor onde o nome da varíavel é 'v' e o 'new Veículo()' faz a chamada para o construtor.
    //  'v.nome = "Mustang"': É o nome do atributo que deixará de se chamar de 'v' e se chamará 'Mustang'.
    // 'v.fazerSom()' : O método 'fazerSom()' chama o método que está definido na classe 'carro'.
    // 'v.RoncoDoMotor': Ele chama o método que está na classe 'Veículo', sendo assim após ele ser executado ele "mostra o som do carro".
}
