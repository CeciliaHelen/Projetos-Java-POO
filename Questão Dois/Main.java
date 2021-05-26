package questaoum;

public class QuestaoUm {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana",13);
        
        p1.Retornar();
        
        
        Pessoa p2 = new Pessoa("João",20);
        p2.Retornar();
        
        //atribui o valor de p2 ao de p1
        p1 = p2;
        
        p1.Retornar();
        p2.Retornar();
    }
    
}
