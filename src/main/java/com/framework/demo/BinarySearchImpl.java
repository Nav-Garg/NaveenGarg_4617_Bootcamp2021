package com.framework.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    //Constructor Injection
    public BinarySearchImpl(SortAlgorithm sortAlgorithm)
    {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        /*
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
         */
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        System.out.println("Sorted Array List");
        for(int element: sortedNumbers)
            System.out.println(element);

        // Search the array
        int n = sortedNumbers.length;
        int res = binarySearch(sortedNumbers, 0, n - 1, numberToSearchFor);
        if (res >= 0)
            return res;
        else
            return -1;
    }

    public int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
