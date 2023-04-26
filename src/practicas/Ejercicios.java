package practicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

       /*System.out.print("Ingresa un numero: ");
        int num1 = cargarNumero();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = cargarNumero();

        System.out.print("Ingresa el tercer numero: ");
        int num3 = cargarNumero();

        calcularNumeroMayor(num1, num2, num3);
        calcularNumeroMenor(num1, num2, num3);

        calcularPromedio(num1, num2, num3);

        mostrarParOImpar(num1, num2, num3);
        sumaNumeros(num1, num2, num3);


        ArrayList<String> Usuarios = new ArrayList<>();
        String usuario;

        for (int i = 0; i < 3; i ++ ) {
            System.out.print("Ingresa el nombre de usuario: ");
            usuario = cargarUsuario();
            Usuarios.add(usuario);;
            System.out.println("se agrego correctamente el usuario "+ usuario);
        }
        System.out.println(Usuarios);
    }

    private static Integer cargarNumero() {

        Scanner sc = new Scanner(System.in);
        Integer numero = sc.nextInt();
        return numero;
    }

    private static String cargarUsuario() {
        Scanner sc = new Scanner(System.in);
        String usuario = sc.nextLine();
        return usuario;
    }
    public static void calcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3) {

        Integer numeroMayor = numero1;

        if (numero2 > numeroMayor) { numeroMayor = numero2; }
        if (numero3 > numeroMayor) { numeroMayor = numero3; }

            System.out.println("El numero mayor es " + numeroMayor);
    }

    public static void calcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3) {

        Integer numeroMenor = numero1;

        if (numero2 < numeroMenor) { numeroMenor = numero2; }
        else if (numero3 < numeroMenor) { numeroMenor = numero3; }

        System.out.println("El numero menor es " + numeroMenor);
    }

    public static void calcularPromedio(float numero1, float numero2, float numero3) {

        Float promedio = ((numero1 + numero2 + numero3) / 3);
        System.out.println("el promedio de los numeros ingresados es " + promedio);
    }

    public static void mostrarParOImpar(int... numeros ) {

        for (int numero : numeros) {
            if (numero %2 != 0){
                System.out.println("el numero " + numero + " es impar");
            }
            else{
                System.out.println("el numero " + numero + " es par");
            }
        }
    }

    public static void sumaNumeros(Integer numeroUno, Integer numeroDos, Integer numeroTres) {

        int resultado = numeroUno + numeroDos +numeroTres;
        System.out.println("La suma de los numeros es: "+ resultado);
    }
*/

    }

}
