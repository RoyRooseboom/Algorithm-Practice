public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {22,54,21,398,48,0,4,9,67,45,60,74,81,27};
    
        BubbleSort bs = new BubbleSort();
        bs.Sort(data);
    }

    public void Sort(int[] dataList) {

        int loopAmount = dataList.length - 1;

        for (int x = 0; x < loopAmount; x++) {
            for (int i = 0; i < loopAmount; i++) {
                if(dataList[i] > dataList[i+1]) {

                    int temp;
                    temp = dataList[i];
                    dataList[i] = dataList[i+1];
                    dataList[i+1] = temp;

                }
            }
        }

        for (int i : dataList) {
            System.out.print(i + " | ");
        }
    }
}