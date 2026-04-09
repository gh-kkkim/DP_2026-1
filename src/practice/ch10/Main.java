package practice.ch10;

public class Main {
    public static void main(String[] args) {
        /*
        // 손을 2개 생성
        Hand ha1 = Hand.ROCK;
        Hand ha2 = Hand.SCISSORS;

        // 손을 대결시킴
        if(ha1.isStrongerThan(ha2)) { // true
            System.out.println("ha1이 이겼습니다.");
        } else if(ha1.isWeakerThan(ha2)) { // false
            System.out.println("ha2가 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
        */

        // 플레이어 2명 만들기
        practice.ch10.Player player1 = new practice.ch10.Player("Taro", new WinningStrategy(314));
        practice.ch10.Player player2 = new practice.ch10.Player("Hana", new WinningStrategy(15));

        // 게임 시키기
        for (int i=0; i<10; i++) {
            // 플레이어 2명에게 각각 손을 얻음
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();
            
            // 손을 대결시킴
            if (hand1.isStrongerThan(hand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (hand1.isWeakerThan(hand2)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
    }
}
