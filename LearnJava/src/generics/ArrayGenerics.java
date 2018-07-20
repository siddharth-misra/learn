package generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Not really allowed.
		List<String>[] lsa_1 = new List<String>[10];
		Object o = lsa_1;
		Object[] oa_1 = (Object[]) o;
		List<Integer> li_1 = new ArrayList<Integer>();
		li_1.add(new Integer(3));

		// Unsound, but passes run time store check
		oa_1[1] = li_1;

		// Run-time error: ClassCastException.
		String s = lsa_1[1].get(0);

		// OK, array of unbounded wildcard type.
		List<?>[] lsa = new List<?>[10];
		Object o = lsa;
		Object[] oa = (Object[]) o;
		List<Integer> li = new ArrayList<Integer>();
		li.add(new Integer(3));
		// Correct.
		oa[1] = li;
		// Run time error, but cast is explicit.
		String s = (String) lsa[1].get(0);

	}

}
