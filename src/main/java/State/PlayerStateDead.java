package State;

public class PlayerStateDead extends PlayerState{

    private PlayerStateDead() {};
    private static PlayerStateDead instance = new PlayerStateDead();
    public static PlayerStateDead getInstance() {
        return instance;
    }

    public String getState() {
        return "Dead";
    }

    public boolean afk(Player player) {
        player.setState(PlayerStateAFK.getInstance());
        return true;
    }

}
