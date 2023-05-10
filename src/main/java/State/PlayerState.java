package State;

public abstract class PlayerState {

    public abstract String getState();

    public boolean afk(Player player) {
        return false;
    }

    public boolean buffed(Player player) {
        return false;
    }

    public boolean combat(Player player) {
        return false;
    }

    public boolean dead(Player player) {
        return false;
    }

}
