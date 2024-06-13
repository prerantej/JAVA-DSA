package java_basics.hashing;

import java.util.Arrays;

public class HashTable {
    int[] table;
    int size;

    public HashTable(int size){
        this.table = new int[size];
        this.size = size;
        Arrays.fill(this.table, -1);
    }

    public int hash(int key){
        return key % size;
    }

    public void insert(int key){
        int hashvalue = hash(key);

        while (table[hashvalue] != -1) {
            hashvalue = (hashvalue + 1) % size;
        }
        table[hashvalue] = key;
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            if (table[i] == -1) {
                System.out.print("~ ");
            } else {
                System.out.print(table[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashTable t1 = new HashTable(10);
        int[] elements = {1, 3, 5, 15, 7, 8, 9};
        for (int i : elements) {
            t1.insert(i);
        }

        t1.display();
    }
}
