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
		
		/*Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInformes());*/
		
		SecretarioEmpleado Andrea = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Andrea.getTareas());
		System.out.println(Andrea.getInformes());
		System.out.println("Email: "+Andrea.getEmail());
		System.out.println(Andrea.getNombreEmpresa());
		
		
		//cerrar el archivo xml luego de haberlo utilizado
		contexto.close();
		
		
		
	}

}
