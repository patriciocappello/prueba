package Cronometro;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.Cronometro.Cronometro;

public class CronometroTest {

  @Test
  public void testCronometroEnCero(){
    Cronometro cronometro = new Cronometro();
    cronometro.reiniciar();
    assertEquals("Probar el cronometro en cero", "0 minutos 0 segundos", cronometro.mostrarValor());
  }

  @Test
  public void testCronometroEnUno(){
    Cronometro cronometro = new Cronometro();
    cronometro.incrementar();
    assertEquals("Probar el cronometro en uno", "0 minutos 1 segundo", cronometro.mostrarValor());
  }

}
