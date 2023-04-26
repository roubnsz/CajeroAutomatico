package practicas;

import java.util.HashSet;
import java.util.Scanner;

import static practicas.CuentasClientes.*;

public class Menu{


    public static void menuEntrar() {
        System.out.println("=============================================================================================");
        System.out.println("|                                   CAJERO AUTOMÁTICO                                       |");
        System.out.println("=============================================================================================");
        System.out.println("| "+ obtenerFecha());
        System.out.println("|                           Ingresa tu numero de cuenta:                                    |");
        String cuenta = inputString();

        listaCuentas(cuenta);

    }

    public static void menuServicios(){
        System.out.println("=============================================================================================");
        System.out.println("|                        Inserta el servicio que deseas pagar:                               ");
        String servicio = inputString();

        listaServicios(servicio);
    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    public static Double inputNumero() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            System.out.println("=============================================================================================");
            System.out.println("|                        La opcion que elegiste es incorrecta.                              |");
            errores();
            menuPrincipal();
            sc.next(); // consume la entrada no válida
        }
        double input = sc.nextDouble();
        return input;
    }


    public static void menuPrincipal() {
        System.out.println("=============================================================================================");
        System.out.println("|                                    CAJERO AUTOMÁTICO                                      |");
        System.out.println("=============================================================================================");
        System.out.println("| "+ obtenerFecha());
        System.out.println("|                                   Opciones disponibles:                                   |");
        System.out.println("|                                                                                           |");
        System.out.println("|                                   1. Consulta de saldo                                    |");
        System.out.println("|                                   2. Retiro de efectivo                                   |");
        System.out.println("|                                   3. Transferencia                                        |");
        System.out.println("|                                   4. Pago de servicios                                    |");
        System.out.println("|                                   5. Estado de cuenta                                     |");
        System.out.println("|                                   6. Salir                                                |");
        System.out.println("=============================================================================================");

        System.out.println("|                                Selecciona la opcion deseada:                               ");
        System.out.println("=============================================================================================");


        double opcionSeleccionada = inputNumero();

        opcionPrincipal(opcionSeleccionada);

    }

    public static void opcionPrincipal(Double opcion) {

        if (opcion == 1) {
            System.out.println("=============================================================================================");
            System.out.println("|                    Seleccionaste la opcion 1: Consulta de saldo.                          |");
            consultaSaldo();
        }
        else if (opcion == 2) {
            System.out.println("=============================================================================================");
            System.out.println("|                   Seleccionaste la opcion 2: Retiro de efectivo.                          |");
            retiroEfectivo();
        }
        else if (opcion == 3) {
            System.out.println("=============================================================================================");
            System.out.println("|                      Seleccionaste la opcion 3: Transferencia.                            |");
            transferencia();
        }
        else if (opcion == 4) {
            System.out.println("=============================================================================================");
            System.out.println("|                     Seleccionaste la opcion 4: Pago de servicios.                         |");
            menuServicios();
        }
        else if (opcion == 5) {
            System.out.println("=============================================================================================");
            System.out.println("|                     Seleccionaste la opcion 5: Estado de cuenta.                          |");
            estadoDeCuenta();
        }
        else if (opcion == 6) {
            System.out.println("=============================================================================================");
            System.out.println("|                        Seleccionaste la opcion 6: Saliendo...                             |");
            contadorErrores = 2;
        }
        else {
            System.out.println("=============================================================================================");
            System.out.println("|                        La opcion que elegiste es incorrecta.                              |");
            errores();
        }
        menuPrincipal();
    }
}
