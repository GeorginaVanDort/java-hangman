import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  @Test
  public void newHangman_instantiatesCorrectly() {
    Hangman testHangman = new Hangman("word");
    assertEquals(true, testHangman instanceof Hangman);
  }

  @Test
  public void letterCheck_isLetterInWord_false() {
    Hangman testHangman = new Hangman("word");
    int expected = -1;
    assertEquals(expected, testHangman.letterCheck("word", "a"));
  }
}
