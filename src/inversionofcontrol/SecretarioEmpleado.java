package inversionofcontrol;

public class SecretarioEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar agenda de los jefes";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario"+informeNuevo.getInforme();
	}

	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	

}
