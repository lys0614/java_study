package chap05;
import java.util.Arrays;
public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrSum[] = new int[10];//����Ÿ�Ը��� ������ �ִ� 10ĭ¥�� �� �迭�� ��.
		arrSum[0]=1;
		arrSum[1]=2;
		arrSum[2]=3;
		arrSum[3]=4;
		arrSum[4]=5;
		arrSum[5]=6;
		arrSum[6]=7;
		arrSum[7]=8;
		arrSum[8]=9;
		arrSum[9]=10;
		
		int sum = 0;
		for(int i=0;i<arrSum.length;i++) {
			sum = sum + arrSum[i];
			System.out.print(sum+",");
		}
		System.out.print("\n");
		
		arrSum = new int[10];
		
		for(int i=0; i< arrSum.length; i++) {
			arrSum[i]=i+1;
			System.out.print(arrSum[i]+",");
		}
		System.out.println();
		arrSum = new int[10];//�迭 ����
		sum = 0;
		System.out.println("-------------");
		
		//�� 2���� �迭
		int arr2[][] = new int[5][5]; //int Ÿ���� �� 2���� �迭 ����
		int arr3[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
		};//int Ÿ���� 2���� �迭 ����� ���ÿ� ������ �Է�
		System.out.println(arr3[2][4]);
		System.out.println(arr3[4][1]);
		
		arr2[0][0]=10;
		arr2[0][1]=20;
		
		arr2 = new int[9][9]; // 2���� �迭 arr2�� ���ο� 2���� �迭 ����.
		
		for(int i =0; i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length;j++) {
				arr2[i][j] = (i+1)*(j+1);
			}
		}
		
		for(int i=0; i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length;j++) {
				System.out.println(i+"*"+j+"="+arr2[i][j]);
			}
			System.out.println(i+1+"��--------");
		}
		
	}
		
}
