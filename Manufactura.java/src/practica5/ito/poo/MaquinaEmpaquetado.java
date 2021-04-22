/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package practica5.ito.poo;
import java.time.LocalDate;
import practica5.ito.poo.Manufactura;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of MaquinaEmpaquetado.
 * 
 * @author Guadalupe
 */
public class MaquinaEmpaquetado extends Manufactura {
	
	public MaquinaEmpaquetado(String descripcion, float costo, LocalDate fechaAquisi, int tipoEmpaquetado,
			int cantidadEmpaquesxmn) {
		super(descripcion, costo, fechaAquisi);
		this.tipoEmpaquetado = tipoEmpaquetado;
		this.cantidadEmpaquesxmn = cantidadEmpaquesxmn;
	}

	private int tipoEmpaquetado =0;
	private int cantidadEmpaquesxmn = 0;

	// Start of user code (user defined attributes for MaquinaEmpaquetado)

	// End of user code

	/**
	 * The constructor.
	 */
	public MaquinaEmpaquetado() {
		// Start of user code constructor for MaquinaEmpaquetado)
		super();
		// End of user code
	}

	/**
	 * Description of the method costodeEmpaquetado.
	 * @return 
	 */
	

	// Start of user code (user defined methods for MaquinaEmpaquetado)

	// End of user code
	/**
	 * Returns tipoEmpaquetado.
	 * @return tipoEmpaquetado 
	 */
	public int getTipoEmpaquetado() {
		return this.tipoEmpaquetado;
	}

	/**
	 * Sets a value to attribute tipoEmpaquetado. 
	 * @param newTipoEmpaquetado 
	 */
	public void setTipoEmpaquetado(int newTipoEmpaquetado) {
		this.tipoEmpaquetado = newTipoEmpaquetado;
	}

	/**
	 * Returns cantidadEmpaquesxmn.
	 * @return cantidadEmpaquesxmn 
	 */
	public int getCantidadEmpaquesxmn() {
		return this.cantidadEmpaquesxmn;
	}

	/**
	 * Sets a value to attribute cantidadEmpaquesxmn. 
	 * @param newCantidadEmpaquesxmn 
	 */
	public void setCantidadEmpaquesxmn(int newCantidadEmpaquesxmn) {
		this.cantidadEmpaquesxmn = newCantidadEmpaquesxmn;
	}
	public float costodeEmpaquetado() {
		// Start of user code for method costodeEmpaquetado
		float costodeEmpaquetado = 0F;
		float costoempa=super.getCosto()*0.06f/100f;
		int empaque=this.getCantidadEmpaquesxmn()*this.getTipoEmpaquetado();
		float costoem=costoempa/empaque;
		costodeEmpaquetado=+costoem;
		return costodeEmpaquetado;
		// End of user code
	}
	@Override
	public String toString() {
		return "MaquinaEmpaquetado [tipoEmpaquetado=" + tipoEmpaquetado + ", cantidadEmpaquesxmn=" + cantidadEmpaquesxmn
				+"descripcion="+ getDescripcion()+ "costo="+getCosto()+"fechaAquisi="+getFechaAquisi()+"]";
	}

}
