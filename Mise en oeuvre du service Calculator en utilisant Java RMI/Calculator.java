// C'est le contrat: il hérite l'interface java.rmi.Remote et contient la déclaration des méthodes qui seront vues et utilisées par les clients distants

public interface Calculator extends java.rmi.Remote {
 
	public long add(long a, long b)throws java.rmi.RemoteException; 
	public long sub(long a, long b)throws java.rmi.RemoteException; 
	public long mul(long a, long b)throws java.rmi.RemoteException;
	public long div(long a, long b) throws java.rmi.RemoteException; 

}