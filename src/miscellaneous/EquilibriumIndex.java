package miscellaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-1, 1, -1, 1, 0, -1, 1, -1, 1};
		System.out.println(solution(A));
	}
	
	public static List<Integer> solution(int[] A) {
		List<Integer> indexList = new ArrayList<>();
		
		Map<Integer, Integer> sumMap = new HashMap<>();
		int previous = 0;
		int N = A.length;
        int last = N - 1;
		for (int i = 0; i < N; i++) {
			sumMap.put(i, previous + A[i]);
			previous = previous + A[i];
		}
		
        
        if (sumMap.get(last - 1) == 0) {
        	indexList.add(last); 
        }
        
        //if (sumMap.get(last) == 0) {
        	//indexList.add(0);
        //}
        
        for (int i = 1; i < last - 1; i++) {
        	if ((sumMap.get(last) - sumMap.get(i)) == sumMap.get(i - 1) ) {
        		indexList.add(i);
        	}
        }
        return indexList;
            
    }

}
