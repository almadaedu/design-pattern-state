package State;

public class PlayerStateBuffed extends PlayerState{

    private PlayerStateBuffed() {};
    private static PlayerStateBuffed instance = new PlayerStateBuffed();
    public static PlayerStateBuffed getInstance() {
        return instance;
    }

    public String getState() {
        return "Buffed";
    }
    public boolean afk(Player player) {
        player.setState(PlayerStateAFK.getInstance());
        return true;
    }

    public boolean combat(Player player) {
        player.setState(PlayerStateCombat.getInstance());
        return true;
    }

}
