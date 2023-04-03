package Produc;

public class Producto {
	
	private int codigo;
	private String descripcion;
	private int cantidad;
	private double precioUnitario;
	
	public Producto(int codigo, String descripcion, int cantidad, double precioUnitario){
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	public double calcularPrecioTotal() {
	    return cantidad * precioUnitario;
	}

	public double calcularIGV() {
	    return calcularPrecioTotal() * 0.18;
	}

	public double calcularTotal() {
	    return calcularPrecioTotal() + calcularIGV();
	}

}
