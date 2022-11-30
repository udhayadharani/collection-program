package CollectionExercisesEx;
import java.util.ArrayList;
public class Collection3 {
    public static void main(String[] args) {
        ArrayList<Student>details=new ArrayList<Student>();
        Student obj=new Student();
        obj.setFirstName("udhaya");
        obj.setLastName("dharani");
        obj.setPhoneNumber("6382684412");
        details.add(obj);

        System.out.println("firstname:"+obj.getFirstName());
        System.out.println("lastname:"+obj.getLastName());
        System.out.println("phonenumber:"+obj.getPhoneNumber());
    }

}
