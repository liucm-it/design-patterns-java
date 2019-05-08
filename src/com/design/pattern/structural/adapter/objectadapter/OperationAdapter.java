package design.pattern.structural.adapter.objectadapter;

public class OperationAdapter implements ScoreOperation {
    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public OperationAdapter() {
        quickSort = new QuickSort();
        binarySearch = new BinarySearch();
    }

    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    public int search(int[] array, int key) {
        return binarySearch.biarySearch(array, key);
    }
}
