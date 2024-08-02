import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      /*  Ejercicio 1
         int edad;
        //int edadIngresada;

        System.out.println("Ingresar la edad:");
        Scanner scanner = new Scanner(System.in);
        edad=scanner.nextInt();


        if (edad <= 12) {

            System.out.println("Es un niño");

        }
        if (edad < 12 && edad < 20) {

            System.out.println("Es un joven");

        } else if (edad <= 21 && edad < 60) {

            System.out.println("Es un adulto");

        } else {

            System.out.println("Es un adulto mayor");
        }
        */


        /* Ejercicio 2
        Scanner scanner = new Scanner(System.in);


        int valorA;
        int valorB;
        int valorC;
        boolean valorI;

        System.out.println("Programa para saber cual es el valor mayor y cual es el menor");

        do {

            System.out.println("Ingresar el primer valor:");
            valorA = scanner.nextInt();

            System.out.println("Ingresar el segundo valor:");
            valorB = scanner.nextInt();

            System.out.println("Ingresar el tercer valor:");
            valorC = scanner.nextInt();

            valorI = (valorA==valorB) && (valorB==valorC);

            if (valorI){

                System.out.println("Los valores ingresados son iguales:");
            }

        }while (valorI);


        if (valorA > valorB && valorA > valorC) {

            System.out.println("El primer valor que se ingreso es el mayor:" + valorA);

        } else if (valorB > valorA && valorB > valorC) {

            System.out.println("El segundo valor que se ingreso es el mayor:" + valorB);

        } else if (valorC > valorA && valorC > valorB) {

            System.out.println("El tercer valor que se ingreso es el mayor:" + valorC);

        }
        if (valorA < valorB && valorA < valorC) {

            System.out.println("El primer valor que se ingreso es el menor:" + valorA);

        } else if (valorB < valorA && valorB < valorC) {

            System.out.println("El segundo valor que se ingreso es el mayor:" + valorB);

        } else if (valorC < valorA && valorC < valorB) {

            System.out.println("El tercer valor que se ingreso es el mayor:" + valorC);

        }*/



        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la calificación del 1 al 10");
        int calificacion = scanner.nextInt();

        switch (calificacion){

            case 1:
            case 2:
                System.out.println("Su calificación es F");
                break;
            case 3:
            case 4:
                System.out.println("Su calificación es D");
                break;
            case 5:
            case 6:
                System.out.println("Su calificación es C");
                break;
            case 7:
            case 8:
                System.out.println("Su calificación es B");
                break;
            case 9:
            case 10:
                System.out.println("Su calificación es B");
                break;
            default:
                System.out.println("Número no válido, por favor verifique");






        }



    }


}


