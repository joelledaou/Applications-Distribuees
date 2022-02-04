// Implémentation du serveur qui hérite la classe java.rmi.server.UnicastRemoteObject et qui implémente l'interface Calculator (le contrat)

public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject implements Calculator {

	public CalculatorImpl() throws java.rmi.RemoteException { 
		super();    // appel au constructeur de UnicastRemoteObject qui va exporter l'objet serveur (instance de CalculatorImpl) pour qu'il soit accessible à distance
	} 

	public long add(long a, long b) throws java.rmi.RemoteException { 
		return a + b;
	} 

	public long sub(long a, long b) throws java.rmi.RemoteException { 
		return a - b; 
	}
 
	public long mul(long a, long b) throws java.rmi.RemoteException { 
		return a * b;
	} 
	
	public long div(long a, long b) throws java.rmi.RemoteException { 
		return a / b; 
	} 

}