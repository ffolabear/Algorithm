package exams.bti;

import java.util.HashMap;
import java.util.Map;

/**
 * 아이디는 S + N
 * S : a~z 길이 3이상 6이하
 *
 * N : 0~9 길이 0이상 6이하
 * N의 길이 1이상일때 첫자리는 0 불가능
 *
 * 조건에 부합하는 아이디를 신규회원에게 추천
 *
 * 1. new_id 가 리스트에 없으면 추천하고 종료
 * 2. 아니라면 두개의 문자열 S + N으로 분리
 * 3. S + (N + 1) 로 변겅하고 1로 돌아감
 감
 */
public class q3 {

    public String solution(String[] registered_list, String new_id) {

        String answer = "";
        Map<String, Integer> id_map = new HashMap<>();

        for (int i = 0; i < registered_list.length; i++) {
            id_map.put(registered_list[i], 0);
        }


        if (isValid(new_id, id_map)) {
            answer = new_id;
        } else {

            String S = "";
            String N = "";

            //S , N 분리 완료
            for (int i = 0; i < new_id.length(); i++) {
                if (Character.isDigit(new_id.charAt(i))) {
                    S = new_id.substring(0, i);
                    N = new_id.substring(i);
                    break;
                }

                //break 되지 않았다면 N 이 없는것.

                S = new_id;
                N = "1";
            }


            String generatedId = S + (Integer.parseInt(N) + 1);

            while (true) {
                if (id_map.containsKey(generatedId)) {
                    N = String.valueOf(Integer.parseInt(N) + 1);
                    generatedId = S + (Integer.parseInt(N));
                } else {
                    break;
                }



            }
            answer = generatedId;

        }

        return answer;
    }

    public boolean isValid(String id, Map<String, Integer> id_map) {

        return !id_map.containsKey(id);
    }

    public static void main(String[] args) {

        String[] registered_list = {"card",
                                    "ace13",
                                    "ace16",
                                    "banker",
                                    "ace17",
                                    "ace14"
                                    };

        String new_id = "ace15";
        //ace15

//        String[] registered_list = {"cow",
//                "cow1",
//                "cow2",
//                "cow3",
//                "cow4",
//                "cow9",
//                "cow8",
//                "cow7",
//                "cow6",
//                "cow5"
//        };
//
//        String new_id = "cow";
        //cow10

//        String[] registered_list = {
//                "bird99",
//                "bird98",
//                "bird101",
//                "gotory"
//        };
//
//        String new_id = "bird98";
        //bird100

//        String[] registered_list = {
//                "apple1",
//                "orange",
//                "banana3"
//        };

//        String new_id = "apple";
        //apple

        q3 sol = new q3();

        System.out.println(sol.solution(registered_list, new_id));

    }

}
