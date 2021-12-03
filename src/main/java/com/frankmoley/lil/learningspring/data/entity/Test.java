package com.frankmoley.lil.learningspring.data.entity;

import antlr.StringUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Component
public class Test {
    private String mainString = "The menuver of the local trains over the riverfront is not the last this someone with the skillset of yours' would like to encounter at the very morning!";
    private String stub = "the";

    @Override
    public String toString() {
        int count = this.findMatchCount(this.mainString, this.stub, false);
        HashMap<Character, Integer> charFreq = this.charFrequency(this.mainString);
        return "Test{ matches } " + count + " and charFreq : " + charFreq;
    }
    public int findMatchCount(String haystack, String needle, Boolean caseSensitive){
        if(!caseSensitive){
            haystack = haystack.toLowerCase(Locale.ROOT);
            needle  = needle.toLowerCase(Locale.ROOT);
        }
        return haystack.split(needle, -1).length-1;
    }
    public HashMap charFrequency(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, new Integer(val + 1));
            }
            else {
                map.put(c, 1);
            }
        }
        return map;

    }
}
