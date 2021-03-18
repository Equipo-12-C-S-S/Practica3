/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package industria_calzado.ito.poo;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Calzado.
 * 
 * @author Paola
 */
public class Calzado {
	public Calzado(int clave, String material, String troquel, int cantProdxDia, String string) {
		super();
		this.clave = clave;
		this.material = material;
		this.troquel = troquel;
		this.cantProdxDia = cantProdxDia;
		this.colores = string;
	}

	/**
	 * Description of the property clave.
	 */
	private int clave = 0;

	/**
	 * Description of the property material.
	 */
	private String material = "";

	/**
	 * Description of the property troquel.
	 */
	private String troquel = "";

	/**
	 * Description of the property cantProdxDia.
	 */
	private int cantProdxDia = 0;

	/**
	 * Description of the property colores.
	 */
	private Serializable colores = new HashSet<String>();

	// Start of user code (user defined attributes for Calzado)

	// End of user code

	/**
	 * The constructor.
	 */
	public Calzado() {
		// Start of user code constructor for Calzado)
		super();
		// End of user code
	}

	/**
	 * Description of the method costoxLote.
	 * @param costoxUnida 
	 * @return 
	 */

	// Start of user code (user defined methods for Calzado)

	// End of user code
	/**
	 * Returns clave.
	 * @return clave 
	 */
	public int getClave() {
		return this.clave;
	}

	/**
	 * Sets a value to attribute clave. 
	 * @param newClave 
	 */
	public void setClave(int newClave) {
		this.clave = newClave;
	}

	/**
	 * Returns material.
	 * @return material 
	 */
	public String getMaterial() {
		return this.material;
	}

	/**
	 * Sets a value to attribute material. 
	 * @param newMaterial 
	 */
	public void setMaterial(String newMaterial) {
		this.material = newMaterial;
	}

	/**
	 * Returns troquel.
	 * @return troquel 
	 */
	public String getTroquel() {
		return this.troquel;
	}

	/**
	 * Sets a value to attribute troquel. 
	 * @param newTroquel 
	 */
	public void setTroquel(String newTroquel) {
		this.troquel = newTroquel;
	}

	/**
	 * Returns cantProdxDia.
	 * @return cantProdxDia 
	 */
	public int getCantProdxDia() {
		return this.cantProdxDia;
	}

	/**
	 * Sets a value to attribute cantProdxDia. 
	 * @param newCantProdxDia 
	 */
	public void setCantProdxDia(int newCantProdxDia) {
		this.cantProdxDia = newCantProdxDia;
	}

	/**
	 * Returns colores.
	 * @return colores 
	 */
	public HashSet<String> getColores() {
		return (HashSet<String>) this.colores;
	}
	
	public float costoxLote(float costoxUnida) {
	   float costoxLote=  cantProdxDia * costoxUnida;
		 return costoxLote;
}

	@Override
	public String toString() {
		return "Calzado [clave=" + clave + ", material=" + material + ", troquel=" + troquel + ", cantProdxDia="
				+ cantProdxDia + ", colores=" + colores + "]";
	}

}
