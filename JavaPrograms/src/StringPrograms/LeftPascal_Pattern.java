package StringPrograms;

public class LeftPascal_Pattern {

	public static void main(String[] args) {
		 int size = 5;
		    int alpha = 65;

		    for (int i = 1; i <= size; i++) {
		      for (int j = 0; j < i; j++) {
		        System.out.print((char)(alpha+j));
		      }
		      System.out.println();
		    }

		    for (int i = 1; i <= size - 1; i++) {
		      for (int j = 0; j < size - i; j++) {
		        System.out.print((char)(alpha+j));
		      }
		      System.out.println();
		    }

	}

}
