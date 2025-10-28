package Clases;

public class CicloFor {
    int inicio;
    int fin;
    int incre;
    public CicloFor(int in, int fi, int inc) {
        inicio = in;
        fin = fi;
        incre = inc;
    }

    public void forHechizo() {
        //condicion para detener
        if(fin<=inicio) {
            System.out.println("Ciclo Terminado");
            return;
        }
        //llamada recursiva
        System.out.println(inicio);

        inicio=inicio+incre;
        forHechizo();
    }

}
