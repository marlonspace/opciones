import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int e,v1,v2,mulipliacion,suma,d,cobro,at,bt,area;
        String n;
        Scanner i = new Scanner(System.in);
        System.out.println(" digite un numero del 1 al 3");
        System.out.println("1: Hacer una suma y multiplicacion");
        System.out.println("2: Validacion del cobro si es mayor de edad");
        System.out.println("3: Area de triangulo");
        e = i.nextInt();
        switch (e) {
            case 1:
                System.out.println(" digite 2 valores");
                v1 = i.nextInt();
                v2 = i.nextInt();
                suma = v1+v2;
                mulipliacion = v1*v2;
                System.out.println("La suma  los valores es"+suma);
                System.out.println("L multiplicacion de los valores es"+mulipliacion);
                break;
            case 2:
                System.out.println(" ingrese su nombre");
                n = i.next();
                System.out.println(" ingrese su edad");
                d = i.nextInt();
                if (d>=18) {
                    cobro = 10000 * d;
                    System.out.println(" pagar un total de: "+cobro+" por ser mayor de edad");}
                else{
                    System.out.println(" no es mayor de edad, por ende, no genera cobro");
                }
                break;
            case 3:
                System.out.println("Por favor ingrese la altura y base de un triangulo");
                at = i.nextInt();
                bt = i.nextInt();
                area = (bt*at)/2;
                System.out.println("El area de un triangulo es: "+area);
                break;
            default: {
                System.out.println("Por favor ingrese la opcion 1,2 o 3");
            }
        }
    }
}

