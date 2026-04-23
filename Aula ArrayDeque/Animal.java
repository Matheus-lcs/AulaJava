public class Animal {
    private String nome;
    private String especie;
    private String tutor;
    private int idade;
    private boolean urgente;

    public Animal(String nome, String especie, String tutor, int idade, boolean urgente) {
        this.nome = nome;
        this.especie = especie;
        this.tutor = tutor;
        this.idade = idade;
        this.urgente = urgente;
    }
    @Override
    public String toString() {
        return especie + " - " + nome + " (" + idade
    }
}