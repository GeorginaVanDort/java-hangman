import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  @Test
  public void newHangman_instantiatesCorrectly() {
    Hangman testHangman = new Hangman("word");
    assertEquals(true, testHangman instanceof Hangman);
  }

  @Test
  public void wordCheck_isLetterInWord_false() {
    Hangman testHangman = new Hangman("word");
    String expected = "----";
    assertEquals(expected, testHangman.wordCheck());
  }

  @Test
  public void wordCheck_isLetterInWord_true() {
    Hangman testHangman = new Hangman("word");
    int expected = 1;
    assertEquals(expected, testHangman.wordCheck());
  }

  // @Test
  // public void wordCheck_isLetterInWord_true() {
  //   Hangman testHangman = new Hangman("word");
  //   int expected = 1;
  //   assertEquals(expected, testHangman.wordCheck());
  // }
}
