
public class StringBuilderFunctions {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Gaurav");
		System.out.println(sb);
		sb.append(" Bisht");
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuilder sb2 = new StringBuilder(str);
		System.out.println(sb2.append(" is a Student"));
		System.out.println(sb2.charAt(5));
		
		System.out.println(sb.delete(1, 3));
		
		
		
		
	}

}
