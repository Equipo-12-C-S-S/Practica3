package app.ito.poo;
import observatorio.ito.poo.CuerpoCeleste;
import observatorio.ito.poo.ubicacion;

public class MyApp {

	static void run() {
		CuerpoCeleste c;
		ubicacion u;
		
		c=new CuerpoCeleste("luna","elio");
		System.out.println(c);
		u=new ubicacion (89.00f,77899.0988f,"5 meses",56789.89f);
		System.out.println(u);
		System.out.println("Esta es tu nueva localización "+c.desplazamiento(55,1));
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     run();
}

}
