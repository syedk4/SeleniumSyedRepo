package Java8one;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map : Key, value !!
		Map<String, Integer> mentors = new HashMap<>();
		mentors.put("syed", 25);
		mentors.put("sufdar", 26);
		mentors.put("hussain", 30);
		mentors.put("latheef", 55);
		
		//I wnated to find only the mentors above 40 years old
		
		Set<Entry<String, Integer>> mentorsEntries = mentors.entrySet();
		for (Entry<String, Integer> entry : mentorsEntries) {
			if (entry.getValue()>=30) {
				
				System.out.println(entry.getKey());
			}
		}
		
		mentors.entrySet().stream().filter(entry -> entry.getValue() > 30).forEach(entry -> System.out.println(entry.getKey()));
		
		// Efficient --> this is filtered first and iterated next.
	}

}
