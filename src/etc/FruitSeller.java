package etc;

class FruitSeller {

    int numOfApple;
    int myMoney;
    int APPLE_PRICE;

    public int saleApple(int money) {

        int num = money / APPLE_PRICE;
        numOfApple -= num;
        myMoney += money;
        return num;

    }

    public void showSaleResult() {
        System.out.println("남은 사과: " + numOfApple);
        System.out.println("판매 수익: " + myMoney);
    }

    public void initMembers(int money, int appleNum, int price) {
        myMoney = money;
        numOfApple = appleNum;
        APPLE_PRICE = price;
    }
}

class FruitBuyer {
    int myMoney = 10000;
    int numOfApple = 0;

    public void buyApple(FruitSeller seller, int money) {
        numOfApple += seller.saleApple(money);
        myMoney -= money;
    }

    public void showBuyResult() {
        System.out.println("현재 잔액: " + myMoney);
        System.out.println("사과 개수: " + numOfApple);
    }
}

class FruitSalesMain2 {
    public static void main(String[] args) {

        FruitSeller seller1 = new FruitSeller();
        seller1.initMembers(0, 30, 1500);
//        seller1
//        money    : 0
//        appleNum : 30
//        price    : 1500

        FruitSeller seller2 = new FruitSeller();
        seller2.initMembers(0, 20, 1000);
//        seller1
//        money    : 0
//        appleNum : 20
//        price    : 1000

        FruitBuyer buyer = new FruitBuyer();
        buyer.buyApple(seller1, 4500);        // 4500 / 1500
        buyer.buyApple(seller2, 2000);        // 2000 / 1000

        System.out.println("과일 판매자1의 현재 상황");
        seller1.showSaleResult();

        System.out.println("과일 판매자2의 현재 상황");
        seller2.showSaleResult();

        System.out.println("과일 구매자의 현재 상황");
        buyer.showBuyResult();


    }
}