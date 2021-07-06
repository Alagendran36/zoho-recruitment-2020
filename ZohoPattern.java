package com.Zoho;

import java.util.Scanner;

public class ZohoPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String");
		String str = sc.next();
		int k=str.length()-1;
		while(k>=0) {
			for(int i=0;i<k;i++) {
				System.out.print(" ");
			}
			int index = str.length()/2;
			for(int i=str.length()-1;i>=k;i--) {
				System.out.print(str.charAt(index%str.length()));
				index++;
			}
			System.out.println();
			k--;
		}
		sc.close();
	}

}
