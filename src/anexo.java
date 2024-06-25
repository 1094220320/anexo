import java.util.Scanner;
public class anexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de dia");
        System.out.println("1. lunes ");
        System.out.println("2. martes");
        System.out.println("3. miercoles");
        System.out.println("4. jueves");
        System.out.println("5. viernes");
        System.out.println("6. sabado");
        System.out.println("7. domingo");
        int dia1 = scanner.nextInt();
        while (dia1 == 1){
            System.out.println("bienvenido al dia lunes");
            break;
        } if (dia1 == 2){
            System.out.println("bienvenido al dia martes");
        } else if (dia1 == 3) {
            System.out.println("bienvenido al dia miercoles");
        } else if (dia1 == 4) {
            System.out.println("bienvenido al dia jueves");
        } else if (dia1 == 5) {
            System.out.println("bienvenido al dia viernes");
        } else if (dia1 == 6) {
            System.out.println("bienvenido al dia sabado");
        } else if (dia1 == 7) {
            System.out.println("bienvenido al dia domingo");
        }
    }
}
