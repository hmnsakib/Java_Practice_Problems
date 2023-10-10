/* public class D70 {
    
    //UDF/Method

    //main
    //obj
} */

public class D70 {// class contain method and object

    int roll = 16; // instance variable

    void dis() { // function/method
        //int num = 10; // local variable
        System.out.println(roll);// S: sout
    }

    public static void main(String[] args) {// S: psvm
        D70 ob; // object creation -> S: class_name object_name;
        ob = new D70(); // object initialization -> S: object_name = new_operator class_name();

        //D70 ob1 = new D70(); // object create and initialize at once
        ob.dis();
    }
}