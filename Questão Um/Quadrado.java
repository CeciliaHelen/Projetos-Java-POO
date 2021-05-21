package main;

public class Quadrado{
    Ponto origem;
    float lado;
    
    Quadrado (float lado){
        this(new Ponto(0,0), lado);
    }
    
    Quadrado(Ponto origem, float lado){
        this.origem = origem;
        this.lado = lado;
    }

    public Ponto getOrigem() {
        return this.origem;
    }

    public float getLado() {
        return this.lado;
    }
    
    boolean igual(Quadrado q){
        return(this.getOrigem().igual(q.getOrigem()) && this.getLado() == q.getLado());
    }
    
}
