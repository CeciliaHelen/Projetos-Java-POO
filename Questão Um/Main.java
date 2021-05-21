package main;

public class Main {

    public static void main(String[] args) {
        Ponto pontoUm = new Ponto();
        Ponto pontoDois = new Ponto();
        
        Circulo circuloUm = new Circulo(pontoUm,1);
        Circulo circuloDois = new Circulo(pontoDois,2);
        
        Elipse elipseUm = new Elipse(pontoUm,4);
        Elipse elipseDois = new Elipse(pontoDois,1);

        Quadrado quadradoUm = new Quadrado(pontoUm,4);
        Quadrado quadradoDois = new Quadrado(pontoDois,4);

        Retangulo retanguloUm = new Retangulo(pontoUm,8);
        Retangulo retanguloDois = new Retangulo(pontoDois,10);
        
        if(circuloUm.igual(circuloDois)){
            System.out.println("Círculos iguais");
        }else{
            System.out.println("Círculos diferentes");
        }
        
        if(elipseUm.igual(elipseDois)){
            System.out.println("Elipses iguais");
        }else{
            System.out.println("Elipses diferentes");
        }
        
        if(quadradoUm.igual(quadradoDois)){
            System.out.println("Quadrados iguais");
        }else{
            System.out.println("Quadrados diferentes");
        }
        
        if(retanguloUm.igual(retanguloDois)){
            System.out.println("Retângulos iguais");
        }else{
            System.out.println("Retângulos diferentes");
        }
    }
    
}
