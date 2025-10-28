package Clases;

public class Recursividad {

    public void contarAtras(int numero) {
        if (numero == 0) {
            System.out.println("Despegue!");
            return;
        }

        System.out.println(" "+numero);
        contarAtras(numero-1);
    }
}
