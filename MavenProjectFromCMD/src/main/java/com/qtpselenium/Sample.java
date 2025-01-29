package com.qtpselenium;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Learning Maven");
		
		Xls_Reader xls = new Xls_Reader("C:\\Data.xlsx");
		
		System.out.println(xls.getRowCount("TestCases"));
	}

}
