package com.GenericsInLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedHashMapTest {

	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but"+
					" because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedListHashMap<String,Integer> myLinkedListHashMap = new MyLinkedListHashMap<>();
		String words[] = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value =  myLinkedListHashMap.get(word);
			value = (value==null)?1:++value;
			myLinkedListHashMap.add(word,value);
		}
		System.out.println(myLinkedListHashMap);
		Integer frequency = myLinkedListHashMap.get("paranoid");
		assertEquals(3, (int)frequency);	
	}

	@Test
	public void givenAFilledMapWhenAvoidableWordIsRemovedShouldReturnFrequencyZero() {
		String sentence = "Paranoids are not paranoid because they are paranoid but"+
					" because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedListHashMap<String,Integer> myLinkedListHashMap = new MyLinkedListHashMap<>();
		String words[] = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value =  myLinkedListHashMap.get(word);
			value = (value==null)?1:++value;
			myLinkedListHashMap.add(word,value);
		}
		System.out.println(myLinkedListHashMap);
		myLinkedListHashMap.remove("avoidable");
		Integer frequency = myLinkedListHashMap.get("avoidable");
		if(frequency==null)
			frequency = 0;
		assertEquals(0,(int)frequency);	
	}
}
