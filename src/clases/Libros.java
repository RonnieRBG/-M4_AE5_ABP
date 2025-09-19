package clases;

public class Libros {

	public String titulo;
	public String autor;
	public double precioDeReemplazo;
	
	
	public String getNombre() {
		return titulo;
	}


	public void setNombre(String nombre) {
		this.titulo = nombre;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public double getPrecioDeReemplazo() {
		return precioDeReemplazo;
	}


	public void setPrecioDeReemplazo(double precioDeReemplazo) {
		this.precioDeReemplazo = precioDeReemplazo;
	}


	public Libros(String titulo, String autor, double precioDeReemplazo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precioDeReemplazo = precioDeReemplazo;
	}
	@Override
	public String toString() {
		return "Titulo=  " + titulo + " " +
				",Autor= "+ autor + " " +
				",Precio= "+
				precioDeReemplazo + "]" + "\n";
		
	}

}
