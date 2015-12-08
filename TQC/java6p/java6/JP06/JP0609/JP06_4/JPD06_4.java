
...

public class JPD06_4 {
    public static void main(String args[]) {
        UnboundedStack s = new UnboundedStack();
        s.push("abc");    
	s.push(2);    
	s.push("ghi");
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}