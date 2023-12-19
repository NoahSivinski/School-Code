/**
!!!@)@#))#)IMPORTANT#(!)#(#!)(#!!!

IN Split method:
- Added count++ to line 100, AKA following first block of value comparisons to splitVal. 
- Moved other count++ to line 112 to match ^^

IN CeReport.txt:
- Updated number of comparisons count for quickSort algorithm w/ Big O complexities
- "Finished" Algorithm Analysis

Remaining Tasks:
- Extra Memory Space/Algorithm Analysis review
- Determine why running "main Ordered.txt" with Insertion prints large negative number instead of 0.
- Change Report.txt to report.txt and add filename "report.txt" on first line
- Change project directory name to sivinski_johnson_project5

Please let me know if I need to submit or do anything else before 4pm. I'm not sure
of my availability afterwards.

-cj
*/


int* Sort::heapSort(int arr[]) {
  // Convert the array of input values into a heap
  for (int i = size/2-1; i >= 0; i--) {
    ReheapDown(arr, i, numElements - 1);
  }
  
  // Sort the array and the resulting heap
  for (int j = size-1; j >= 1; j--) {
    int temp = arr[0]; 
    arr[0] = arr[j]; 
    arr[j] = temp; 
    ReheapDown(arr, 0, j-1);
  }
  
  return arr;
}

void ReheapDown(int arr[], int root, int bottom) {
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
    if (arr[root] < arr[max]) {
      int temp = arr[root]; 
      arr[root] = arr[max]; 
      arr[max] = temp; 
      ReheapDown(max, bottom);
    }
  }
}

int* quickSort(int arr[], int first, int last) {
  if (first < last) {
    // Split array according determined splitting value
    int splitPt;
    Split(arr, first, last, splitPt);
    // Quick sort elements <= splitting value
    quickSort(arr, first, splitPt-1);
    // Quick sort elements > splitting value
    quickSort(arr, splitPt+1, last);
    return arr;
  }
}

void Split(int arr[], int first, int last,
	   int& splitPoint) {
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
    }
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
}
