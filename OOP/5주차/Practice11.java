import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
	int num = 0;
	
	System.out.print("Enter the number of elements : ");
	Scanner input = new Scanner(System.in);
	num = input.nextInt();
	
	int[] array = new int[num];
	System.out.print("Enter a list : ");
	
	for(int i = 0; i<num ; i++) {
		array[i] = input.nextInt();
	}
	
	quick(array, 1, array.length-1);
	
	System.out.print("After the partition, the list is ");
	
	for(int i = 0; i<num;i++) {
		System.out.print(array[i]+" ");
	}
	}


public static int quick(int arr[], int left, int right) {
	int pivot = arr[0];
	int pivot_location = 0;
	int temp;
	
	while (left < right) {
		while ((arr[left] < pivot) && (left < right))
			left++;
		while ((arr[right] >= pivot) && (left < right))
			right--;

			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}

	arr[0]=arr[left-1];
	arr[left-1]=pivot;
	
	return pivot_location;
}

}
