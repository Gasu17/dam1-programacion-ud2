
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuInteractivo {

    public static void hola() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();
        System.out.printf("Hola %s %n", nombre);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x = true;

        do {

            System.out.println("-- MENÚ --");
            System.out.println("1. Hola ");
            System.out.println("2. Hora");
            System.out.println("3. Salir");
            System.out.print("Elige: ");
            int e = 0;
            try {
                e = sc.nextInt();
            } catch (InputMismatchException noInt) {
                System.out.println("Elige un NUMERO (1-3)");
            }
            sc.nextLine();
            switch (e) {
                case 1 ->
                    hola();
                case 2 -> {
                    String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    System.out.println(hora);
                }
                case 3 -> {
                    System.out.println("Adios");
                    x = false;
                    break;

                }
                default -> {
                    if (e > 3 || e < 1) {
                        System.out.println("Introduce un numero entre (1-3)");
                    }
                }

            }

        } while (x);

        sc.close();
    }

}
