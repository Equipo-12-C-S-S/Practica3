/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package practica5.ito.poo;
import java.time.LocalDate;
import practica5.ito.poo.Manufactura;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of MaquinaLlenadoEnvasado.
 * 
 * @author Guadalupe
 */
public class MaquinaLlenadoEnvasado extends Manufactura {
	
	public MaquinaLlenadoEnvasado(String descripcion, float costo, LocalDate fechaAquisi, int envaseLlenadoxminuto,
		int listaRegulacionml) {
		super(descripcion, costo, fechaAquisi);
		this.envaseLlenadoxminuto = envaseLlenadoxminuto;
		this.listaRegulacionml = listaRegulacionml;
	}

	private int envaseLlenadoxminuto = 0;
	private int listaRegulacionml = 0;

	// Start of user code (user defined attributes for MaquinaLlenadoEnvasado)

	// End of user code

	/**
	 * The constructor.
	 */
	public MaquinaLlenadoEnvasado() {
		// Start of user code constructor for MaquinaLlenadoEnvasado)
		super();
		// End of user code
	}

	/**
	 * Description of the method costollenadoyenvasadodeBotella.
	 * @return 
	 */

	// Start of user code (user defined methods for MaquinaLlenadoEnvasado)

	// End of user code
	/**
	 * Returns envaseLlenadoxminuto.
	 * @return envaseLlenadoxminuto 
	 */
	public int getEnvaseLlenadoxminuto() {
		return this.envaseLlenadoxminuto;
	}

	/**
	 * Sets a value to attribute envaseLlenadoxminuto. 
	 * @param newEnvaseLlenadoxminuto 
	 */
	public void setEnvaseLlenadoxminuto(int newEnvaseLlenadoxminuto) {
		this.envaseLlenadoxminuto = newEnvaseLlenadoxminuto;
	}

	/**
	 * Returns listaRegulacionml.
	 * @return listaRegulacionml 
	 */
	public int getListaRegulacionml() {
		return this.listaRegulacionml;
	}

	/**
	 * Sets a value to attribute listaRegulacionml. 
	 * @param newListaRegulacionml 
	 */
	public void setListaRegulacionml(int newListaRegulacionml) {
		this.listaRegulacionml = newListaRegulacionml;
	}
	public float costollenadoyenvasadodeBotella() {
		// Start of user code for method costollenadoyenvasadodeBotella
		float costollenadoyenvasadodeBotella = 0F;
		float costoma=super.getCosto()*0.25f/100f;
		float costoemvaylle=costoma/this.getEnvaseLlenadoxminuto();
		costollenadoyenvasadodeBotella = +costoemvaylle;
		return costollenadoyenvasadodeBotella;
		// End of user code
	}
	@Override
	public String toString() {
		return "MaquinaLlenadoEnvasado [envaseLlenadoxminuto=" + envaseLlenadoxminuto + ", listaRegulacionml="
				+ listaRegulacionml +"descripcion="+ getDescripcion()+ "costo="+getCosto()+"fechaAquisi="+getFechaAquisi()+ "]";
	}

}
