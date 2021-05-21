package questaoum;

public class Ponto {
  float x, y;

  //METODOS CONSTRUTORES
  
  Ponto () {
    this(0);
  }

  Ponto (float c) {
    this(c,c);
  }

  Ponto (float x, float y) {
    this.x = x;
    this.y = y;
  }

  Ponto (float x, String s) {
    //this.x = x;
    //this.s = s;
  }

  //METODOS OPERACIONAIS
  
  void setX (float x) {
    this.x = x;
  }

  float getX () {
    return x;
  }

  void setY (float y) {
    this.y = y;
  }

  float getY () {
    return y;
  }

  void formatar () {
    this.formatar('=');
  }

  void formatar (char sep) {
    System.out.println ("X "+ sep + x + " Y" +sep +y);
  }
  
  boolean igual (Ponto p){
      return this.getX() == p.x && this.getY() == p.y;
  }

}