import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice {
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * 
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	public static void addAll(Set<String> set, String... values) {
		// add all the values to the set.
		// print each one as you add it
		for (String val : values) {
			System.out.println(" " + val);
			set.add(val);
		}
		System.out.println();
	}

	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Set<String> set) {
		// create an Iterator using set.iterator()
		// then use the iterator to print everything in the set
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println();
	}

	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer() {
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
		Set zoo = new HashSet();
		String[] animals = { "dog", "ant", "bird", "elephant", "cat" };
		System.out.println("zoo adds:");
		addAll(zoo, animals);
		System.out.println("zooTree adds:");
		Set zooTree = new TreeSet();
		addAll(zooTree, animals);

		// 2. Print elements in the set using an Iterator over the Set.
		// You're going to need to do this again, so write a method print(Set set) to do
		// it.
		System.out.println("zoo is:");
		print(zoo);
		System.out.println("zooTree is:");
		print(zooTree);

		// 3. are the elements printed in same order than you added them?
		// What does this tell you about Sets?

		// Ans: No this tell that after we add elements to set. It will auto sort the
		// elements.

		// 4. Remove all the elements from the set, using a method that
		// defined in Set (and Collection). What is the method to use?

		// Ans: removeAll();
		zoo.removeAll(zoo);
		zooTree.removeAll(zooTree);

		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"
		addAll(zoo, "cat", "elephant", "bird", "ant", "dog");
		addAll(zooTree, "cat", "elephant", "bird", "ant", "dog");

		// 6. Print the elements in the set. Is the order same as before?
		System.out.println("zoo is:");
		print(zoo);
		System.out.println("zooTree is:");
		print(zooTree);
		// 7. Add duplicate elements to the set. Add another "cat" and "dog".
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").
		System.out.println("Add duplicate items to the set ");
		zoo.add(new String("cat"));
		zoo.add(new String("dog"));
		zooTree.add(new String("cat"));
		zoo.add(new String("dog"));

		// 8. Print the elements in set. Are there any duplicates?
		// What property of Set does this demonstrate?
		System.out.println("Set contains: ");
		print(zoo);
		System.out.println("zooTree is:");
		print(zooTree);

		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		// What is different when you use TreeSet?

		// Hint: Use Polymorphism. Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!

		// 10. Repeat again using TreeSet with a Comparator.
	}

	public static void main(String[] args) {
		setExplorer();
	}
}
