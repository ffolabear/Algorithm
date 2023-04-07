package programmers.level01;

public class numberof_p_y {

     public static boolean solution(String s) {

        boolean answer = true;

         int pnum = 0;
         int ynum = 0;

        for (int i=0; i < s.length(); i++){



            if(String.valueOf(s.charAt(i)).equals("p") || String.valueOf(s.charAt(i)).equals("P")){
                pnum++;
            }

            if(String.valueOf(s.charAt(i)).equals("y") || String.valueOf(s.charAt(i)).equals("Y")){
                ynum++;
            }



        }

         if ( pnum == ynum){
             answer = true;
         } else {
             answer = false;
         }


        return answer;
    }


    public static void main(String[] args) {

         String s = "pPoooyY";
         solution(s);

    }


}
