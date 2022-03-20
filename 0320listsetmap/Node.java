package listsetmap;

public class Node {
    private String key;
    private String value;

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
    }
}

class HashTable {
    private int size;
    private Node[] nodes;
//hashtable


    public HashTable(int size) {
        this.size = size;
        this.nodes = new Node[size]; //
    }

    private int hashFunction(String name) {
        //calculte the sum of each character's ascii code
        int totoalSum = 0;
        for (int letterIndex = 0; letterIndex < name.length(); letterIndex++) {
            totoalSum += name.charAt(letterIndex);
        }
        //modulo totalsum with the size of the hash table
        int hashValue = totoalSum % size;
        return hashValue;//index in hashtable

    }
}

