package Hackerrank.restAPI;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class FootballMatch {

    private static final String MATCH_URL = "https://jsonmock.hackerrank.com/api/football_matches";


    //https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team1=<team>&page=<page>
    //https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team2=<team>&page=<page>

    public static void main(String[] args) {

        FootballMatch footballMatch = new FootballMatch();


    }

    public int totalGoal(int year, String team) throws UnsupportedEncodingException {

        String team1URL = String.format(MATCH_URL + "?year=%d&team1=%s", year, URLEncoder.encode(team, "UTF-8"));
        String team2URL = String.format(MATCH_URL + "?year=%d&team2=%s", year, URLEncoder.encode(team, "UTF-8"));

        return 0;
    }

    private int getTeamGoal(String teamUrl, String teamtype, int page, int totalGoals) {

        return 0;
    }

    private String getResponsePerPage(String endpoint, int page) {


        return "";
    }


}
