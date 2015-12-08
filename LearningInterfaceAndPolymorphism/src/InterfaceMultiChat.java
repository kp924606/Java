
public class InterfaceMultiChat {
	public static void main(String[] args) {
		InterfaceClientQueue queue=new InterfaceClientQueue();
		queue.addClientListener(new InterfaceClientListener() {	
			public void clientRemoved(InterfaceClientEvent event) {
				System.out.printf("%s 從 %s 離線%n", event.getName(),event.getIp());				
			}			
			public void clientAdded(InterfaceClientEvent event) {
				System.out.printf("%s 從 %s 連線%n", event.getName(),event.getIp());				
			}
		});
		InterfaceClient c1=new InterfaceClient("127.0.0.1","CSU");
		InterfaceClient c2=new InterfaceClient("192.168.0.2","StartCraft");
		queue.add(c1);
		queue.add(c2);
		queue.remove(c1);
		queue.remove(c2);
	}
}
