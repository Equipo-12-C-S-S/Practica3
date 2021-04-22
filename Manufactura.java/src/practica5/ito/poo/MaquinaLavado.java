/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package practica5.ito.poo;
import java.time.LocalDate;
import practica5.ito.poo.Manufactura;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of MaquinaLavado.
 * 
 * @author Guadalupe
 */
public class MaquinaLavado extends Manufactura {
	
	public MaquinaLavado(String descripcion, float costo, LocalDate fechaAquisi, int capacidadLitros, float tiemProLavadoxbotella) {
		super(descripcion,costo,fechaAquisi);
		this.capacidadLitros = capacidadLitros;
		this.tiemProLavadoxbotella = tiemProLavadoxbotella;
	}
	private int capacidadLitros = 0;
	private float tiemProLavadoxbotella = 0F;
	/**
	 * Description of the method costoLavadodeBotella .
	 * @return 
	 */
	// Start of user code (user defined methods for MaquinaLavado)

	// End of user code
	/**
	 * Returns capacidadLitros.
	 * @return capacidadLitros 
	 */
	public int getCapacidadLitros() {
		return this.capacidadLitros;
	}

	/**
	 * Sets a value to attribute capacidadLitros. 
	 * @param newCapacidadLitros 
	 */
	public void setCapacidadLitros(int newCapacidadLitros) {
		this.capacidadLitros = newCapacidadLitros;
	}

	/**
	 * Returns tiemProLavadoxbotella.
	 * @return tiemProLavadoxbotella 
	 */
	public float getTiemProLavadoxbotella() {
		return this.tiemProLavadoxbotella;
	}

	/**
	 * Sets a value to attribute tiemProLavadoxbotella. 
	 * @param newTiemProLavadoxbotella 
	 */
	public void setTiemProLavadoxbotella(float newTiemProLavadoxbotella) {
		this.tiemProLavadoxbotella = newTiemProLavadoxbotella;
	}
	public float costoLavadodeBotella() {
		// Start of user code for method costoLavadodeBotella 
		float costoLavadodeBotella=0f;
		float costodemaqui=super.getCosto()*0.5f/100f;
		float tiempo=60f/this.getTiemProLavadoxbotella();
		 float costoLavado=costodemaqui/tiempo;
		 costoLavadodeBotella =+costoLavado;
	      return costoLavadodeBotella;
	}

	@Override
	public String toString() {
		return "MaquinaLavado [capacidadLitros=" + capacidadLitros + ", tiemProLavadoxbotella=" + tiemProLavadoxbotella
				+"descripcion="+ getDescripcion()+ "costo="+getCosto()+"fechaAquisi="+getFechaAquisi()+"]";
	}

}
