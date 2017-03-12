import java.util.ArrayList;


/**
 * Created by Mark Gavin on 3/10/2017.
 */
public class Player
{
    private Sign playerMove;
    private String name;
    private float points;
    public ArrayList<Player> hasFaced;
    private Player Kalaban;
    private boolean kFound = false;
    public boolean pStat = false;
    /* image proPic */

    public Player(String name)
    {
        this.name = name;
        hasFaced = new ArrayList<Player>();
    }

    public void addFaced(Player name)
    {
        hasFaced.add(name);
    }

    public void getMove(Sign playerMove)
    {
        this.playerMove = playerMove;
    }

    public String getName()
    {
        return name;
    }

    public Sign throwMove()
    {
        return playerMove;
    }
    public void setKalaban(Player n)
    {
        n = this.Kalaban;
        kFound = true;
    }
    public boolean retStatus()
    {
        return kFound;
    }
    public void assignSign(String n)
    {
        if(n == "ROCK")
            playerMove = Sign.ROCK;
        else if (n == "PAPER")
            playerMove = Sign.PAPER;
            else if(n == "SCISSORS")
                playerMove = Sign.SCISSORS;
    }


}
