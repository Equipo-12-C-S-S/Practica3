package practica5.ito.poo;
import java.time.LocalDate;

public class Manufactura {

	private String descripcion = "";
	private float costo = 0F;
	private java.time.LocalDate fechaAquisi = null;

	public Manufactura(String descripcion, float costo, LocalDate fechaAquisi) {
		super();
		this.descripcion = descripcion;
		this.costo = costo;
		this.fechaAquisi = fechaAquisi;
	}
	public Manufactura() {
		// Start of user code constructor for Manufactura)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Manufactura)

	// End of user code
	/**
	 * Returns descripcion.
	 * @return descripcion 
	 */
	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * Sets a value to attribute descripcion. 
	 * @param newDescripcion 
	 */
	public void setDescripcion(String newDescripcion) {
		this.descripcion = newDescripcion;
	}

	/**
	 * Returns costo.
	 * @return costo 
	 */
	public float getCosto() {
		return this.costo;
	}

	/**
	 * Sets a value to attribute costo. 
	 * @param newCosto 
	 */
	public void setCosto(float newCosto) {
		this.costo = newCosto;
	}

	/**
	 * Returns fechaAquisi.
	 * @return fechaAquisi 
	 */
	public java.time.LocalDate getFechaAquisi() {
		return this.fechaAquisi;
	}

	/**
	 * Sets a value to attribute fechaAquisi. 
	 * @param newFechaAquisi 
	 */
	public void setFechaAquisi(java.time.LocalDate newFechaAquisi) {
		this.fechaAquisi = newFechaAquisi;
	}

	@Override
	public String toString() {
		return "Manufactura [descripcion=" + descripcion + ", costo=" + costo + ", fechaAquisi=" + fechaAquisi + "]";
	}

}
