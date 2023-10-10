package class_1;

public class ClassObject3 {
    String name;
    int roll;
    float cg;
            
    //return_type Method_name(parameter){........}
    void dis(String a, int b, float c){
        System.out.println("Name: "+a);
        System.out.println("Roll: "+b);
        System.out.println("CGPA: "+c);
    }
    void set(String n, int r, float c){
        name = n;
        roll = r;
        cg = c;
    }
    
    public static void main(String[] args) {
     
        ClassObject3 student1 = new ClassObject3();
        ClassObject3 student2 = new ClassObject3();

        student1.set("Jasim", 36, 3.9f);
        student2.set("Jubayer", 17, 3.4f);
        
        student1.dis(student1.name, student1.roll, student1.cg);
        student2.dis(student2.name, student2.roll, student2.cg);
    }
}
