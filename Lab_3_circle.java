/**
 * Lab_3_problem_2
 */
public class Lab_3_circle {

    double pi = 3.1416;
    int r;

    double calculation(double r) {
        double total = pi * r * r;
        return total;
    }

    public static void main(String[] args) {
        Lab_3_circle area = new Lab_3_circle();
        double radius = 3;
        double total = area.calculation(radius);
        System.out.println(total);
    }

}