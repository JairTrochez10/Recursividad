package Clases;

public class CicloWhile {
    int inicio;
    int fin;
    int paso;

    public CicloWhile(int inicio, int fin, int paso) {
        this.inicio = inicio;
        this.fin = fin;
        this.paso = paso;
    }

    // Metodo que inicia el "bucle"
    public void ejecutar() {
        repetir(inicio); // empezamos desde el inicio
    }

    // Esto hace la repeticion usando recursion
    private void repetir(int actual) {

        //decidir si ya detenemos el ciclo
        if ((paso > 0 && actual > fin) || (paso < 0 && actual < fin)) {
            return; // ya no seguimos
        }

        System.out.println(actual);

        // Llamada recursiva aqui es donde se repite
        repetir(actual + paso);
    }
}
