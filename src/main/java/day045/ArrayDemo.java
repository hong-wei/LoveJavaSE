package day045;

import java.util.Arrays;

import algorithms.Person;

class ArrayDemo
{
	public static void main(String[] args)
	{

		// array save Person Objects;
		int length = 10;
		Person p1 = new Person("Hongwei", 28);
		Person p2 = new Person("Yanlu", 26, p1);
		Person[] personArray = new Person[length];
		personArray.toString();
		personArray[0] = p2;
		personArray[1] = p1;
		Arrays.fill(personArray, p1);

		// Ԫ������[] ������ = new Ԫ������[Ԫ�ظ��������鳤��];

		{// �ֲ�����顣�޶��ֲ��������������ڡ�
			int age = 3;
			System.out.println(age);
		}

		char[] charArray = new char[5];
		System.out.println(charArray[0]); // default initialization

		int[] arr = new int[3];
		System.out.println(arr[0]); // default initialization

		int[] a = new int[3];
		int[] a1 = new int[] { 1, 2, 3 };
		int[] a2 = { 1, 2, 3 };
	}
}
