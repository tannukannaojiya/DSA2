package newtonschoolassiment;

public class student {
    String name;
    int rollNo;
    student(String studName,int studRoll){
        name=studName;
        rollNo=studRoll;
        System.out.println("Constructor is called");
    }

public class  simpleClassExample{
    public static void main(String[] args){
        student s1=new student("Newton",111);
        // s1.name="Newton";
        // s1.rollNo=111;
        System.out.println(s1.name+" "+s1.rollNo);
    }
}
}