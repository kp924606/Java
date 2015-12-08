package Collection;
import java.util.LinkedList;
import java.util.Queue;
interface Requset{
	void execute();
}
public class RequestQueue {
	public static void main(String[] args) {
		Queue<Requset> requests=new LinkedList<Requset>();
		for(int i=1;i<6;i++){
			requests.offer(new Requset(){
				public void execute(){
					System.out.printf("處理資料 %f%n",Math.random());
				}
			});
		}
		process(requests);
	}
	private static void process(Queue<Requset> requests){
		while(requests.peek()!=null){
			Requset request=requests.poll();
			request.execute();
		}
	}
}
