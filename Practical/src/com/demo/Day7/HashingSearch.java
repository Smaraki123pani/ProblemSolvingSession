package com.demo.Day7;

import java.util.Scanner;

public class HashingSearch {
	private int[] table;//to hash array data 
	private int size;//size

	// constructor
	public HashingSearch(int size) {
		this.size = size;
		table = new int[size];
		for (int i = 0; i < size; i++) {
			table[i] = -1;
		}
	}

	private void insert(int key) {
		int index = hashfunction(key);

		// linear probing to avoid collision
		while (table[index] != -1) {
			index = (index + 1) % size;
		}
		table[index] = key;// insert first available value
	}

	private int hashfunction(int key) {
		return key % size;
	}

	private void display() {
		for (int i = 0; i < size; i++) {
			if (table[i] != -1) {
				System.out.print(i + " ");
			} else {
				System.out.print(table[i] + " ");
			}
		}

	}
//search
	private boolean search(int key) {
		int index=hashfunction(key);
		
		while(table[index]!=-1) {
			if(table[index]==key) {
				return true;
			}
			index=(index+1)%size;//move to next
		}
		return false;//if element is not available.
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		HashingSearch ht = new HashingSearch(size);

		int noofkeys = sc.nextInt();

		for (int i = 0; i < noofkeys; i++) {
			int key = sc.nextInt();
			ht.insert(key);
		}
		
		int searchkey=sc.nextInt();

		ht.display();	
		if(ht.search(searchkey)) {
			System.out.println("Key "+searchkey+ " found in the hash table");
		}else {
			System.out.println("Key "+searchkey+ " not found in the hash table");

		}
	}

	

}
