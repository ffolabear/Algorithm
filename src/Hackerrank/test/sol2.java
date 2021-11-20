package Hackerrank.test;

import com.google.gson.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class sol2 {

    static final String RESTAURANT_URL = "https://jsonmock.hackerrank.com/api/food_outlets";

    public static void main(String[] args) throws IOException {

        sol2 sol = new sol2();

        System.out.println(sol.getTopRatedFoodOutlets("Denver"));

    }

    public static ArrayList<String> getTopRatedFoodOutlets(String city) throws IOException {

        Map<String, Double> avgRating = new HashMap<>();

        ArrayList<String> cityOrder = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();

        String restaurantUrl = RESTAURANT_URL + "?city=" + city;
        URL url = new URL(restaurantUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.addRequestProperty("Content-Type", "application/json");

        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String str = br.readLine();

        JsonObject jsonObject = new Gson().fromJson(str, JsonObject.class);
        JsonArray data = jsonObject.getAsJsonArray("data");


        for (JsonElement e : data) {

            String name = e.getAsJsonObject().get("name").getAsString();
            Double rating = e.getAsJsonObject().get("user_rating").getAsJsonObject().get("average_rating").getAsDouble();

            cityOrder.add(name);
            avgRating.put(name, rating);
        }


        List<String> keyList = new ArrayList<>(avgRating.keySet());
        keyList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return avgRating.get(o2).compareTo(avgRating.get(o1));
            }
        });


        double currentRate = 0;
        int index = 0;

        while (answer.size() != 5) {

            currentRate = avgRating.get(keyList.get(index));

            for (int i = 0; i < cityOrder.size(); i++) {
                if (avgRating.get(cityOrder.get(i)) == currentRate) {

                    if (index > 4) {
                        break;
                    } else {
                        answer.add(cityOrder.get(i));
                        index++;

                    }
                }
            }

        }


        br.close();
        con.disconnect();

        return answer;
    }




}

