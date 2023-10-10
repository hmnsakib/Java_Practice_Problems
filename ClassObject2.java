package class_1;

public class ClassObject2 {
    String name;
    int roll;
    float cg;
            
    public static void main(String[] args) {
    //ClassObject student1;         // object creat
    //student1 = new ClassObject(); // object initialize
      
        ClassObject2 student1 = new ClassObject2();
        ClassObject2 student2 = new ClassObject2();

        student1.name = "Jasim";
        student1.roll = 36;
        student1.cg = 3.9f;

        student2.name = "Jubayer";
        student2.roll = 17;
        student2.cg = 3.4f;

        System.out.println("Name: "+student1.name);
        System.out.println("Name: "+student1.roll);
        System.out.println("Name: "+student1.cg);

        System.out.println("Name: "+student2.name);
        System.out.println("Name: "+student2.roll);
        System.out.println("Name: "+student2.cg); 
    }
}
