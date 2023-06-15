/*
1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package servicios;

import entidades.Amarre;
import entidades.Barco;
import entidades.BarcoMotor;
import entidades.Velero;
import entidades.Yate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class AmarreServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    public Amarre amarre;

    /*
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
     */
    public void crearAmarre() {
        System.out.println("Ingrese nombre del usuario ");
        String nombre = input.next();
        System.out.println("Ingrese documento");
        int doc = input.nextInt();
        System.out.println("Fecha de amarre");
        Date fechaAlquiler = fecha();
        System.out.println("Fecha devolucion");
        Date fechaDevolucion = fecha();
        System.out.println("Ingrese posicion del amarre");
        int posicion = input.nextInt();
        System.out.println("");
        Barco barco = crearBarco();
        amarre = new Amarre(nombre, doc, fechaAlquiler, fechaDevolucion, posicion, barco);

    }

    public Date fecha() {
        System.out.println("Ingrese fecha (dd, mm, aaaa)");
        int dia = input.nextInt();
        int mes = input.nextInt() - 1;
        int anio = input.nextInt() - 1900;
        return new Date(anio, mes, dia);
    }

    private Barco crearBarco() {
        /*
        matrícula, su eslora en metros y año de fabricación.
        Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
        • Número de mástiles para veleros.
        • Potencia en CV para barcos a motor.
        • Potencia en CV y número de camarotes para yates de lujo.
         */
        Barco b1;
        System.out.println("1 - Velero");
        System.out.println("2 - Barco a Motor");
        System.out.println("3 - Yate de Lujo");
        System.out.println("4 - Otro");
        System.out.println("Ingrese tipo de barco");
        String b = input.next().toLowerCase();
        System.out.println("Ingrese matricula");
        int mat = input.nextInt();
        System.out.println("Ingrese eslora en metros");
        int esl = input.nextInt();
        System.out.println("Ingrese año de fabricación");
        int fab = input.nextInt();

        switch (b) {
            case "1":// "velero":
                System.out.println("Ingrese cantidad de mástiles");
                int mast = input.nextInt();
                b1 = new Velero(mast, mat, esl, fab);
                break;
            case "2"://barco a motor":
                System.out.println("Ingrese potencia en CV");
                int pote = input.nextInt();
                b1 = new BarcoMotor(pote, mat, esl, fab);
                break;
            case "3"://yate de lujo":
                System.out.println("Ingrese potencia en CV");
                int pote2 = input.nextInt();
                System.out.println("Ingrese cantidad de camarotes");
                int camar = input.nextInt();
                b1 = new Yate(camar, pote2, mat, esl, fab);
                break;
            default://otro
                b1 = new Barco(mat, esl, fab);
        }
        System.out.println(b1.toString());
        return b1;
    }

    /*
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    multiplicando por 10 los metros de eslora).
    En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
    sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
    en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
    el número de camarotes.
     */
    public double calcularAlquiler(Amarre a) {

        int dias = (int) (((a.getFechaDevolucion().getTime() - a.getFechaDeAlquiler().getTime()) / 86400000)+1);
        double modulo = a.getBarco().getEslora() * 10;

        if (a.getBarco() instanceof Velero) {
            Velero v = (Velero) a.getBarco();
            modulo += v.getMastiles();
        } else if (a.getBarco() instanceof Yate) {
            Yate y = (Yate) a.getBarco();
            modulo += y.getPotencia() + y.getCamarotes();
        } else if (a.getBarco() instanceof BarcoMotor) {
            BarcoMotor m = (BarcoMotor) a.getBarco();
            modulo += m.getPotencia();

        }
        System.out.println("Dias: " + dias + " Módulo: " + modulo);
        double alquiler = dias * modulo;
        return alquiler;
    }

}
