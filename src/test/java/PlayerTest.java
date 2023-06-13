import State.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PlayerTest {
    Player player;

    @BeforeEach
    public void setUp() {
        player = new Player();
    }

    // Player AFK

    @Test
    public void mustNotReturnPlayerAFK() {
        player.setState(PlayerStateAFK.getInstance());
        assertFalse(player.afk());
    }

    @Test
    public void mustReturnPlayerAFKCombat() {
        player.setState(PlayerStateAFK.getInstance());
        assertTrue(player.combat());
        assertEquals(PlayerStateCombat.getInstance(), player.getState());
    }

    @Test
    public void mustReturnPlayerAFKBDead() {
        player.setState(PlayerStateAFK.getInstance());
        assertTrue(player.dead());
        assertEquals(PlayerStateDead.getInstance(), player.getState());
    }

    @Test
    public void mustReturnPlayerAFKBuffed() {
        player.setState(PlayerStateAFK.getInstance());
        assertTrue(player.buffed());
        assertEquals(PlayerStateBuffed.getInstance(), player.getState());
    }


    // Player Buffed
    @Test
    public void mustNotReturnPlayerBuffed() {
        player.setState(PlayerStateBuffed.getInstance());
        assertFalse(player.buffed());
    }
    @Test
    public void mustReturnPlayerBuffedAFK() {
        player.setState(PlayerStateBuffed.getInstance());
        assertTrue(player.afk());
        assertEquals(PlayerStateAFK.getInstance(), player.getState());
    }

    @Test
    public void mustReturnPlayerBuffedCombat() {
        player.setState(PlayerStateBuffed.getInstance());
        assertTrue(player.combat());
        assertEquals(PlayerStateCombat.getInstance(), player.getState());

    }

    @Test
    public void mustNotReturnPlayerBuffedDead() {
        player.setState(PlayerStateDead.getInstance());
        assertFalse(player.dead());
    }

    // Player Combat

    @Test
    public void mustNotReturnPlayerCombat() {
        player.setState(PlayerStateCombat.getInstance());
        assertFalse(player.combat());
    }

    @Test
    public void mustReturnPlayerCombatAFK() {
        player.setState(PlayerStateCombat.getInstance());
        assertTrue(player.afk());
        assertEquals(PlayerStateAFK.getInstance(), player.getState());
    }

    @Test
    public void mustReturnPlayerCombatBuffed() {
        player.setState(PlayerStateCombat.getInstance());
        assertTrue(player.buffed());
        assertEquals(PlayerStateBuffed.getInstance(), player.getState());
    }

    @Test
    public void mustNotReturnPlayerCombatDead() {
        player.setState(PlayerStateDead.getInstance());
        assertFalse(player.dead());
    }

    // Player Dead

    @Test
    public void mustNotReturnPlayerDead() {
        player.setState(PlayerStateDead.getInstance());
        assertFalse(player.dead());
    }

    @Test
    public void mustReturnPlayerDeadAFK() {
        player.setState(PlayerStateDead.getInstance());
        assertTrue(player.afk());
        assertEquals(PlayerStateAFK.getInstance(), player.getState());
    }

    @Test
    public void mustNotReturnPlayerDeadBuffed() {
        player.setState(PlayerStateBuffed.getInstance());
        assertFalse(player.buffed());
    }

    @Test
    public void mustNotReturnPlayerDeadCombat() {
        player.setState(PlayerStateCombat.getInstance());
        assertFalse(player.combat());
    }

}
