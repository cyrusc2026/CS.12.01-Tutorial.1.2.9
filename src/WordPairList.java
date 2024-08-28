import java.util.ArrayList;

public class WordPairList {
    private final ArrayList<WordPair> allPairs;
    public WordPairList(String[] words) {
        this.allPairs = new ArrayList<>();
        for (int i =0; i < words.length; i++){
            for (int j=i+1; j <words.length; j++){
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        int answer = 0;
        for (int i = 0; i < allPairs.size(); i++){
            for (int j= i+1; j < allPairs.size(); j++){
                System.out.println("Comparing: " + allPairs.get(i).getFirst() + " " + allPairs.get(i).getSecond() + " + " + allPairs.get(j).getFirst() + " "+ allPairs.get(j).getSecond());
                if (allPairs.get(i).getFirst().equals(allPairs.get(j).getFirst()) && allPairs.get(i).getSecond().equals(allPairs.get(j).getSecond())) {
                    answer++;
                    System.out.println("ADD");
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
