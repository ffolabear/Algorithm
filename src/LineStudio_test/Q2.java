package LineStudio_test;

public class Q2 {
	
	/*
	    Ax + By + C = 0으로 표현할 수 있는 n개의 이 주어질 때. 이 직선의 교점 중 정수 좌표에 별을 그리려 합니다.

		예를 들어, 다음과 같은 직선 5개를
		
		2x - y + 4 = 0
		-2x - y + 4 = 0
		-y + 1 = 0
		5x - 8y - 12 = 0
		5x + 8y + 12 = 0
		좌표 평면 위에 그리면 아래 그림과 같습니다.
	  
	 */
	
	
	public static String[] solution(int[][] line) {
        String[] answer = {};
        
        System.out.println(line.length);
        
        for(int i=0; i < line.length; i++) {
        	
        	System.out.println(line[i].length);
        	
        	for(int j = 0; j < line[i].length; j++) {
        		
        			
        	}
        	
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[][] arr =  {{2, -1, 4},{-2, -1, 4},{0, -1, 1},{5, -8, -12},{5, 8, 12}};
		
		solution(arr);
		
		
	}
	
	
	
	

}






