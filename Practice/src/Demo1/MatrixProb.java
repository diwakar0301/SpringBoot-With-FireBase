package Demo1;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
		
		ArrayList<Integer> inside1=new ArrayList<>(
	            Arrays.asList(0,0,0,0));
		
		ArrayList<Integer> inside2=new ArrayList<>(
	            Arrays.asList(0,0,0,0));
		
		ArrayList<Integer> inside3=new ArrayList<>(
	            Arrays.asList(0,0,0));
		
		matrix.add(inside1);
		matrix.add(inside2);
		matrix.add(inside3);
		
		System.out.println(matrix);
		Integer r1=-1,c1=-1;
		for(int row=0;row<matrix.size();row++) {
			if(matrix.get(row).contains(1)) {
				r1=row;
				c1=matrix.get(row).indexOf(1);
				break;
			}
		}
		
		if(r1!=-1 && c1!=-1) {
			System.out.println(r1+""+c1);
		}
		else {
			System.out.println("no 1's in matrix");
		}
				
	}

}
