package Chapter06;

public class ControlFor {
    
    public static void main(String[] args) {
        ControlFor controlFor = new ControlFor();
        controlFor.forLoop(10);
    }

    public void forLoop(int until) {
        int sum = 0;
        for (int i = 1; i <= until; i++) {
            sum += i;
        }
        
        System.out.println("1 to " + until + " = " + sum);
    }
        
    
}
