
public class TimesOccurance {

	public static void main(String[] args) {

		// Initialize array
		String[] names = { "Atyab", "Fatima", "Saeed", "Malak", "Fatima", "Daniyal", "Abdullah", "Abdullah" };

		// Array freqrncy will store frequencies of element
		int[] freqrncy = new int[names.length];
		int visited = -1;

		for (int i = 0; i < names.length; i++) {
			int count = 1;

			for (int j = i + 1; j < names.length; j++) {
				if (names[i] == names[j]) {
					count++;

					// To avoid counting same element again
					freqrncy[j] = visited;
				}
			}
			if (freqrncy[i] != visited)
				freqrncy[i] = count;
		}

		// Displays the frequency of each element present in array
		System.out.println("-----------------------");
		System.out.println(" Element | Frequency");
		System.out.println("-----------------------");
		for (int i = 0; i < freqrncy.length; i++) {
			if (freqrncy[i] != visited)
				System.out.println("	" + names[i] + "	|	" + freqrncy[i]);
		}
		System.out.println("-----------------------");
	}
}