
public class Rough2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String date = "04/18/2019-04/24/2019";
		
		String dt = date.substring(3, 5);
		String dt2 = date.substring(14, 16);
		
		int start = Integer.parseInt(dt);
		int end = Integer.parseInt(dt2);
  
		System.out.println(end+1-start);
		System.out.println(dt2);

		
	}

}
