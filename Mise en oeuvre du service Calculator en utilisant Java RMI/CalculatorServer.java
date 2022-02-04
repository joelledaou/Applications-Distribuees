import java.rmi.Naming;

public class CalculatorServer { 

	public CalculatorServer() { 

		try { 
			Calculator c = new CalculatorImpl(); //Exportation implicite 

			//Bind sur le rmiregistry pour associer ce nom à l'objet CalculatorImpl

			Naming.rebind("rmi://localhost:1099/CalculatorService", c);       // c'est le nom de la machine (localhost) et le numéro de port (1099) sur lesquels est demarré le service de Naming
											  // ce numéro de port n'a rien à voir avec celui de l'accès socket (où l'on a exporté l'objet CalculatorImpl)
										
		} catch (Exception e) { 
			System.out.println("Trouble: " + e);
		}

	} 

	
	public static void main(String args[]) { 
		new CalculatorServer(); 
	}

}