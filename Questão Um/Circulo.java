package main;

public class Circulo {
    Ponto origem;
    float raio;

    public Circulo(Ponto origem, float raio) {
        this.origem = origem;
        this.raio = raio;
    }

    public Ponto getOrigem() {
        return this.origem;
    }

    public float getRaio() {
        return this.raio;
    }
    
    boolean igual(Circulo c){
        return(this.getOrigem().igual(c.getOrigem()) && this.getRaio() == c.getRaio());
    }
}
