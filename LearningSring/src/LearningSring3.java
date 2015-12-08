
public class LearningSring3 {
	public static void main(String[] args) {
		long sum=0;
		for(String arg:args){
			sum+=Long.parseLong(arg); // ±Narg¬°Long¡C
		}
		System.out.println("¥­§¡¡G"+(float)sum/args.length);
	}
}
