package State;

public class Player {
    private String name;
    private PlayerState state;

    public Player() {
        this.state = PlayerStateAFK.getInstance();
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public boolean afk() {
        return state.afk(this);
    }

    public boolean buffed() {
        return state.buffed(this);
    }

    public boolean combat() {
        return state.combat(this);
    }

    public boolean dead() {
        return state.dead(this);
    }


    public String getNameState() {
        return state.getState();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerState getState() {
        return state;
    }

}
