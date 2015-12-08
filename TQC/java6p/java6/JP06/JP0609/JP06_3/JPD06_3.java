
...

public class JPD06_3 {
    public static void main(String args[]) {
        TraceUnboundedStack s2 = new TraceUnboundedStack();
        s2.push("abc");
        s2.push("def");
        s2.push("ghi");
        s2.push("jkl");
        System.out.println(s2.getSize());
        System.out.println(s2.top());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.empty());
        System.out.println(s2.pop());
        System.out.println(s2.empty());
        System.out.println(s2.getSize());
    }
}