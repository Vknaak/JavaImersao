import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegextTeste_02 {
	public static void main(String[] args) {
		String str = "Realizando um teste de regex, este é um exemplo";

		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(str);
		// System.out.println(matcher.find() + " start " + matcher.start());
		// System.out.println(matcher.find() + " start " + matcher.start());
		// System.out.println(matcher.find() + " start " + matcher.start());
		System.out.println("\n----------Matcher------------");
		while (matcher.find()) {
			System.out.println("Inicio index " + matcher.start());
			System.out.println("Fim index " + matcher.end());
			System.out.println("Grupo " + matcher.group());
		}
	}

}
