import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas_01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Marcola");
		list.add("Anna");
		list.add("Julia");
		list.add("Andrea");
		list.add("Maria");
		list.add(2, "Nelio");
				
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M'); // Tirando todos que não comecem com a letra M
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		
		System.out.println("Index of Julia: " + list.indexOf("Julia"));
		System.out.println("Index of Andrea: " + list.indexOf("Andrea"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
		System.out.println(name);

		
	}

}
