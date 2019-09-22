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

}
