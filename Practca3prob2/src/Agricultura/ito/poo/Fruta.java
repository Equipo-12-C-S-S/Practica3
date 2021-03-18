/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Agricultura.ito.poo;

import java.time.LocalDate;
import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Fruta.
 * 
 * @author Paola
 */
public class Fruta {
	public Fruta(String nombre, float extension,ArrayList<String> tiempoCosecha, ArrayList<Float> cantCosechaxtiempo,float costoPromedio, float precioVentaProm) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tiempoCosecha = tiempoCosecha;
		this.cantCosechaxtiempo = cantCosechaxtiempo;
		this.costoPromedio = costoPromedio;
		this.precioVentaProm = precioVentaProm;
	}

	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";

	/**
	 * Description of the property extension.
	 */
	private float extension = 0F;

	/**
	 * Description of the property tiempoCosecha.
	 */
	private ArrayList<String> tiempoCosecha = new ArrayList<String>();

	/**
	 * Description of the property cantCosechaxtiempo.
	 */
	private ArrayList<java.lang.Float> cantCosechaxtiempo = new ArrayList<java.lang.Float>();

	/**
	 * Description of the property costoPromedio.
	 */
	private float costoPromedio = 0F;

	/**
	 * Description of the property precioVentaProm.
	 */
	private float precioVentaProm = 0F;

	// Start of user code (user defined attributes for Fruta)

	// End of user code

	/**
	 * The constructor.
	 */
	public Fruta() {
		// Start of user code constructor for Fruta)
		super();
		// End of user code
	}


	/**
	 * Description of the method agregarPeriodo.
	 * @param periodo 
	 * @param cantEstimada 
	 */
	public void agregarPeriodo(String periodo, float cantEstimada) {
		// Start of user code for method agregarPeriodo
		this.tiempoCosecha.add(periodo);
		this.cantCosechaxtiempo.add(Float.parseFloat(periodo)*cantEstimada);	
		
		// End of user code
	}

	/**
	 * Description of the method eliminaPeriodo.
	 * @param i 
	 * @return 
	 */
	public boolean eliminaPeriodo(int i) {
		// Start of user code for method eliminaPeriodo
		boolean eliminaPeriodo = false;
		if(i){
			this.eliminaPeriodo.remove(i);
			eliminaPeriodo = false;
		}
		
		return eliminaPeriodo;
		// End of user code
	}

	/**
	 * Description of the method costoPeriodo.
	 * @param i 
	 * @return 
	 */
	public float costoPeriodo(int i) {
		// Start of user code for method costoPeriodo
		float costoPeriodo = 0F;
		return costoPeriodo;
		// End of user code
	}

	/**
	 * Description of the method ganancia.
	 * @param i 
	 * @return 
	 */
	public float ganancia(int i) {
		// Start of user code for method ganancia
		float ganancia = 0F;
		return ganancia;
		// End of user code
	}

	// Start of user code (user defined methods for Fruta)

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
	 * Returns extension.
	 * @return extension 
	 */
	public float getExtension() {
		return this.extension;
	}

	/**
	 * Sets a value to attribute extension. 
	 * @param newExtension 
	 */
	public void setExtension(float newExtension) {
		this.extension = newExtension;
	}

	/**
	 * Returns tiempoCosecha.
	 * @return tiempoCosecha 
	 */
	public ArrayList<String> getTiempoCosecha() {
		return this.tiempoCosecha;
	}

	/**
	 * Returns cantCosechaxtiempo.
	 * @return cantCosechaxtiempo 
	 */
	public ArrayList<java.lang.Float> getCantCosechaxtiempo() {
		return this.cantCosechaxtiempo;
	}

	/**
	 * Returns costoPromedio.
	 * @return costoPromedio 
	 */
	public float getCostoPromedio() {
		return this.costoPromedio;
	}

	/**
	 * Sets a value to attribute costoPromedio. 
	 * @param newCostoPromedio 
	 */
	public void setCostoPromedio(float newCostoPromedio) {
		this.costoPromedio = newCostoPromedio;
	}

	/**
	 * Returns precioVentaProm.
	 * @return precioVentaProm 
	 */
	public float getPrecioVentaProm() {
		return this.precioVentaProm;
	}

	/**
	 * Sets a value to attribute precioVentaProm. 
	 * @param newPrecioVentaProm 
	 */
	public void setPrecioVentaProm(float newPrecioVentaProm) {
		this.precioVentaProm = newPrecioVentaProm;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", extension=" + extension + ", tiempoCosecha=" + tiempoCosecha
				+ ", cantCosechaxtiempo=" + cantCosechaxtiempo + ", costoPromedio=" + costoPromedio
				+ ", precioVentaProm=" + precioVentaProm + "]";
	}

}
