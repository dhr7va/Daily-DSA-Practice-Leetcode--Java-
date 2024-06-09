import java.util.*;

class RandomizedSet {
    // Map to store value and its index in the list
    private Map<Integer, Integer> valToIndex;
    // List to store the values
    private List<Integer> values;
    // Random object for generating random numbers
    private Random rand;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        valToIndex = new HashMap<>();
        values = new ArrayList<>();
        rand = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false; // The value is already present
        }
        valToIndex.put(val, values.size());
        values.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false; // The value is not present
        }
        // Get the index of the element to be removed
        int index = valToIndex.get(val);
        // Swap the element with the last element in the list
        int lastElement = values.get(values.size() - 1);
        values.set(index, lastElement);
        valToIndex.put(lastElement, index);
        // Remove the last element
        values.remove(values.size() - 1);
        valToIndex.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int randomIndex = rand.nextInt(values.size());
        return values.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
