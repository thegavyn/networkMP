import java.util.ArrayList;
/**
 * Created by Mark Gavin on 3/11/2017.
 */
public class Tournament {
    ArrayList <Player> Participants;
    boardModel arena;

    public Tournament()
    {
        Participants = new ArrayList <Player>();
    }

    public void addParticipants(Player n)
    {
        Participants.add(n);
    }
    public void setOpponent()
    {
        Player n;
        int ctrhF = 0;
        int ctrP = ctrhF;
        int ctrP2 = ctrP;

        boolean found = false;
        while(ctrP < Participants.size()) {
            n = Participants.get(ctrP);
            ctrP2 = 0;
            ctrhF = 0;
            found = false;
            while (ctrhF < n.hasFaced.size() && found) {
                while (ctrP2 < Participants.size() && found) {
                    if (n.hasFaced.get(ctrhF).getName() == Participants.get(ctrP2).getName())
                        ctrP2++;
                    else if(n.hasFaced.get(ctrhF).getName() != Participants.get(ctrP2).getName() && Participants.get(ctrP2).retStatus()) {
                        found = true;
                        n.setKalaban(Participants.get(ctrP2));
                        Participants.get(ctrP2).setKalaban(n);
                    }
                }
            }
            ctrP++;
        }
    }

}
