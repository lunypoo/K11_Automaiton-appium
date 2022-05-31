package lab_03;

public class FlowControlKeyword {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            //continue: skip 1 vong ra khoi vong lap
            // break: thoat ra khoi vong lap do
            if(i == 3) continue;
            System.out.println(i);

        }
    }
}
