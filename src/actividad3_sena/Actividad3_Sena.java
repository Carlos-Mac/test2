package actividad3_sena;
import java.util.Scanner;
public class Actividad3_Sena {

    public static void main(String[] args) {
        double a, b, c, area;
        int triangulo;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese las medidas de todos los lados del triángulo");
        System.out.println("Ingrese el lado 'a' del triangulo: ");
        a = sc.nextDouble();
        System.out.println("Ingrese el lado 'b' del triangulo: ");
        b = sc.nextDouble();
        System.out.println("Ingrese el lado 'c' del triangulo: ");
        c = sc.nextDouble();
        
        if(a==b && a==c && b==c){
            System.out.println("---Triángulo EQUILÁTERO ingresado---");
            triangulo=1;
        }
        else if(a==b || a==c || b==c){
            System.out.println("---Triángulo ISÓSELES ingresado---");
            triangulo=2;
        }
        else{
            System.out.println("---Triángulo ESCALENO ingresado---");
            triangulo=3;
        }
        
        switch(triangulo){
            case(1):
                System.out.println("Valor del angulo A: 60°");
                System.out.println("Valor del angulo B: 60°");
                System.out.println("Valor del angulo C: 60°");
                area = (b*Math.pow(Math.pow(c, 2)-(a),0.5))/2;
                System.out.println("El area del triangulo EQUILÁTERO: "+area+" m^2");
                break;
            case(2):
                System.out.println("Valor del angulo A: 30°");
                System.out.println("Valor del angulo B: 75°");
                System.out.println("Valor del angulo C: 75°");
                if(a==b){
                    area = (c * Math.sqrt((Math.pow(a, 2) - (Math.pow(c, 2) / 4)))) / 2;
                    System.out.println("El area del triangulo ISÓSELES: "+area+" m^2");  
                }
                else if(a==c){
                    area = (b * Math.sqrt((Math.pow(a, 2) - (Math.pow(b, 2) / 4)))) / 2;
                    System.out.println("El area del triangulo ISÓSELES: "+area+" m^2"); 
                }
                else{
                    area = (a * Math.sqrt((Math.pow(c, 2) - (Math.pow(a, 2) / 4)))) / 2;
                    System.out.println("El area del triangulo ISÓSELES: "+area+" m^2"); 
                }
                break;
            case(3): 
                double A, B, C, semiperimetro = (a+b+c)/2;;
                A = Math.toDegrees(Math.acos(-((Math.pow(a, 2)-Math.pow(b, 2)-Math.pow(c, 2))/(2*b*c))));
                System.out.println("Angulo A: "+A+"°");
                B =  Math.toDegrees(Math.asin((b*(Math.sin(Math.toRadians(A))))/a));
                System.out.println("Angulo B: "+B+"°");
                C = 180-A-B;
                System.out.println("Angulo C: "+C+"°");
                area = Math.sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c));
                System.out.println("El area del triangulo ESCALENO: "+area+" m^2");
                break;
        }
    }
    
}
