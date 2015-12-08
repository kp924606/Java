
public class InterfaceClientEvent {
	private InterfaceClient InterfaceClient;
	public InterfaceClientEvent(InterfaceClient InterfaceClient){
		this.InterfaceClient=InterfaceClient;		
	}
	public String getName(){
		return InterfaceClient.name;
	}	
	public String getIp(){
		return InterfaceClient.ip;
	}
}
