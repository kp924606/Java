
...

public class JPD06_1 {
    public static void main(String args[]) {
        BoundedStack s = new BoundedStack(3);
        s.push("abc");
        s.push("def");
        s.push("ghi");
        s.push("jkl");
        
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}