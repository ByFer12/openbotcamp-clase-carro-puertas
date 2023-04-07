public class Main{
  public static void main(String[] args) {
    Coche miCoche= new Coche(1);
    miCoche.aumentarPuertas();
    miCoche.aumentarPuertas();

    System.out.println("Num Puertas: "+miCoche.mostrarNPuertas());
  }
}