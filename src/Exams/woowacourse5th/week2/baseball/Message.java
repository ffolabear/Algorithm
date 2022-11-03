package Exams.woowacourse5th.week2.baseball;

public class Message {

    private static final String INITIAL_GAME_START = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_PLAYER_GAME_NUMBER = "숫자를 입력해주세요 : ";
    private static final String GAME_RESULT_NOTHING = "낫싱";

    private static final String GAME_RESULT_BALL = "볼";
    private static final String GAME_RESULT_STRIKE = "스트라이크";
    private static final String GAME_RESULT_CORRECT = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    private static final String START_NEW_GAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";



    public static void initialGameMessage() {
        System.out.println(INITIAL_GAME_START);
    }

    public static void inputGameNumberMessage() {
        System.out.print(INPUT_PLAYER_GAME_NUMBER);

    }


}
