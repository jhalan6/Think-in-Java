package csh.tij.test06_08;

public class ConnectionManager {
	private static Connection[] connections={Connection.creatConnection()};
	static Connection[] addConnections(){
		connections=new Connection[connections.length+1];
		return connections;
	}
	static Connection[] delConnections(){
		if (connections.length!=0) {
			connections=new Connection[connections.length-1];
		}
		return connections;
	}
	static Connection[] checkConnections(){
		if (connections.length!=0) {
			System.out.println("现有"+connections.length);
			return connections;
		}
		else {
			System.out.println("没了");
			return null;
		}
	}
}
	
class Connection{
	private Connection(){
	}
	static Connection creatConnection(){
		return new Connection();
	}
}