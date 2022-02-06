package my_pack;

public class GetBMI{
    float bmi;
    void setBMI(float bmi)
    {
        this.bmi = bmi;
    }
    void getBMI(){
        if( bmi > 18.5 )
            System.out.println("You are underweight");
        else if( bmi < 25 )
            System.out.println("You are normal");
        else if( bmi < 30 )
            System.out.println("You are overweight");
        else 
            System.out.println("You are obese");
    }
}