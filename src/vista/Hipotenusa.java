package vista;
import java.util.Scanner;
import dato.Triangulo;
public class Hipotenusa {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("cateto 1: ");
		double cat1 = s.nextDouble();
		
		System.out.println("cateto 2: ");
		double cat2 = s.nextDouble();
		
		Triangulo t = new Triangulo(cat1, cat2);
		double h = t.hipotenusa();
		System.out.println("Hipotenusa del Triangulo: "+ h);
	}

}
