/**
 * Created by Mark Gavin on 3/11/2017.
 */
public enum Sign {

    ROCK, PAPER, SCISSORS;

    String choseSign;

    public String toString() {
        switch(this) {
            case ROCK: return "ROCK";
            case PAPER: return "PAPER";
            case SCISSORS: return "SCISSORS";
            default: return "";
        }
    }

    public void thrownSign(String n)
    {
        choseSign = n;
    }
}
