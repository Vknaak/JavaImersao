
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTeste_03 {
	public static void main(String[] args) throws FileNotFoundException {
		String cpf = "759.973.270-49";
		String regex = "(\\d{3})\\.(\\d{3})\\.(\\d{3})-(\\d{2})";
		System.out.println("CPF: " + cpf);
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(cpf);
		
		if (matcher.find()) {
		    System.out.println("Validar cpf OK");
			System.out.println(matcher.group(0));
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			System.out.println(matcher.group(3));
			System.out.println(matcher.group(4));
			// System.out.printf("%s%s%s%s",matcher.group(0),matcher.group(1),matcher.group(2),matcher.group(3),matcher.group(4)
			// );

			String cpfDb = String.format("%s%s%s%s", matcher.group(0), matcher.group(1), matcher.group(2),
					matcher.group(3), matcher.group(4));
			System.out.println(cpfDb);
		}
	}
}
