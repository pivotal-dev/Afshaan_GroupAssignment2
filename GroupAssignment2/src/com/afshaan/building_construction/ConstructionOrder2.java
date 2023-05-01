package com.afshaan.building_construction;

import java.util.*;

public class ConstructionOrder2 {
/*
5 4 3 2 1	-->correct order of floors
5 1 3 4 2	-->input
p a a p p	-->operation (p:print & delete  a:add to list)

if maxfloor==arr[i] then print maxfloor and remove it from list
Then maxfloor-- 
if the new maxfloor already exists in the list then print it and remove it from list.Then find nex maxfloor.
These all printed floors are assembled in a single day
Repeat these steps till maxfloor does not exist in list

If the maxfloor does not exist then do nothing , proceed to next iteration
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//input
		System.out.println("enter the total no of floors in the building");
		int n = sc.nextInt();
		int[] floor =  new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the floor size given on day : "+(i+1));
			floor[i] = sc.nextInt();
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		int maxfloor = n;
		for(int i=0;i<n;i++) {
			System.out.println("Day: "+(i+1));
			al.add(floor[i]);
			
			if(maxfloor==floor[i]) {
				//print
				while(al.contains(maxfloor)) {
					System.out.print(maxfloor+" ");
					al.remove(Integer.valueOf(maxfloor));
					maxfloor--;
				}
				System.out.println();
			}
			else
				System.out.println();
		}
		
		sc.close();
	}

}
