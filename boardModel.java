import java.util.Scanner;
/**
 * Created by Mark Gavin on 3/12/2017.
 */
public class boardModel {
    public Player pOne;
    public Player pTwo;
    public Sign p1Sign;
    public Sign p2Sign;
    Scanner sc;
    public boardModel(Player pOne, Player pTwo)
    {
        this.pOne = pOne;
        this.pTwo = pTwo;
        sc = new Scanner(System.in);
    }
    public void showTime()
    {
        String firstP, secondP;
        boolean matchEnd = false;
        System.out.println("Player 1's Turn: ROCK, PAPER, OR SCISSORS?");
        firstP = sc.next();
        pOne.assignSign(firstP);
        System.out.println("Player 2's Turn: ROCK, PAPER, OR SCISSORS?");
        secondP = sc.next();
        pTwo.assignSign(secondP);
        //evaluate the throwdowned signs
        pOne.pStat = true;
        pTwo.pStat = true;

    }
}
