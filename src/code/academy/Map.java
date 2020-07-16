package code.academy;

import java.util.ArrayList;
import java.util.List;

public class Map<K, V> {

    private List<Pair<K, V>> listOfPairs = new ArrayList<>();
    public List<Pair<K, V>> getListOfPairs() {
        return listOfPairs;
    }

    public void setListOfPairs(List<Pair<K, V>> listOfPairs) {
        this.listOfPairs = listOfPairs;
    }

    public void addToMap(K key, V value) {
        listOfPairs.add(new Pair<>(key, value));
    }

    public V getValue(K key) {

        for (Pair<K, V> pair : listOfPairs) {
            if (pair.getKey().equals(key)){
                return pair.getValue();
            }
        }
        return null;
    }
}
