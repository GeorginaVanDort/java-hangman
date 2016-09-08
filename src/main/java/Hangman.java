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

  // public int letterCheck(String answer, String guess) {
  //   String wordOne = answer;
  //   int result = wordOne.indexOf(guess);
  //   return result;
  // }

  public String wordCheck() {
    String result = "";
    for (int i = 0; i <= mWord.length(); i++) {
      if (mGuess.contains(mWord.charAt(i))) {
        result += mWord.charAt(i);
      } else {
        result += "-";
      }
    }
    return result;
  }

  public String getWord() {
    return mWord;
  }

  public ArrayList<String> getGuesses() {
    return mGuess;
  }

}
