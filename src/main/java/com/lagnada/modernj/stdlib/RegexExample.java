package com.lagnada.modernj.stdlib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
  public static void main(String[] args) {
    String text = "The quick brown fox jumps over the lazy dog";
    // Regex to find words of exactly five letters
    Pattern pattern = Pattern.compile("\\b\\w{5}\\b");
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      System.out.println("Match: " + matcher.group()); // Outputs matched words
    }
  }
}
