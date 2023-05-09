package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindingDuplicatesUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new LinkedList<Integer>();
		Set<Integer> dup = new HashSet<Integer>();

		nums.add(14);
		nums.add(12);
		nums.add(13);
		nums.add(11);
		nums.add(15);
		nums.add(14);
		nums.add(18);
		nums.add(16);
		nums.add(17);
		nums.add(19);
		nums.add(18);
		nums.add(17);
		nums.add(20);

		
		System.out.println("\nDuplicate Elements:");
		for(int i =0;i < nums.size()-1;i++) {
			for (int j = 0; j < nums.size(); j++) {
				if(nums.get(i) == nums.get(j) && i != j) {
					dup.add(nums.get(i));
					break;
				}
			}
		}
		List<Integer> result = new ArrayList<Integer>(dup);
        Collections.sort(result);
        
		System.out.println(result+" ");
		
	}
	//14,17,18
}
