package main;

public class Retangulo {
    Ponto origem;
    float ladoUm, ladoDois;
    
    Retangulo(float lado){
        this(new Ponto(0,0),lado,lado);
    }
    
    Retangulo(Ponto origem, float lado){
        this(origem, lado, lado);
    }

    public Retangulo(Ponto origem, float ladoUm, float ladoDois) {
        this.origem = origem;
        this.ladoUm = ladoUm;
        this.ladoDois = ladoDois;
    }

    public Ponto getOrigem() {
        return this.origem;
    }

    public float getLadoUm() {
        return this.ladoUm;
    }

    public float getLadoDois() {
        return this.ladoDois;
    }
    
    
    boolean igual(Retangulo r){
        return(this.getOrigem().igual(r.getOrigem()) && this.getLadoUm() == r.getLadoUm() && this.getLadoDois()==r.getLadoDois());
    }
    
}


