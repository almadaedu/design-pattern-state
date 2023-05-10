package State;

public class PlayerStateCombat extends PlayerState{

    private PlayerStateCombat() {};
    private static PlayerStateCombat instance = new PlayerStateCombat();
    public static PlayerStateCombat getInstance() {
        return instance;
    }

    public String getState() {
        return "Combat";
    }

    public boolean afk(Player player) {
        player.setState(PlayerStateAFK.getInstance());
        return true;
    }

    public boolean buffed(Player player) {
        player.setState(PlayerStateBuffed.getInstance());
        return true;
    }
}
