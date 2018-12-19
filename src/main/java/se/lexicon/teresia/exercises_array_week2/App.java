package se.lexicon.teresia.exercises_array_week2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hello you!");
		int[] intArray = new int[] { 11, 23, 39, 44, 55, 66 };
		printArray(intArray);
		Scanner inputData = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int searchFor = Integer.parseInt(inputData.nextLine());
		int indx = indexOf(intArray, searchFor);

		if (indx != -1)
			System.out.println("Index of " + searchFor + " is " + indx);
		else {
			System.out.println(searchFor + " was not found in the array");
		}
		String[] citys = new String[] { "Paris", "London", "New York", "Stockholm" };
		System.out.println("String array: ");
		printArray(citys);
		Arrays.sort(citys);
		System.out.println("Sort string array: ");
		printArray(citys);
		
		int[] firstArray = new int[] {1,15,20};
		int[] secondArray = new int[3];
		System.arraycopy(firstArray, 0, secondArray, 0, secondArray.length);
		System.out.println("Elements from first array: ");
		printArray(firstArray);
		System.out.println("Elements from second array: ");
		printArray(secondArray);
		
		
	}

	private static int indexOf(int[] intArray, int searchNumber) {

		for (int i = 0; i < intArray.length; i++) {
			if (searchNumber == intArray[i]) {
				return i;
			}
		}
		return -1;
	}

	private static void printArray(int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {

			if (i != intArray.length - 1) {
				System.out.print(intArray[i] + ", ");
			} else
				System.out.println(intArray[i]);
		}
	}

	private static void printArray(String[] strArray) {

		for (int i = 0; i < strArray.length; i++) {

			if (i != strArray.length - 1) {
				System.out.print(strArray[i] + ", ");
			} else
				System.out.println(strArray[i]);
		}
	}
}
