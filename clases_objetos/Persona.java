package clases_objetos;

public class Persona {
    private int edad;
    private String nombre;
    private String apellido;

    public Persona(int edad, String nombre, String apellido){
        this.edad=edad;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

}
