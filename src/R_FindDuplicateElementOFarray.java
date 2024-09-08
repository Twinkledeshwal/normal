

import java.util.HashSet;

public class R_FindDuplicateElementOFarray {

	public static void main(String[] args) {
	
		/*	String a[]= {"java","c","c++","python","java"};
		
		boolean flag = false;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]==a[j]) {
					System.out.println("duplicate found :"+a[i]);
					flag=true;
				}
			}
		}
		if (flag==false) {
			System.out.println("not found");
		}
		*/
		
		HashSet lang= new HashSet();
		
		boolean flag = false;
		
	Object	 a[]= {"java","c","c++","python","java",98,98,'p',true,'p',true};
		
		for (Object l : a) {
		
			if (lang.add(l)==false) {
				System.out.println("found duplicate :"+l);
				flag=true;
			}
		}
		if (flag==false) {
			System.out.println("not found any");
		}
		
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
