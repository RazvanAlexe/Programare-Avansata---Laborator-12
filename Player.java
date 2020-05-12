package ro.uaicinfo.lab11.info;

public class Player {
    private String PL_Name;
    private int PL_ID;

    public Player(String PL_Name, int PL_ID) {
        this.PL_Name = PL_Name;
        this.PL_ID = PL_ID;
    }

    public String getPL_Name() {
        return PL_Name;
    }

    public void setPL_Name(String PL_Name) {
        this.PL_Name = PL_Name;
    }

    public int getPL_ID() {
        return PL_ID;
    }

    public void setPL_ID(int PL_ID) {
        this.PL_ID = PL_ID;
    }
    
}
