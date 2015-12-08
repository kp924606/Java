import java.util.ArrayList;
public class InterfaceClientQueue {
	private ArrayList clients=new ArrayList(); // �����s�u��Client�C
	private ArrayList listeners=new ArrayList(); // ������ClientQueue�����쪺ClientListener�C
	
	public void addClientListener(InterfaceClientListener listener){ // ���U InterfaceClientListener�C
		listeners.add(listener); 
	}
	public void add(InterfaceClient client){ 
		clients.add(client);	// �s�Wclient�C
		InterfaceClientEvent event=new InterfaceClientEvent(client); // �q����T�]�˦�InterfaceClientEvent�C
		for(int i=0;i<listeners.size();i++){
			InterfaceClientListener listener=(InterfaceClientListener)listeners.get(i);
			listener.clientAdded(event);
		}
	}
	public void remove(InterfaceClient client){ 
		clients.remove(client);	// �R��client�C
		InterfaceClientEvent event=new InterfaceClientEvent(client); // �q����T�]�˦�InterfaceClientEvent�C
		for(int i=0;i<listeners.size();i++){
			InterfaceClientListener listener=(InterfaceClientListener)listeners.get(i);
			listener.clientRemoved(event);
		}
	}	
}
