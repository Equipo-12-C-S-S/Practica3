package app.ito.poo;
import java.util.ArrayList;

import Agricultura.ito.poo.Fruta;
public class MyApp {

	static void run() {
		Fruta f;
		
	
        f=new Fruta("pera",20f,"90",40f,25f,30f);
		System.out.println(f);
        f.agregarPeriodo("60",60f);
        System.out.println(f);
		
 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      run();
	}

}
