package Clases;

public class Factorial {
    double ecu1;
    double sumato;

    public void getEcu1() {
        for(int i=1;i<=10;i++){
            ecu1=2*i+1;
            sumato+= Math.pow(ecu1, 1/ecu1);
        }
        System.out.println(sumato);
    }

}
