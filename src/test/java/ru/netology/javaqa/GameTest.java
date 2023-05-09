package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void shouldWinFirstPlayer() {
        Game game = new Game();
        Player master = new Player(1, "Master", 50);
        Player noob = new Player(2, "Noob", 25);
        game.register(master);
        game.register(noob);
        int expected = 1;
        int actual = game.round("Master", "Noob");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWinSecondPlayer() {
        Game game = new Game();
        Player master = new Player(1, "Master", 50);
        Player noob = new Player(2, "Noob", 55);
        game.register(master);
        game.register(noob);
        int expected = 2;
        int actual = game.round("Master", "Noob");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWinNone() {
        Game game = new Game();
        Player master = new Player(1, "Master", 30);
        Player noob = new Player(2, "Noob", 30);
        game.register(master);
        game.register(noob);
        int expected = 0;
        int actual = game.round("Master", "Noob");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRegisteredFirstPlayer() {
        Game game = new Game();
        Player master = new Player(1, "Master", 55);
        Player noob = new Player(2, "Noob", 50);
        game.register(master);
        game.register(noob);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("cancer", "noob")
        );
    }

    @Test
    public void shouldNotRegisteredSecondPlayer() {
        Game game = new Game();
        Player master = new Player(1, "Master", 55);
        Player noob = new Player(2, "Noob", 50);
        game.register(master);
        game.register(noob);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Master", "Pro")
        );
    }


}
