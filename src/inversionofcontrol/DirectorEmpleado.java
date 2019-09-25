package inversionofcontrol;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de campo tipo creacionInforme (interface)
	private CreacionInformes informeNuevo;
	
	//ceacion de contyructor que inyecta la dependencia
	 public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "informe creado por el director: "+informeNuevo.getInforme();
	}
	
	//Metodo init. ejecuar tareas antes de que el bean este disponible
	public void metodoInicial() {
		
		System.out.println("Dentro del metodo init. aqui van las tareas"
				+ " a ejecutar antes de que el bean esté listo");
	}
	
	
	//metodo destroy. ejecutar tareas despues de que el bean sea utilizado
public void metodoFinal() {
		
		System.out.println("Dentro del metodo destroy. aqui van las tareas"
				+ " a ejecutar despues de utilizar el bean");
	}

}
