package questaoum;

public class Elipse {
    Ponto origem;
    float a,b;
    
    
    Elipse(float direcao){
        this(new Ponto(0,0),direcao,direcao);
    }
    
    Elipse(Ponto origem, float direcao){
        this(origem, direcao, direcao);
    }
    
    public Elipse(Ponto origem, float a, float b) {
        this.origem = origem;
        this.a = a;
        this.b = b;
    }

    public Ponto getOrigem() {
        return this.origem;
    }

    public float getA() {
        return this.a;
    }

    public float getB() {
        return this.b;
    }
    
    boolean igual(Elipse e){
        return(this.getOrigem().igual(e.getOrigem()) && 
                this.getA() == e.getA() && 
                this.getB()==e.getB());
    }    
    
    
}
