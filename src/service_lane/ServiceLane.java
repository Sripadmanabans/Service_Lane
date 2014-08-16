package service_lane;

import java.util.Scanner;

public class ServiceLane 
{
	public static int largestVehicle(int[] width, int i, int j) 
	{
		int largest;
		largest = width[i];
		for(int x = i; x <= j; x++)
		{
			if(largest > width[x])
			{
				largest = width[x];
			}
		}
		return largest;
	}
	public static void main(String args[]) 
	{
		Scanner sr = new Scanner(System.in);
		int n = Integer.parseInt(sr.next());
		int t = Integer.parseInt(sr.next());
		int width[] = new int[n];
		int x;
		int i[] = new int[t];
		int j[] = new int[t];
		for(x = 0; x < n; x++)
		{
			width[x] = Integer.parseInt(sr.next());
		}
		for(x = 0; x < t; x++)
		{
			i[x] = Integer.parseInt(sr.next());
			j[x] = Integer.parseInt(sr.next());
		}
		for(x = 0; x < t; x++)
		{
			System.out.println(largestVehicle(width,i[x],j[x]));
		}
		sr.close();
	}
}
