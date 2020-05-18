public class Practice22 {
public static void main(String[] args) {
	int[][] workTime = {
		{2, 4, 3, 4, 5, 8, 8},
		{7, 3, 4, 3, 3, 4, 4},
		{3, 3, 4, 3, 3, 2, 2},
		{9, 3, 4, 7, 3, 4, 1},
		{3, 5, 4, 3, 6, 3, 8},
		{3, 4, 4, 6, 3, 4, 4},
		{3, 7, 4, 8, 3, 8, 4},
		{6, 3, 5, 9, 2, 7, 9}
	};
	
	int[] totalTime = new int[8];
	
	for(int i=0;i<8;i++) {
		for(int j=0;j<7;j++) {
			totalTime[i] += workTime[i][j];
		}
	}
	
	int[] original = new int[8];
	for(int i=0; i<8;i++) {
		original[i] = totalTime[i];
	}
	
	for(int i = 0; i<totalTime.length; i++) {
		for(int j = i+1; j<totalTime.length; j++) {
			if(totalTime[i]<totalTime[j]) {
				int temp = totalTime[i];
				totalTime[i]=totalTime[j];
				totalTime[j]=temp;
			}
		}
	}
	
	for(int i = 0; i<totalTime.length;i++) {
		for(int j=0;j<totalTime.length;j++) {
			if(totalTime[i]==original[j]) {
				System.out.println("Employee "+j+" : "+totalTime[i]);
				
			if(i!=7) {
				if(totalTime[i]==totalTime[i+1])
					i++;
				else
					break;
			}
			}
		}
	}
}
}
