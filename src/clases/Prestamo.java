package clases;

import java.util.ArrayList;

public class Prestamo {
	public String nombre;
	ArrayList <Libros> libro;
	public boolean estatus;
	
	
	public Prestamo() {
		super();
		this.nombre = "Invitado";
		this.libro = new ArrayList<>();
		this.estatus = true;
	}


    public Prestamo(String nombre, boolean estatus) {
        this.nombre = nombre;
        this.libro = new ArrayList<>();  
        this.estatus = estatus;
    }


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Libros> getLibro() {
		return libro;
	}


	public void setLibro(ArrayList<Libros> libro) {
		this.libro = libro;
	}


	public boolean isEstatus() {
		return estatus;
	}


	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	
	public void agregarLibro(String titulo, String autor, double precioDeReemplazo) {
	    Libros nuevoLibro = new Libros(titulo, autor, precioDeReemplazo);
	    libro.add(nuevoLibro); 
	}
	
	public void mostrarEstatus () {
		if (this.estatus == true) {
			System.out.println("Estado del libro: Prestamo activo");
		} else {
			System.out.println("Estado del libro: Disponible");
		}
		
	}
	
	public void mostrarDetallesDelPrestamo () {
		if (this.estatus) {
			System.out.println("Detalles del prestamo: ");
			System.out.println("El nombre del usuario es : " + this.nombre);
			System.out.println("Libros en uso: " + this.libro);
		} else {
			System.out.println("Sin detalles");
		}
	}
	
	public double calcularTotalDeReemplazo () {
		if (this.estatus) {
		double total = 0;
		for ( Libros l : libro) {
			total += l.getPrecioDeReemplazo();
		}
		 return total;
	}else {
		return 0.0;
	}
	}
	
    @Override
    public String toString() {
        return "Prestamo{" +
                "nombre='" + nombre + '\'' +
                ", libro=" + libro +
                ", estatus=" + estatus +
                '}';
    }
}

