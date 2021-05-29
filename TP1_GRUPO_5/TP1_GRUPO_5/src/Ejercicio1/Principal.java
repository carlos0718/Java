package Ejercicio1;

//import dominio.Empleado;

public class Principal {
	
	public static void main(String[] args) {
		
		/**
		 * @object : emp_1
		 * @constructor : Empleado, sin parámetros
		 */
		Empleado emp_1 = new Empleado();
		
		System.out.println(emp_1.toString());
		
		/**
		 * @object : emp_2
		 * @constructor : Empleado, sin parámetros
		 * @method : setEdad()
		 * @method : setNombre()
		 */
		Empleado emp_2 = new Empleado();
		
		emp_2.setEdad(10);
		emp_2.setNombre("Facundo");
		System.out.println(emp_2.toString());
		
		/**
		 * @object : emp_3
		 * @constructor : Empleado, sin parámetros
		 * @method : setEdad()
		 * @method : setNombre()
		 */
		Empleado emp_3 = new Empleado();
		
		emp_3.setEdad(15);
		emp_3.setNombre("Cristian");
		System.out.println(emp_3.toString());
		
		/**
		 * @object : emp_4
		 * @constructor : Empleado, con parámetros
		 * @method : toString()
		 */
		Empleado emp_4 = new Empleado(25,"Carlos");
		
		System.out.println(emp_4.toString());
		
		/**
		 * @object : emp_5
		 * @constructor : Empleado, con parámetros
		 * @method : toString()
		 */
		Empleado emp_5 = new Empleado(30,"Tamara");
		
		System.out.println(emp_5.toString());
		
		/**
		 * @param : id 
		 * @descripcion : guarda el proximo id del empleado generado con la clase.
		 * 
		 */
		int id = Empleado.devueleProximoId();
		System.out.println("**El proximo ID es: "+id);
		
	}

}
