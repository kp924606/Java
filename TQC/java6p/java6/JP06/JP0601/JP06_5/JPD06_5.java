
...

public class JPD06_5 {
    public static void main(String args[]) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("wrongdata.txt"));
        } catch (FileNotFoundException e) {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
        
        Wharehouse wh = new Wharehouse();
        
        ...
        
        System.out.println("Total cost: " + wh.TotalCost());   
        System.out.println("Total price: " + wh.TotalPirce()); 
    }	
}