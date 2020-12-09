package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collections {

	public static void main(String[] args) {
// Create an instance of an ArrayList of String called employeeNames
		List<String> employeeNames = new ArrayList<>();
		
// Create an instance of a HashSet of Integer called ids
		Set<Integer> ids = new HashSet<>();
		
// Create an instance of a HashMap of Integer, String called employeeMap
		Map<Integer, String> employeeMap = new HashMap<>();
		
// Add at least five entries to the employeeNames and ids (make sure both 
// collections have the same number of entries).
		List<String> employeeNames2 = Arrays.asList("Dean", "Mike", "Radha", "Arun", "Vivek");
		employeeNames.addAll(employeeNames2);
		
		ids.add(0);
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(5);
		
// Create a variable int i = 0; then iterate over ids using an enhanced for loop. 
// Inside the enhanced for loop use employeeMap.put() to add a new entry to the 
// map. The entry should consist of a key that is the id in the enhanced loop’s 
// current iteration, and a value that is the employeeName at position i of the 
// employeeNames ArrayList. Increment i so that each iteration grabs the next 
// element in the ArrayList.

		int i = 0;
		for (int id : ids) {
			 String empName = employeeNames.get(i++);
			 employeeMap.put(id, empName);
		}
		

// Once the employeeMap is fully populated, use another enhanced for loop to 
// iterate over the employeeMap.keySet(), and use the key for each current 
// iteration to print to the console both the current key and its associated 
// value in the map.
		for (int key : employeeMap.keySet()) {
			System.out.println(key + " " + employeeMap.get(key));
		}
		
// Create a StringBuilder called idsBuilder.
		StringBuilder idsBuilder = new StringBuilder();
		
// Iterate over the ids HashSet and append each id, followed by a dash “-“ to 
// idsBuilder.
		for(int id : ids) {
			idsBuilder.append(id).append("-");
		}
		
// Print the result of idsBuilder.toString() to the console.
		System.out.println(idsBuilder.toString());
		
// Create another StringBuilder called namesBuilder.
		StringBuilder namesBuilder = new StringBuilder();
		
// Iterate over the employeeNames ArrayList and append each name, followed by a 
// space “ “ to the namesBuilder.
		for(String name : employeeNames) {
			namesBuilder.append(name).append(" ");
		}
		
		// Print the result of namesBuilder.toString() to the console.
		System.out.println(namesBuilder.toString());
	}

}
