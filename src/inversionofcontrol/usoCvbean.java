package inversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoCvbean {
	
	public static void main(String[] args) {
		//cargar el xml de configuraion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		//obtencion del bean
		Empleados juan = contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(juan.getInformes());
		//cerrar el contexto
		contexto.close();
		
	}

}
