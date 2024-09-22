public class SelectionSort 
{
    public static void main(String[] args)
    {
        int[] data = {64, 33, 5, 86, 71};
        int n = data.length;

        for(int i = 0; i < n - 1; i++)
        {
            int min_index = i;
            for(int j = i+1; j < n; j++)
            {
                if(data[j] < data[min_index])
                {
                    min_index = j;
                }
            }
            
            int min_value = data[min_index];

            for(int k = min_index; k > i; k--)
            {
                data[k] = data[k-1];
            }
            data[i] = min_value;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(data[i] + " ");
        }
    }
}
