public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();

        int[] dataNumbers = {8,5,9,2,7,3,5,6,4};

        sort.sort(dataNumbers);

    }

    public void sort(int[] data) {
        // we start at index 1 ( or the second position) because we assume the first item is already in the correct possition.
        for(int i = 1; i < data.length; i++) {
            int current = data[i];
            int previousItem = i - 1;

            while (previousItem >= 0 && data[previousItem] > current) {
                data[previousItem + 1] = data[previousItem];
                previousItem--;
            }

            data[previousItem + 1] = current;
        }

        for(int item : data) {
            System.out.print(item + " | ");
        }
    }

}