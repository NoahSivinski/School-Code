#include "Sort.h"

Sort::Sort() {
  size = 10000;
  count = 0;
} // Sort()

Sort::~Sort() {
  
} // ~Sort()

int* Sort::insertionSort(int* input) {
  int key; 
  int j;
    for (int i = 1; i < size; i++)
    {
        key = input[i];
        j = i - 1;
 
        /* Move elements of arr[0..i-1], that are
        greater than key, to one position ahead
        of their current position */
        while (j >= 0 && input[j] > key)
        {
            input[j + 1] = input[j];
            j = j - 1;
	    count++;
	}
        input[j + 1] = key;
    }
    return input;
} // insertionSort()

int* Sort::selectionSort(int* arr) {
  int j;
  int min_idx; 
  
  // One by one move boundary of unsorted subarray 
  for (int i = 0; i < size-1; i++) 
    { 
      // Find the minimum element in unsorted array 
      min_idx = i; 
      for (j = i+1; j < size; j++) { 
	count++;
	if (arr[j] < arr[min_idx]) {
	  min_idx = j;
	} // if
      } // for
      int temp = arr[min_idx]; 
      arr[min_idx] = arr[i]; 
      arr[i] = temp; 
      // Swap the found minimum element with the first element 
      //swap(&arr[min_idx], &arr[i]); 
    } 
  return arr;
} // selectionSort()

int* Sort::mergeSort(int arr[], int l, int r) {
   if(l>=r){
        return arr;//returns recursively
    }
    int m =l+ (r-l)/2;
    mergeSort(arr,l,m);
    mergeSort(arr,m+1,r);
    merge(arr,l,m,r);
  return arr;
} // mergeSort()

void Sort::merge(int arr[], int l, int m, int r)
{
    int n1 = m - l + 1;
    int n2 = r - m;
 
    // Create temp arrays
    int* L = new int[n1];
    int* R = new int[n2];
 
    // Copy data to temp arrays L[] and R[]
    for (int i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (int j = 0; j < n2; j++)
        R[j] = arr[m + 1 + j];
 
    // Merge the temp arrays back into arr[l..r]
 
    // Initial index of first subarray
    int i = 0;
 
    // Initial index of second subarray
    int j = 0;
 
    // Initial index of merged subarray
    int k = l;
 
    while (i < n1 && j < n2) {
      count++;
      if (L[i] <= R[j]) {
	arr[k] = L[i];
	i++;
      }
      else {
	arr[k] = R[j];
	j++;
      }
      k++;
    } // while
    
    // Copy the remaining elements of
    // L[], if there are any
    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    } // while
 
    // Copy the remaining elements of
    // R[], if there are any
    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    } // while
    
} // merge()

int* Sort::heapSort(int arr[]) {
  // Convert the array of input values into a heap
  for (int i = size/2-1; i >= 0; i--) {
    reheapDown(arr, i, size - 1);
  }
  
  // Sort the array and the resulting heap
  for (int j = size-1; j >= 1; j--) {
    int temp = arr[0]; 
    arr[0] = arr[j]; 
    arr[j] = temp; 
    reheapDown(arr, 0, j-1);
  }
  
  return arr;
} // heapSort

void Sort::reheapDown(int arr[], int root, int bottom) {
  int max = root;
  int left = 2 * root + 1;
  int right = 2 * root + 2;
  
  // Determine index of child with larger/maximum value than root node
  if (left <= bottom) {
    if (left == bottom)
      max = left;
    else {
      if (arr[left] <= arr[right])
	max = right;
      else
	max = left;
    }
    
    // Swap root with maximum child while ensuring shape and order properties of heap are maintained.
    count++;
    if (arr[root] < arr[max]) {
      int temp = arr[root]; 
      arr[root] = arr[max]; 
      arr[max] = temp; 
      reheapDown(arr, max, bottom);
    }
  }
} // reheapDown()


int* Sort::quickSort(int arr[], int first, int last) {
  if (first < last) {
  // Split array according determined splitting value
  int splitPt = last;
  splitArray(arr, first, last, splitPt);
  // Quick sort elements <= splitting value
  quickSort(arr, first, splitPt-1);
  // Quick sort elements > splitting value
  quickSort(arr, splitPt+1, last);
  return arr;
  }
  return arr;
} // quickSort


void Sort::splitArray(int arr[], int first, int last, int& splitPoint) {
  //Splitting value based on the value of the first index of the array
  int splitVal = arr[first];
  int firstPlacehold = first;
  bool correctSide;
  
  first++;
  do {
    correctSide = true;
    // Move values of first index towards the middle while searching for values on wrong side of splitting value
    while (correctSide) {
      if (arr[first] > splitVal) {
	correctSide = false;
      } else {
	first++;
	correctSide = (first <= last);
      }
    }
    count++;
    
    
    correctSide = (first <= last);
    // Move values of last index towards the middle while searching for values on wrong side of splitting value
    while (correctSide) {
      if (arr[last] <= splitVal)
	correctSide = false;
      else {
	last--;
	correctSide = (first <= last);
      }
    } // while
    count++;
    
    // Place value at indexes first and last on the correct sides of splitting value
    if (first < last) {
      int temp = arr[first]; 
      arr[first] = arr[last]; 
      arr[last] = temp; 
      first++;
      last--;
    }
  } while (first <= last);
  
  splitPoint = last;
  int temp = arr[firstPlacehold]; 
  arr[firstPlacehold] = arr[splitPoint]; 
  arr[splitPoint] = temp; 
} // Split()

int Sort::getCount() {
  return count;
} // getCount
