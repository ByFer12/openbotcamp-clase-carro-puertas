package herencia_polimorfismo;

public class Main {
    public static void main(String[] args) {
        Persona p=new Cliente(18, "Maria", "12552222555", 185);
        Persona p1=new Trabajador(25, "Fernando", "354686484", 1800);
        System.out.println(p.toString());
        System.out.println(p1.toString());
    }
}
