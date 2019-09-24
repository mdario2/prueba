package inversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Carga de XML de configuracion para pedir los beans
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//peticion de beans al contenedor
		SecretarioEmpleado Andrea = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Andrea);
		System.out.println(Pedro);
	}

}
