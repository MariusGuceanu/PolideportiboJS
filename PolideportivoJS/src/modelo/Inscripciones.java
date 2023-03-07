package modelo;

public class Inscripciones {

	private int id;
	private String id_actividad;
	private String id_usuario;

	public String toString() {
		return "Inscripciones [id=" + id + ", id_actividad=" + id_actividad + ", id_usuario=" + id_usuario + "]";
	}

	public Inscripciones(int id, String id_actividad, String id_usuario) {
		super();
		this.id = id;
		this.id_actividad = id_actividad;
		this.id_usuario = id_usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getId_actividad() {
		return id_actividad;
	}

	public void setId_actividad(String id_actividad) {
		this.id_actividad = id_actividad;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

}
