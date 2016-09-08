public class Hangman {
  public int letterCheck(String guess) {
    String wordOne = "beer";
    int result = wordOne.indexOf(guess);
    // if (result > 0) {
    //   return true;
    // } else {
    //   return false;
    // }
    return result;
  }
}
