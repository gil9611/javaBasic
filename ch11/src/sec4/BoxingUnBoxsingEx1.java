package sec4;

public class BoxingUnBoxsingEx1 {

	public static void main(String[] args) {
		// Boxing : 기본(primitive)을 래퍼(wrapper)로 바꿔주는 것.
		/*	shot 	->	Short
		 *	int		->	Integer
		 *	long 	->	Long
		 *	float	->	Float
		 * 	double	->	Double
		 * 	byte	->	Byte
		 * 	char	x
		 * 	boolean	->	Boolean
		 */
		
		//UnBoxing 반대로 래퍼를 기본으로 돌리는것.
		
		
		//Boxing
		Integer int1 = new Integer(1004);
		Integer int2 = new Integer("1004");
		Integer int3 = Integer.valueOf("1004");
		
		
		//UnBoxing
		int iv1 = int1.intValue();
		int iv2 = int2.intValue();
		
		System.out.println("int1 == iv1 : " +(int1 == iv1));
	}

}
