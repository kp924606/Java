public class MathTool {
	public static int sum(int...numbers){ // ���w���פ޼ơC
		int sum=0;
		for(int number:numbers){
			sum+=number;
		}		
		return sum;		
	}	
	public static void main(String[] args) {
		System.out.println(sum(1,2));		// 3�C
		System.out.println(sum(1,2,3)); 	// 6�C
		System.out.println(sum(1,2,3,4)); 	// 10�C
		
	}
}
