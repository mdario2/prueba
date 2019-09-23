package inversionofcontrol;

public class SecretarioEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	private String nombreEmpresa;
	private String email;

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar agenda de los jefes";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario "+informeNuevo.getInforme();
	}

	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	

}
