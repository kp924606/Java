public class MathTool {
	public static int sum(int...numbers){ // 不定長度引數。
		int sum=0;
		for(int number:numbers){
			sum+=number;
		}		
		return sum;		
	}	
	public static void main(String[] args) {
		System.out.println(sum(1,2));		// 3。
		System.out.println(sum(1,2,3)); 	// 6。
		System.out.println(sum(1,2,3,4)); 	// 10。
		
	}
}
