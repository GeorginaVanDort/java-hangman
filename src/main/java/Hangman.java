import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {
  private String mWord;
  private ArrayList<String> mGuess;


  public Hangman(String word) {
    mWord = word;
    mGuess = new ArrayList<String>();
  }

  public int letterCheck(String answer, String guess) {
    String wordOne = answer;
    int result = wordOne.indexOf(guess);
    return result;
  }

  public String getWord() {
    return mWord;
  }

  public ArrayList<String> getGuesses() {
    return mGuess;
  }

}
