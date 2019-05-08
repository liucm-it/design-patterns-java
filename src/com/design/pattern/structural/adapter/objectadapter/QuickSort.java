package design.pattern.structural.adapter.objectadapter;


// 快速排序类：适配者(需要适配的对象)
public class QuickSort {
    public int[] quickSort(int array[]) {
        sort(array, 0, array.length - 1);
        return array;
    }

    private void sort(int[] array, int p, int r) {
        int q = 0;
        if (p < r) {
            q = partition(array, p, r);
            sort(array, p, q - 1);
            sort(array, q + 1, r);
        }
    }

    private int partition(int[] array, int p, int r) {
        int x = array[r];
        int j = p - 1;
        for (int i = p; i <= r - 1; i++) {
            if (array[i] <= x) {
                j++;
                swap(array, j, i);
            }
        }
        swap(array, j + 1, r);
        return j + 1;
    }

    private void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
