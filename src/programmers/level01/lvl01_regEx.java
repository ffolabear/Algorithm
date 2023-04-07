package programmers.level01;

public class lvl01_regEx {

	public static void main(String[] args) {
		
		getPoint("1S2D*3T");

	}

	public static int getPoint(String dartResult) {
		
		// C D T 중 하나의 문자와 없을수도 있는 #,* 를 기준으로 split 
		String[] num = dartResult.split("[SDT](\\#)?(\\*)?");
		
//		for(int i=0; i< num.length ; i ++) {
//			System.out.print(num[i]);
//		}
		
		
		//숫자를 기준으로 split
		String[] opr = dartResult.split("\\d+");
		
//		for(int j=0; j< num.length ; j ++) {
//			System.out.print(opr[j]);
//		}
		
		// 총 3번의 점수를 저장할 배열
		int[] score = new int[3];
		
		
		for(int index=0; index < 3; index++) {
			
			if(opr[index+1].startsWith("D")) {
				score[index] = (int) Math.pow(Integer.parseInt(num[index]), 2);
			} else if (opr[index+1].startsWith("T")) {
				score[index] = (int) Math.pow(Integer.parseInt(num[index]), 3);
			} else {
				score[index] = Integer.parseInt(num[index]);
			}
			
			if(opr[index+1].endsWith("*")) {
				score[index] = score[index] *2;
				
				if(index > 0) {
					score[index-1] = score[index-1] *2;
				}
			} else if(opr[index+1].endsWith("#")) {
				score[index] = score[index] * -1;
			}
			
		}
		 
		int scoreSum = score[0] + score[1] + score[2];
		
		System.out.println("점수 : " + scoreSum);
		return scoreSum;
	}

}
