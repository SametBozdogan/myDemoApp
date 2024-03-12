package com.mycompany.app;
java.util.ArrayList;
public class App {
	//my method will add all integers from arraylists and ints
	public static int compare(ArrayList<Integer> arr1, ArrayList<Integer> arr2,int a,int b){
		int result = 0;
		for(int i=0;i<arr1.size();i++){
			result+=arr1.get(i);
		}
		for(int i=0;i<arr2.size();i++){
			result+=arr2.get(i);
		}
		result+=a;
		result+=b;
		return result;
	}
	
	public static void main(String[] args){
		
	}
}