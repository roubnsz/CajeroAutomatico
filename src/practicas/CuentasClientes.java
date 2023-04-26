package practicas;

import com.sun.tools.javac.Main;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import static practicas.Menu.*;


public class CuentasClientes {

    static ArrayList<String> registroOperaciones = new ArrayList<String>();
    //public static String fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
    public static String obtenerFecha() {
        Date fechaActual = new Date();
        String fechaFormateada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(fechaActual);
        return fechaFormateada;
    }

    public static int contadorErrores = 0;
    public static double saldo = 10000;

    public static void errores() {
        if (contadorErrores == 2) {
            System.out.println("=============================================================================================");
            System.out.println("|                           Excediste el limite de intentos. Saliendo...                    |");
            System.exit(0);
        }
        contadorErrores++;

    }
    public static void listaCuentas(String numCuenta){
        HashSet<String> Clientes = new HashSet<>();
        Clientes.add("123456");
        Clientes.add("654321");

        if (Clientes.contains(numCuenta)){
            System.out.println("=============================================================================================");

            System.out.println("|                                 Accediendo a la cuenta ...                                |");
            menuPrincipal();
        }
        else {
            System.out.println("=============================================================================================");
            System.out.println("|                             El numero de cuenta es incorrecto.                            |");
            errores();
            menuEntrar();
        }
    }

    public static void listaServicios(String servicio){
        List<String> Servicios = new ArrayList<>();
        Servicios.add("Telmex");
        Servicios.add("Sky");
        Servicios.add("Tarjeta de Credito");
        Servicios.add("Agua");

        if (Servicios.contains(servicio)){
            System.out.println("=============================================================================================");
            System.out.println("|                          Seleccionaste la opcion "+ servicio+"                            |");
            pagoServicios();
        }
        else {
            System.out.println("=============================================================================================");
            System.out.println("|                                 El servicio es incorrecto.                                |");
            errores();
            menuServicios();
        }
        menuPrincipal();
    }

    public static void consultaSaldo() {
        System.out.println("=============================================================================================");
        System.out.println("| "+ obtenerFecha());
        registroOperaciones.add(obtenerFecha() + " Consulta de saldo " +saldo);
        System.out.println("|                              Su saldo es: $" +saldo+ "                                    |");
    }

    public static void retiroEfectivo() {
        System.out.println("=============================================================================================");
        System.out.println("|                         Inserta la cantidad que deseas retirar:                            ");
        double retiro = inputNumero();

        if (retiro % 100 != 0){
            System.out.println("=============================================================================================");
            System.out.println("|                           Tu retiro debe ser multiplo de $100                             |");
        }
        else if (retiro > 6000 ){
            System.out.println("=============================================================================================");
            System.out.println("|                              solo puedes retirar hasta $6000                              |");
        }
        else if (retiro > saldo){
            System.out.println("=============================================================================================");
            System.out.println("|               No cuentas con la cantidad suficiente para realizar el retiro               |");
        }
        else {
            saldo -= retiro;
            System.out.println("=============================================================================================");
            System.out.println("| "+ obtenerFecha());
            registroOperaciones.add(obtenerFecha()+ " Retiro de efectivo por la cantidad de $" +retiro);
            System.out.println("|         Retiro de efectivo existoso, tu saldo disponible es de :$" +saldo+"               |");

        }
    }

    public static void transferencia() {
        System.out.println("=========================================================================================");
        System.out.println("|       Inserta el numero de cuenta al que deseas realizar la transferencia:             ");
        String cuentaDestino = inputString();
        System.out.println("=========================================================================================");
        System.out.println("|                     Inserta el monto que deseas transferir:                            ");
        double montoTransferencia = inputNumero();

        if (montoTransferencia > saldo){
            System.out.println("=========================================================================================");
            System.out.println("|         No cuentas con la cantidad suficiente para realizar la transferencia           ");
        }
        else if (montoTransferencia <= 9000 && montoTransferencia > 0){
            saldo -= montoTransferencia;
            System.out.println("=========================================================================================");
            System.out.println("| "+ obtenerFecha());
            registroOperaciones.add(obtenerFecha()+ " Transferencia realizada a la cuenta: "+cuentaDestino+" con monto de $"+montoTransferencia);
            System.out.println("|  Transferencia exitosa a la cuenta "+ cuentaDestino +", tu saldo es de :$" + saldo+"  |");
        }
        else {
            System.out.println("=========================================================================================");
            System.out.println("|                            Solo puedes transferir hasta $9000                         |");
        }
    }

    public static void pagoServicios() {
        System.out.println("=========================================================================================");
        System.out.println("|                            Inserta el monto a pagar: $                                |");
        double montoServicio = inputNumero();

        if (montoServicio > saldo){
            System.out.println("=========================================================================================");
            System.out.println("|            No cuentas con la cantidad suficiente para realizar el pago                |");
        }
        else if (montoServicio <= 6000 && montoServicio > 0){
            saldo -= montoServicio;
            System.out.println("=========================================================================================");
            System.out.println("| "+ obtenerFecha());
            registroOperaciones.add(obtenerFecha() + " Pago de servicio, monto $"+montoServicio);
            System.out.println("|        El pago se realizo exitosamente, tu saldo disponible es de :$" +saldo+"        |");
        }
        else {
            System.out.println("=========================================================================================");
            System.out.println("|                   Solo puedes realizar pagos con monto de hasta $6000                 |");
        }
    }

    public static void estadoDeCuenta() {
        System.out.println("=============================================================================================");
        System.out.println("|                                   ESTADO DE CUENTA                                        |");
        System.out.println("=============================================================================================");
        System.out.println("| " +obtenerFecha());
        System.out.println("| ");

        for (String movimiento : registroOperaciones) {
            System.out.println("|     " +movimiento);
            System.out.println("| ");
        }
        System.out.println("|                         Saldo disponible $"+saldo+ "                                      |");
        System.out.println("=============================================================================================");
    }

}
