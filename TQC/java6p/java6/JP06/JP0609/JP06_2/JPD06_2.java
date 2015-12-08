
...

public class JPD06_2 {
    public static void main(String args[]) {
        UnboundedStack s = new UnboundedStack();
        s.push("abc");
        s.push("def");
        s.push("ghi");
        s.push("jkl");

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.empty());
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}