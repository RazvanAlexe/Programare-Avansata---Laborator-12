package ro.uaicinfo.lab11.info;

public class Game {
    private Player[] GM_Players;
    private final int GM_ID;
    private int GM_NumberOfPlayers;
    
    public Game(int GM_ID) {
        this.GM_ID = GM_ID;
        this.GM_NumberOfPlayers = 0;
    }
    
    public void addPlayer(Player p)
    {
        this.GM_Players[this.GM_NumberOfPlayers] = p;
        this.GM_NumberOfPlayers++;
    }
    
    public Player[] getGM_Players() {
        return GM_Players;
    }

    public int getGM_NumberOfPlayers() {
        return GM_NumberOfPlayers;
    }
    
    public int getGM_ID() {
        return GM_ID;
    }
    
}
