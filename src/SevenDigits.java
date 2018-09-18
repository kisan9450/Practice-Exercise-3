import java.lang.Math;
public class SevenDigits {
    public boolean checkDigits(int[] input){
        for(int i=0;i<input.length-1;i++)
        {
            if(Math.abs(input[i]-input[i+1])!=1)
                return false;
        }
        return true;
    }
}
