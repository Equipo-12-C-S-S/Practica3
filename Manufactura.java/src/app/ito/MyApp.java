package app.ito;
import java.time.LocalDate;

import practica5.ito.poo.MaquinaEmpaquetado;
import practica5.ito.poo.MaquinaLavado;
import practica5.ito.poo.MaquinaLlenadoEnvasado;
public class MyApp {
	
	static void run() {
	
		MaquinaLavado mql=new MaquinaLavado("Maquina de lavado",1500f,LocalDate.of(2021, 2, 10),80,20f);
		System.out.println(mql);
		System.out.println("Costo de lavado es "+mql.costoLavadodeBotella());
		MaquinaLlenadoEnvasado mle=new MaquinaLlenadoEnvasado("Maquina de llenado y emvasado",5000f,LocalDate.of(2021, 3, 11),15,20);
		System.out.println(mle);
		System.out.println("costo de llenado y envasado de una botella"+mle.costollenadoyenvasadodeBotella());
		MaquinaEmpaquetado me=new MaquinaEmpaquetado("Maquina de Empaquetado",8500f,LocalDate.of(2021, 2, 12),9 ,3);
		System.out.println(me);
		System.out.println("costo de empaquetado es "+me.costodeEmpaquetado());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
run();
	}

}
