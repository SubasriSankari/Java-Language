
package my_pack;

public class InputForBMI{
    
        float height;
        float weight;

        void setData(float height , float weight)
        {
            this.height = height;
            this.weight = weight;
        }

        float getBMI(){
            float bmi = (100 * 100 * weight) / (height * height);
            return bmi;
        }

} 