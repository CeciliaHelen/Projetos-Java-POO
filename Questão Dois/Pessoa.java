package questaoum;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void Retornar(){
        System.out.println("---------");
        System.out.println("NOME: " + this.getNome());
        System.out.println("IDADE: " + this.getIdade());
    } 

    void setNome(String pnome){
        this.nome = pnome;
    }
    
    String getNome(){
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
