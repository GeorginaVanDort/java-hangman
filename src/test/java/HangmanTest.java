import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  // @Test
  // public void letterCheck_isLetterInWord_false() {
  //   Hangman hangman = new Hangman();
  //   assertEquals(false, hangman.letterCheck("a"));
  // }

  @Test
  public void letterCheck_isLetterInWord_false() {
    Hangman hangman = new Hangman();
    int expected = -1;
    assertEquals(expected, hangman.letterCheck("a"));
  }
}
