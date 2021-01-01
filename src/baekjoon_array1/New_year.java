package baekjoon_array1;

import java.util.Scanner;

public class New_year {
		
	// 갑 을 병 정 무 기 경 신 임 계
	// 자 축 인 묘 진 사 오 미 신 유 술 해 
	// 00년은 경신년
	
	// 경 신 임 계 갑 을 병 정 무 기
	// 신 유 술 해 자 축 인 묘 진 사 오 미
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		String[] twel = new String[] {"신", "유", "술", "해", "자", "축", "인", "묘", "진", "사", "오", "미"};
		String[] ten = new String[]  {"경", "신", "임", "계", "갑", "을", "병", "정", "무", "기"};
		
		
		String first_name = ten[year%10];
		String second_name = twel[year%12];
		String this_year = first_name + second_name + "년";
		
		System.out.println("입력하신 "+ year + "년은 " +  this_year + " 입니다.");
		
	}

}



