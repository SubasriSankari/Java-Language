
abstract class Marks{
    abstract void getPercentage();
}

class A extends Marks{
    int num1;
    int num2;
    int num3;

    A(int num1, int num2, int num3)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    void getPercentage(){
        float perc = (num1 + num2 + num3)/3;
        System.out.println("The Percentage of Student A is " + perc);
    }
}

class B extends Marks{
    int num1;
    int num2;
    int num3;
    int num4;

    B(int num1, int num2, int num3, int num4)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }
    void getPercentage(){
        float perc = (num1 + num2 + num3 + num4)/4;
        System.out.println("The Percentage of Student A is " + perc);
    }
}

public class AbstractPercentage{
    public static void main(String args[])
    {
        Marks obj;
        obj = new A(50, 55, 39);
        obj.getPercentage();
        obj = new B(70, 85, 90, 59);
        obj.getPercentage();
    }
}