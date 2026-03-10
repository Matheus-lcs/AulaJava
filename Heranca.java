import java.util.*;

class Carro {
    String nome;

    void fazerSom() {
        System.out.println("O carro faz barulho!");
    }
}

class Veiculo extends Carro {
    void RoncoDoMotor() {
        System.out.println(nome + " Tem um ronco incrivel!");
    }
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
}
