package app.ito.poo;
import industria_calzado.ito.poo.Calzado;

public class MyApp {

	static void run() {
		Calzado cal;
		
		cal=new Calzado(190530,"cuero","zapto",500,"negro");
		System.out.println(cal);
		System.out.println("EL Costo por lote es "+cal.costoxLote(600));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     run();
	}

}
 