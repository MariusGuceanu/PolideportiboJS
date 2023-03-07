package modelo;

public class Usuarios {

	private int id;
	private String Nombre_Apellidos;
	private String dni;
	private String codigo;

	public String toString() {
		return "Actividades [id=" + id + ", Nombre_Apellidos=" + Nombre_Apellidos + ", dni=" + dni + ", codigo="
				+ codigo + "]";
	}

	public Usuarios(int id, String nombre_Apellidos, String dni, String codigo) {
		super();
		this.id = id;
		Nombre_Apellidos = nombre_Apellidos;
		this.dni = dni;
		this.codigo = codigo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_Apellidos() {
		return Nombre_Apellidos;
	}

	public void setNombre_Apellidos(String nombre_Apellidos) {
		Nombre_Apellidos = nombre_Apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
