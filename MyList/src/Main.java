import java.util.Arrays;
public class Main {
	 public static void main(String[] args) {

	        MyList<String> myList = new MyList<>();

	        myList.add("Alice");
	        myList.add("Bob");
	        myList.add("Charlie");


	        System.out.println("Elements: " + myList);


	        System.out.println("Number of elements : " + myList.size());

	        String element = myList.get(1);
	        System.out.println("Element in index1: " + element);

	        myList.set(2, "David");
	        System.out.println("The element at index 2 has been changed: " + myList);

	        String removedElement = myList.remove(0);
	        System.out.println("Deleted element at index 0: " + removedElement);
	        System.out.println("Current List: " + myList);

	        int indexOfBob = myList.indexOf("Bob");
	        System.out.println("Index of Bob: " + indexOfBob);

	        System.out.println("Is the list empty " + myList.isEmpty());

	        String[] array;
	        array = myList.toArray();
	        System.out.println("List array: " + Arrays.toString(array));


	        myList.clear();
	        System.out.println("The list has been cleared: " + myList);


	        myList.add("Eve");
	        myList.add("Frank");

	        MyList<String> subList = myList.sublist(0, 1);
	        System.out.println("Sublist: " + subList);

	        boolean containsAlice = myList.contains("Alice");
	        System.out.println(" Is Alice in the list?" + containsAlice);
	    }
}
