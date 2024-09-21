public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int[] data = {22,54,21,398,48,0,4,9,67,45,60,74,81,27};
    
        int loopAmount = data.length - 1;

        for (int x = 0; x < loopAmount; x++) 
        {
            boolean swapped = false;

            for (int i = 0; i < loopAmount; i++) 
            {
                if(data[i] > data[i+1]) 
                {
                    int temp;
                    temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) break;
        }

        for (int i : data) 
        {
            System.out.print(i + " | ");
        }
    }
}