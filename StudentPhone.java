import java.util.*;

public class StudentPhone{

    int roll_num;
    String phone_number;
    String address;
    static String name = "Sam";

    StudentPhone(int roll_num, String phone_number, String address)
    {
        this.roll_num = roll_num;
        this.phone_number = phone_number;
        this.address = address;
    }

    static void ChangeName(){
        name = "John";
    }

    void Display(){
        System.out.println("Roll Number " + roll_num + " Name " + name + " Phone Number " + phone_number + " Address " + address);
    }

    public static void main(String[] args) {

        StudentPhone obj = new StudentPhone(2,"9186347982","46,kovil Street");
        obj.Display();
        StudentPhone.ChangeName();
        StudentPhone obj1 = new StudentPhone(5,"6129381981","31,vinayagar kovil Street");
        obj1.Display();
               
    }
}