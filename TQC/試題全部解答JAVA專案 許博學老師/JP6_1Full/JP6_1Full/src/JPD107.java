// 第一類:107-運動成績
public class JPD107 {
    public static void main(String argv[]) {
        int action = 1, skill = 2, teamgame = 3;

        System.out.println("The basketball grade is " + Basketball.calGrade(action,skill,teamgame));
        System.out.println("The baseball grade is " + Baseball.calGrade(skill,teamgame));
    }
}

class Basketball {
    static int calGrade(int a, int s, int t) {
        return a + s + t;
    }
}

class Baseball {
    static int calGrade(int s, int t) {
        return 10 + s + t;
    }
}
