package condicionales_bucles;

public class Tarea {
    public static void main(String[] args) {
        condicional();
        bucleWhile();
        bucleDoWhile();
        bucleFor();
        casos();
    }

    public static void condicional() {
        int numeroIf = 25;
        System.out.println("CONDICIONALES");
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");

        } else {
            System.out.println("El numero es negativo");
        }
    }

    public static void bucleWhile() {
        System.out.println("BUCLE WHILE");
        int numeroWhile = 0;
        while (numeroWhile <= 3) {
            System.out.println("El numero es: " + numeroWhile);
            numeroWhile++;

        }

    }

    public static void bucleDoWhile() {
        System.out.println("BUCLE DO WHILE");
        int numeroWhile = 3;
        do {
            System.out.println("El numero es: " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

    }

    public static void bucleFor() {
        System.out.println("BUCLE FOR");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El numero es: " + numeroFor);
        }

    }

    public static void casos() {
        System.out.println("CASOS");
        String estacion="VERANO";
        switch (estacion) {
            case "VERANO":
                System.out.println("Estamos en verano");        
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno");        
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño");        
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");        
                break;
            default:
                System.out.println("No existe la estacion");
                break;
        }
    }
}
