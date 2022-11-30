package Com.ModelEx;
import java.util.ArrayList;
import java.util.List;

class Teacher {
    public static void main(String[] args) {
        Teacher1 teacher1 = new Teacher1("udhaya", "M.sc", "ond", 3, 23);
        Teacher1 teacher2 = new Teacher1("Selvi", "B.sc", "ond", 2, 21);
        Teacher1 teacher3 = new Teacher1("Shruthika", "B.sc", "tnd", 2, 25);
        Teacher1 teacher4 = new Teacher1("vaishali", "B.E", "thanjavur", 5, 32);
        Teacher1 teacher5 = new Teacher1("Shanthi", "B.A", "tnd", 3, 34);
        Teacher1 teacher6 = new Teacher1("Dharshini", "B.tech", "thanjavur", 5, 29);
        Teacher1 teacher7 = new Teacher1("Sanjay", "B.sc", "ond", 7, 35);
        Teacher1 teacher8 = new Teacher1("Raj", "B.E", "tnd", 5, 27);
        Teacher1 teacher9 = new Teacher1("Agalya", "M.sc", "ond", 4, 21);
        Teacher1 teacher10 = new Teacher1("jothika", "BCA", "thanjavur", 2, 56);


        ArrayList<Teacher1> list = new ArrayList<>();
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        list.add(teacher4);
        list.add(teacher5);
        list.add(teacher6);
        list.add(teacher7);
        list.add(teacher8);
        list.add(teacher9);
        list.add(teacher10);

        System.out.println(method1(list, "ond"));
        System.out.println(method2(list, "thanjavur", 2));
        System.out.println(method3(list, 21, "ond"));
        System.out.println(method4(list, "B.sc", 20));
        System.out.println(method5(list, 35));


    } public static int method1(List<Teacher1> teach1List, String location) {
        int count = 0;
        for (Teacher1 teach1 : teach1List) {
            if (teach1.getLocation() == location) {
                count++;
            }
        }
        return count;
    } public static int method2(List<Teacher1> teach2list, String location, int standard) {
        int count = 0;
        for (Teacher1 teacher : teach2list) {
            if (teacher.getLocation() == location && teacher.getStandard() == standard) {
                count++;
            }
        }
        return count;
    }

    public static int method3(List<Teacher1> teach3List, int age, String location) {
        int count = 0;
        int sum = 0;
        for (Teacher1 teacher : teach3List) {
            if (teacher.getLocation() == location) {
                sum += teacher.getAge();
                count++;

            }
        }
        return sum;
    }

    public static int method4(List<Teacher1> teacher4List, String degree, int age) {
        int count = 0;
        for (Teacher1 teacher : teacher4List) {
            if (teacher.getAge() > 20 && teacher.getAge() < 40) {
                count++;
            }
        }
        return count;

    }

    public static int method5(List<Teacher1> teacher5List, int age) {
        int count = 0;
        for (Teacher1 teacher : teacher5List) {
            if (teacher.getAge() < age) {
                count++;
            }
        }
        return count;
    }
}


