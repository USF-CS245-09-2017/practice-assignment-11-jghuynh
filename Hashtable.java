public class Hashtable {


    private int key;
    private Object data;
    boolean deleted;
    private String[] myArray;
    private int INITIAL_SIZE = 10;
    /**
     * Constructs an object of type Hashtable
     */
    public Hashtable() {
        deleted = false;
        this.myArray = new String[INITIAL_SIZE];
    }


    /**
     * Returns “true” if a given key exists in the hashtable (with the key matching the
     * argument and any value).
     * @param key the key
     * @return true if the given key exists in the hashtable
     */
    public boolean containsKey (String key) {
        int start = 0;
        int end = myArray.length;
        boolean isFound = containsKey(key, start, end);
        for (int index = 0; index < myArray.length; index ++) {
            if (myArray[index] == key)
        }

    }

    private boolean containsKey(String key, int start, int end) {
        int mid = (start + end)/2;
        if (myArray[mid] == key) {
            return true;
        }
        else if ()
    }


    /**
     * Gets the value associated with the given key
     * @param key the key
     * @return the value from that key
     */
    public String get (String key) {

    }

    /**
     * Adds the key-value pair to the Hashtable. If there already exists a key-value pair,
     * then the Hashtable replaces the existing key-value pair with the new, argument value
     * @param key the key
     * @param value the value associated with the key
     */
    public void put (String key, String value) {

    }

    /**
     * Removes the key-value pair from the Hashtable. Also returns the value.
     * If such a key-value does not exist, then Hashtable throws an Exception
     * @param key the key to remove
     * @return the value associated with the key, then deletes the value
     */
    public String remove (String key) {

    }

    /**
     * Grows the array/Hashtable to twice its size
     */
    private void growArray() {
        String[] twiceArray = new String [2*myArray.length];
        for (int index = 0; index < myArray.length; index ++) {
            twiceArray[index] = myArray[index];
        }
        myArray = twiceArray;
    }



}
