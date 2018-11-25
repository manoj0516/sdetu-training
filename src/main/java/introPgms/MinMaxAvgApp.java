package introPgms;

import java.util.Scanner;

public class MinMaxAvgApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of array :");
		int size = input.nextInt();
		
		int n [] = new int [size];
		System.out.println ("Enter elements");
		for (int i=0;i<size;i++)
		{
			n[i] = input.nextInt();
		}	
		
		System.out.println("Minimum number is");
		System.out.println(min(n));
		
		System.out.println("Maximum number is");
		System.out.println(max(n));
		
		System.out.println("Avg of array is");
		System.out.println(avg(n));

	}
	
public static int min (int n[]) {
			int min=n[0];
		
		for (int i=0;i<n.length;i++) {			
		if(n[i]<min)
			{
				min = n[i];
			}
		}
		return min;
	}

public static int max (int n[]) {
	int max=n[0];

	for (int i=0;i<n.length;i++) {			
	if(n[i]>max)
			{	
				max = n[i];
			}
		}
	return max;
	}

public static double avg (int n[]) {
	int sum =0;
	double avg =0.0;
	for(int i=0;i<n.length;i++) {
		
			sum = sum + n[i];
			
		}
		avg = sum/n.length;
		return avg;
	
	}

}
