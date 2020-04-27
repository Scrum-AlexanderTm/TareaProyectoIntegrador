import java.util.Scanner;

public class AsignarMision {


	public static void main(String[] arg)
	{
		System.out.println("Augusto Chanamé Gonzales \n");
		
		@SuppressWarnings("resource")
		Scanner Nombre = new Scanner(System.in);
		
		//Datos
		
		System.out.println("Cargando Mision...");
		System.out.println("Ingrese su nombre Agente: ");
		String NombreA = Nombre.nextLine();
		System.out.println("\n");
		System.out.println("Comprobando Identidad..."+"\n"+"Ingresos Sastifactorio");
		System.out.println("\n");
		System.out.println("Hola Agente: "+ NombreA+"\n"+"Asignando Mision...");
		
        //Escoge numero de 1 al 4
		int valorDado = (int) Math.floor(Math.random()*4+1);
		//System.out.println("Numero: " + valorDado);
		
		//El número dado en ValorDado asigna la mision
		//referencias a capitulos de KND
		
		if(valorDado==4) {
			System.out.println("Su mision es:");
			System.out.println("Operacion Q.U.E.D.A.R.T.E.E.N.C.A.S.A");
		}
		else if(valorDado==3) {
			System.out.println("Su mision es:");
			System.out.println("Operación: C.A.S.A.B.L.A.N.C.A.");
		}
		else if(valorDado==2) {
			System.out.println("Su mision es:");
			System.out.println("Operación: G.R.A.D.U.A.D.O.");
		}
		else
		{
			System.out.println("Su mision es:");
			System.out.println("Operación: Z.E.R.O.");
			
		}
		
		
		
		
		
	}
	
}
