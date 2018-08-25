import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTeste_01 {

	public static void main(String[] args) {
		System.out.println("Teste de REGEX");

		String regex = "e";
		String replace = "3";
		String str = "Realizando um teste de regex, este é um exemplo";
		Pattern pattern = Pattern.compile(regex);
		Matcher macher = pattern.matcher(str);
		str = macher.replaceAll(replace);
		System.out.println(str);

		System.out.println("\n----------Matcher Básico------------");
		str = Pattern.compile("a").matcher(str).replaceAll("4");
		System.out.println(str);

	}

}
