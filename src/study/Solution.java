package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Solution {
	
	public Solution() {
		int[] numbers= {2,1,3,4,1};
		
		solution(numbers);
	}
	
	public List solution(int[] numbers) {
        List<Integer> answer = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<numbers.length; i++) {
        	for(int j=0; j<numbers.length;j++) {
        		if(i!=j) {
        			int a = numbers[i]+numbers[j];
        			set.add(a);
        		}
        	}
        }
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
        	int a = it.next();
        	answer.add(a);
        }
        Collections.sort(answer);
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		new Solution();
	}
}
