// 第一類:109-變數範圍
public class JPD109 { 
  
    public static int adder (int s, int a, int e) { 
        return s+a+e;                                    
    } 
   
    public static int gameRating (int s, int a, int e) { 
        return adder(s,a,e);                                      
    } 
  
    public static void main (String argv[]) { 
        int skill = 6, action = 9, excitment = 8, result; 
        result = gameRating(skill, action, excitment); 
        System.out.print("The rating of the game is "); 
        System.out.println(result);                        
    } 
} 
