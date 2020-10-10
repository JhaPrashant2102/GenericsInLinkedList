package com.GenericsInLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyHashMapTest {

	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnFrequency() {
		String sentence = "to be or not to be";
		MyHashMap<String,Integer> myHashMap = new MyHashMap<>();
		String words[] = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myHashMap.get(word);
			value = (value==null)?1:++value;
			myHashMap.add(word,value);
		}
		int frequency = myHashMap.get("to");
		System.out.println(myHashMap);
		assertEquals(2,frequency);
	}

}
