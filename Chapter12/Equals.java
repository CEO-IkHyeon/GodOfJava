package Chapter12;

public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalMethod2();   
    }

    public void equalMethod() {
        MemberDto obj1 = new MemberDto("익현");
        MemberDto obj2 = new MemberDto("익현");

        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }

    public void equalMethod2() {
        MemberDto obj1 = new MemberDto("익현");
        MemberDto obj2 = new MemberDto("익현");
        
       if (obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }
}
