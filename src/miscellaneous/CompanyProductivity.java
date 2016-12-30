package miscellaneous;
import java.io.*;
import java.util.*;

public class CompanyProductivity {
	static int productivity = 0;
    public static void main(String args[] ) throws Exception {
    	BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            
            int numEmp = Integer.parseInt(input);
            int count = 0;
            
            int[] p = new int[numEmp];
            int[] m = new int[numEmp];
            Map<Integer, Set<Integer>> hashMap = new HashMap<>();

            while (count < numEmp) {

                String arryLine = br.readLine();
                String[] splitArr = arryLine.split(" ");
                p[count] = Integer.parseInt(splitArr[0]);
                m[count] = Integer.parseInt(splitArr[1]);
                
                if (hashMap.get(m[count]) == null) {
                	Set<Integer> children = new HashSet<>();
                	hashMap.put(m[count], children);
                }
                hashMap.get(m[count]).add(count);
                count++;    
            }
            updateChildren(p, m, hashMap);    
            System.out.println(productivity + p[0]); 
             
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    
    public static void updateChildren(int[] p, int[] m, Map<Integer, Set<Integer>> hashMap) {
    	for (int i = 0; i < p.length; i++) {
    		Set<Integer> children = hashMap.get(i);
    		if (children != null) {
    			for (Integer child : children) {
        			if (p[child] > p[i]) {
        				p[child] = p[i];
        				CompanyProductivity.productivity += p[i];
        				continue;
        			}
        			CompanyProductivity.productivity += p[child];
        		}
    		}	
    	}
    }
}
