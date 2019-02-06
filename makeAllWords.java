import java.util.List;
import java.util.ArrayList;
public class makeAllWords{
  public static List<String> makeAllWords(int k, int maxLetter){
    List<String> f = new ArrayList<String>();
    makeAllWordsH(k, "", maxLetter, f, 97);
    return f;
  }
  private static void makeAllWordsH(int k, String word, int maxLetter, List<String> list, int letter){
    if (k == 0) {
      list.add(word);
    } else {
      for (int i = 0 ; i < maxLetter; i++) {
        makeAllWordsH(k-1, word+(char) (letter+i), maxLetter, list, letter);
      }
    }
  }
  public static void main(String[] args) {
    System.out.println(makeAllWords(1,26));
    System.out.println(makeAllWords(3,3));
    System.out.println(makeAllWords(4,2));
  }
}
