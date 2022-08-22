package com.accolite.easy;

/*
 https://leetcode.com/problems/design-hashmap/
 
 Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:

MyHashMap() initializes the object with an empty map.
void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 */

public class DesignHashMap {

	public static void main(String[] args) {
		MyHashMap myHashMap=new MyHashMap();
		myHashMap.put(1, 1);
		myHashMap.put(2, 2);
		myHashMap.get(1);
		myHashMap.put(2, 3);
		myHashMap.get(2);
		myHashMap.remove(2);
		myHashMap.get(2);
		myHashMap.get(1);
	}
}

class MyHashMap {
	
	private int[] arr;

    public MyHashMap() {
        arr=new int[1000];
        for(int i=0;i<1000;i++)
        	arr[i]=-1;
    }
    
    public void put(int key, int value) {
        arr[key]=value;
    }
    
    public int get(int key) {
        return arr[key];
    }
    
    public void remove(int key) {
        arr[key]=-1;
    }
}