

public class Hangman {
  public String mWord;
  public String mGuess;


  public Hangman(String word, String guess) {
    mWord = word;
    mGuess = guess;
  }

  public int letterCheck(String answer, String guess) {
    String wordOne = answer;
    int result = wordOne.indexOf(guess);
    return result;
  }
}
