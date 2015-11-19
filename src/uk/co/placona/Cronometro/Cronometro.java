package uk.co.placona.Cronometro;

public class Cronometro {

  int contador = 0;

  public void reiniciar() {
    contador = 0;
  }

  public void incrementar() {
    contador = contador + 1;
  }

  public String mostrarValor() {
    int minutos = contador / 60;
    int segundos = contador % 60;

    String result = "" + minutos + " minutos " + segundos + " segundos";
    return result;
  }

}
