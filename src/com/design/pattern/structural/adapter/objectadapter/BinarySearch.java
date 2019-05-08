package design.pattern.structural.adapter.objectadapter;

public class BinarySearch {
    public int biarySearch(int array[], int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = array[mid];
            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return 1; // 找到元素
            }
        }

        return -1; // 没有找到元素
    }
}
