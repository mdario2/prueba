package inversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		//Creacion de objetos tipo empleado
		Empleados e1 = new DirectorEmpleado();
		
		
		//Uso de los objetos creados
		System.out.println(e1.getTareas());
*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInformes());
		//cerrar el archivo xml luego de haberlo utilizado
		contexto.close();
		
		
		
	}

}
