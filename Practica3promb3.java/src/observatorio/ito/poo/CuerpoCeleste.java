/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package observatorio.ito.poo;
import observatorio.ito.poo.ubicacion;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuerpoCeleste.
 * 
 * @author Paola
 */
public class CuerpoCeleste {
	public CuerpoCeleste(String nombre,String composicion) {
		super();
		this.nombre = nombre;
		this.composicion = composicion;
	}

	/**
	 * Description of the property nombre.
	 */
	public String nombre = "";

	/**
	 * Description of the property localizaciones.
	 */
	public ubicacion localizaciones = null;

	/**
	 * Description of the property composicion.
	 */
	public String composicion = "";

	// Start of user code (user defined attributes for CuerpoCeleste)

	// End of user code

	/**
	 * The constructor.
	 */
	public CuerpoCeleste() {
		// Start of user code constructor for CuerpoCeleste)
		super();
		// End of user code
	}

	/**
	 * Description of the method desplazamiento.
	 * @param i 
	 * @param j 
	 * @return 
	 */
	public float desplazamiento(int i, int j) {
		// Start of user code for method desplazamiento
		float desplazamiento = 0;
		if(i>0 || j>0) {
		desplazamiento=i+j;
		}else {
	    desplazamiento=-1;
	    }
		this.localizaciones=ubicacion.now();
		return desplazamiento;
				// End of user code
	}

	// Start of user code (user defined methods for CuerpoCeleste)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns localizaciones.
	 * @return localizaciones 
	 */
	public ubicacion getLocalizaciones() {
		return this.localizaciones;
	}

	/**
	 * Sets a value to attribute localizaciones. 
	 * @param newLocalizaciones 
	 */
	public void setLocalizaciones(ubicacion newLocalizaciones) {
		this.localizaciones = newLocalizaciones;
	}

	/**
	 * Returns composicion.
	 * @return composicion 
	 */
	public String getComposicion() {
		return this.composicion;
	}

	/**
	 * Sets a value to attribute composicion. 
	 * @param newComposicion 
	 */
	public void setComposicion(String newComposicion) {
		this.composicion = newComposicion;
	}

	@Override
	public String toString() {
		return "CuerpoCeleste [nombre=" + nombre + ", localizaciones=" + localizaciones + ", composicion=" + composicion
				+ "]";
	}

}
