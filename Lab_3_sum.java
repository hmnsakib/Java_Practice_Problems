/**
 * Lab_3_problem_1
 */
public class Lab_3_sum {

    int x, y, sum;

    void setValue(int a, int b) {
        x = a;
        y = b;
    }

    void Display() {
        sum = x + y;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Lab_3_sum sum = new Lab_3_sum();
        sum.setValue(10, 20);
        sum.Display();
    }
}