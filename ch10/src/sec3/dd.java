package sec3;

import java.util.regex.Pattern;

public class dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";
		String data1 = "010-1248-1234";
		String data2 = "025-555-1234";
		String data3 = "031-5555-5555";
		
		boolean res = Pattern.matches(regExp, data1);
	}

}
