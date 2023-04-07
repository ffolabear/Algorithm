package exams.DH_test;

public class Solution1 {

    public static void main(String[] args) {

        // S : John Doe; Peter Benjamin Parker; Mary Jane Watson-parker
        // C ; example
        // return : John Doe <doe_join@example.com>; Peter Benjamin Parker <parker_peter@example.com>; Mary Jane Watson-parker <watsonparker_mary@example.com>

        String S = "John Doe; Peter Benjamin Parker; Mary Jane Watson-parker; Peter Benjamin Parker; Peter Benjamin Parker";
        String C = "example";

        solution(S, C);

    }


    public static String solution(String S, String C) {

        String[] names = S.split("; ");
        String emails = "";
        String[] duplicateChk = new String[names.length];

        // 주소 부분
        String commonPart = "@" + C.toLowerCase() + ".com";

        for (int i = 0; i < names.length; i++) {

            String[] seperated = names[i].split(" ");


            for (int j = 0; j < seperated.length; j++) {
                seperated[j] = seperated[j].toLowerCase().replace("-", "");

                if (seperated.length >= 3) {
                    duplicateChk[i] = seperated[2] + "_" + seperated[0];

                } else {
                    duplicateChk[i] = seperated[1] + "_" + seperated[0];
                }


            }
        }

        for (int k=0; k < duplicateChk.length; k++){
            String temp = duplicateChk[k];

            int duplicateCnt = 0;

            for(int n=0; n < duplicateChk.length; n++){

                int cnt = 1;

                if (k == n){
                    continue;
                } else {

                    if (duplicateChk[k].equals(duplicateChk[n])){
                        cnt ++;
                        duplicateChk[n] += (cnt + duplicateCnt);
                        duplicateCnt++;
                    }

                }

            }

        }

       for(int m = 0; m < names.length; m++){


           if (m == names.length-1){
               emails += names[m] + " <" + duplicateChk[m] + commonPart + ">";
           } else{
               emails += names[m] + " <" + duplicateChk[m] + commonPart + ">; ";
           }

       }

        System.out.println(emails);
        return emails;
    }


}
