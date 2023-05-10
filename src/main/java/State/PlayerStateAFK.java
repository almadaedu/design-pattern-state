package State;

public class PlayerStateAFK extends PlayerState{

    private PlayerStateAFK() {};
    private static PlayerStateAFK instance = new PlayerStateAFK();
    public static PlayerStateAFK getInstance() {
        return instance;
    }

    public String getState() {
        return "AFK";
    }

    public boolean buffed(Player player) {
        player.setState(PlayerStateBuffed.getInstance());
        return true;
    }

    public boolean combat(Player player) {
        player.setState(PlayerStateCombat.getInstance());
        return true;
    }

    public boolean dead(Player player) {
        player.setState(PlayerStateDead.getInstance());
        return true;
    }

}
