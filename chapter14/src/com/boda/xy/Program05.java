package com.boda.xy;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Comparator;
public class Program05 {
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("article.txt");
        String contents = new String(
        		Files.readAllBytes(path),StandardCharsets.US_ASCII);
        List<String> words = Arrays.asList(contents.split("[ ,.]"));
        
        Set<String> nwords = new HashSet<>(words);
        System.out.println(nwords.size());        
        long count = words.stream().distinct().count();
        System.out.println(count);
        
        int count2 = 0;
        for(String w:words) {
        	if(w.length() > 10) count2 ++;
        }
        System.out.println(count2);
        
        long count3 = words.stream()
        		.filter(w->w.length()>10)
        		.count();
        System.out.println(count3);
        
        words.stream().distinct()
		.filter(w->w.length()>10)
		.sorted(Comparator.reverseOrder())
		.limit(5).forEach(System.out::println);      
    }
}
