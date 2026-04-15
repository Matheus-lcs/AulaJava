public class Animal {
    private String nome;
    private String especie;
    private String dono;

    public Animal(String nome, String especie, Cliente dono) {
        this.nome = nome;
        this.especie = especie;
        this.dono = dono;
    }
    @Override
    public String toString() {
        return nome + " (" + especie + ") - Dono: " + dono.getNome();
    }
}