package Programmers;

import java.util.ArrayList;
import java.util.Stack;

public class lvl01_kakaoDoll {
	
	static class Solution {
	    public static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        int cnt = 0;
	        
	        int[] arr = new int[moves.length];
	        
	        for(int i =0; i< moves.length; i++) {
	        	
	        	// moves[0] = 1
	        	// {1,5,3,5,1,2,1,4}
	        	
	        	for(int j=0; j < 5; j++) {
	        		
	        			if(board [j][ moves[i] - 1] != 0) {
	        				arr[cnt++] = board [j][ moves[i] - 1];
	        				System.out.println("j : " + j + " / " + "i : " + moves[i] + "------" + board [j][ moves[i] - 1]);
	        				
	        				board [j][ moves[i] - 1] = 0;
	        				
	        				System.out.println("-----------------");
	        				break;
	        				
	        			} 
//	        			else if(board [j][ moves[i] - 1] == 0) {
//	        				arr[cnt] =0;
//	        			}
	        	}
	        	
	        	
	        }
	        
	        for(int k= 0; k < arr.length; k++) {
	        	
	        	System.out.println("arr["+ k +"] : "+arr[k]);
	        	
	        }
	        
	        int count =0;
	        
	        for(int k= 0; k < arr.length; k++) {
	        	int ptr1 = 0;
	        	int ptr2 = 1;
 	        	
	        	if(arr[ptr1] == arr[ptr2]) {
	        		
	        		ptr2 += 2;
	        		count +=2;
	        		break;
	        	}
	        	
	        	
	        }
	        
	        System.out.println("count : " + count);
	        return answer;
	        
	    }
	    
	    public static void main(String[] args) {
	    	
	    	int[][] arr = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
	    	int[] moves = {1,5,3,5,1,2,1,4};
	    	
	    	
	    	solution(arr, moves);
	    }
	    
	    
	    
	    
	}
	
	

}
