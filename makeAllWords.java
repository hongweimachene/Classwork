import java.util.List;
import java.util.ArrayList;
public class makeAllWords{
  public static List<String> makeAllWords(int k, int maxLetter){
    List<String> f = new ArrayList<String>();
    return makeAllWordsH(k, "", maxLetter, f, 'a');
  }
  private static void makeAllWordsH(int k, String word, int maxLetter, List<String> list, char letter){
    if (k == 0) {
      list.add(word);
    } else {
      for (int i = 0; i < maxLetter; i++) {
        makeAllWords(k-1, word+letter, maxLetter, list, letter+i);
      }
    }
  }
