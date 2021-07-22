package Exams.Cospro_lvl1;

import java.util.ArrayList;


class Solution_1 {
	
	
	    Integer func_a(ArrayList<Integer> stack) {
	        Integer item = stack.remove(stack.size() - 1);
	        return item;
	    }
	    
	    void func_b(ArrayList<Integer> stack1, ArrayList<Integer> stack2) {
	        
	    	// 1.
	    	while(!func_c(stack1)) {
	    		// 2. 
	            Integer item = func_a(stack1);
	            stack2.add(item);
	        }
	    }
	    
	    boolean func_c(ArrayList<Integer> stack) {
	    	
	    	System.out.println((stack.size() == 0));
	        return (stack.size() == 0);
	    }
	    
	    public int solution(ArrayList<Integer> stack1, ArrayList<Integer> stack2) {

	    	// 3. 
	    	if(func_c(stack2)) {
	    		// 4.
	            func_b(stack1, stack2);
	        }
	    	//5. 
	        Integer answer = (int) func_a(stack2);
	        return answer;
	    }
	    
	public static void main(String[] args) {
        Solution_1 sol = new Solution_1();

        ArrayList<Integer> stack1_1 = new ArrayList<Integer>();
        ArrayList<Integer> stack2_1 = new ArrayList<Integer>();
        stack1_1.add(1);
        stack1_1.add(2);
        stack2_1.add(3);
        stack2_1.add(4);
        int ret1 = sol.solution(stack1_1, stack2_1);
        
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        System.out.println("=================================================");
        System.out.println("stack2의 사이즈가 0일떄");
        ArrayList<Integer> stack1_2 = new ArrayList<Integer>();
        ArrayList<Integer> stack2_2 = new ArrayList<Integer>();
        stack1_2.add(1);
        stack1_2.add(2);
        stack1_2.add(3);
        int ret2 = sol.solution(stack1_2, stack2_2);
        
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
