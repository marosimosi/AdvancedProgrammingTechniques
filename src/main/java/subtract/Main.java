package subtract;

public class Main {
	
	
	 public static String sub(int x, int y) {
		 int res = x-y;
		 if (res>=0) return "POSITIVE";
		 return "NEGATIVE";
	 }
	 
	 
	 public static void main(String[] args) {
		 String res = sub(4,7);
		 System.out.println(res);
	 }

}
