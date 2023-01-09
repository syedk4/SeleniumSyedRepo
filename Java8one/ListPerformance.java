package Java8one;

import java.util.ArrayList;
import java.util.List;

public class ListPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> mentors = new ArrayList<>();
		mentors.add("Ram");
		mentors.add("Princilla");
		mentors.add("Subraja");
		mentors.add("Dillip");
		mentors.add("Eswar");
		
		// I want to find out how many of have name lenght greater than 5
		int count = 0;
		for (int i = 0; i < mentors.size(); i++) {
			if (mentors.get(i).length()>5) {
				count++;
			}
		}
		System.out.println(count);
		// How to write this in Java 8
		
		long mentorCount = mentors.stream().filter(mentor -> mentor.length() > 8).count();
		System.out.println(mentorCount);
		
	}

}
