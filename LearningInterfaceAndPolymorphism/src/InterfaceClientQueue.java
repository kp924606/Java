import java.util.ArrayList;
public class InterfaceClientQueue {
	private ArrayList clients=new ArrayList(); // 收集連線的Client。
	private ArrayList listeners=new ArrayList(); // 收集對ClientQueue有興趣的ClientListener。
	
	public void addClientListener(InterfaceClientListener listener){ // 註冊 InterfaceClientListener。
		listeners.add(listener); 
	}
	public void add(InterfaceClient client){ 
		clients.add(client);	// 新增client。
		InterfaceClientEvent event=new InterfaceClientEvent(client); // 通知資訊包裝成InterfaceClientEvent。
		for(int i=0;i<listeners.size();i++){
			InterfaceClientListener listener=(InterfaceClientListener)listeners.get(i);
			listener.clientAdded(event);
		}
	}
	public void remove(InterfaceClient client){ 
		clients.remove(client);	// 刪除client。
		InterfaceClientEvent event=new InterfaceClientEvent(client); // 通知資訊包裝成InterfaceClientEvent。
		for(int i=0;i<listeners.size();i++){
			InterfaceClientListener listener=(InterfaceClientListener)listeners.get(i);
			listener.clientRemoved(event);
		}
	}	
}
