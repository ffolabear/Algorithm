package lecture.sortingSearching;

import java.util.*;

public class SortingCoordinate {

    static class Coordinate {

        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void solution(List<Coordinate> list) {

        Collections.sort(list, new Comparator<Coordinate>() {

            @Override
            public int compare(Coordinate o1, Coordinate o2) {

                if (o1.x == o2.x) {
                    return o1.y - o2.y;
                } else {
                    return o1.x - o2.x;
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).x + " " + list.get(i).y);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        List<Coordinate> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(new Coordinate(in.nextInt(), in.nextInt()));
        }
        SortingCoordinate sol = new SortingCoordinate();
        sol.solution(list);


    }

}
