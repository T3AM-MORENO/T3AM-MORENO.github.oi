package CalacularProduc;
import java.util.Scanner;
import Produc.Producto;
public class Calcular {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("Codigo: ");
		int codigo = s.nextInt();
		System.out.print("Descripcion: ");
		String descripcion = s.next();
		System.out.print("Cantidad: ");
		int cantidad = s.nextInt();
		System.out.print("Precio: s/");
		double precio = s.nextDouble();
		
		Producto producto =new Producto(codigo, descripcion, cantidad, precio);
		
		System.out.println("Código: " + producto.getCodigo());
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println("Precio Unitario: " + producto.getPrecioUnitario());
        System.out.println("Precio Total: " + producto.calcularPrecioTotal());
        System.out.println("IGV: " + producto.calcularIGV());
        System.out.println("Total: " + producto.calcularTotal());
}
}