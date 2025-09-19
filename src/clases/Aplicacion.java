package clases;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Prestamo p1 = new Prestamo ();
			Prestamo p2 = new Prestamo ();
			Prestamo p3 = new Prestamo ("Juan", true);
			Prestamo p4 = new Prestamo ("John", true);
			Prestamo p5 = new Prestamo ("José", false);
			
			p1.agregarLibro ("HP1", "Jkrowling", 100);
			p1.agregarLibro ("HP1", "Jkrowling", 190);
			
			p2.agregarLibro ("HP3", "Jkrowling", 150);
			p2.agregarLibro ("HP4", "Jkrowling", 120);
			
			p3.agregarLibro ("HP5", "Jkrowling", 100);
			p3.agregarLibro ("HP6", "Jkrowling", 130);
			
			p4.agregarLibro ("HP7", "jkrowling", 200);
			p4.agregarLibro ("HP8", "jkrowling", 150);
			
			p5.agregarLibro ("HP9", "jkrowling", 150);
			p5.agregarLibro ("HP10", "jkrowling", 200);
			
			p1.mostrarDetallesDelPrestamo();
			System.out.println();
			p2.mostrarDetallesDelPrestamo();
			System.out.println();
			p3.mostrarDetallesDelPrestamo();
			System.out.println();
			p4.mostrarDetallesDelPrestamo();
			System.out.println();
			p5.mostrarDetallesDelPrestamo();
			System.out.println();
			
			
			p1.mostrarEstatus();
			System.out.println();
			p3.mostrarEstatus();
			System.out.println();
			p5.mostrarEstatus();
			System.out.println();
	}
			
			
	}


