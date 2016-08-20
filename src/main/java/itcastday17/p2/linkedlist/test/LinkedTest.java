package itcastday17.p2.linkedlist.test;

import java.util.ArrayList;


/*
 * ��ʹ��LinkedList��ģ��һ����ջ���߶������ݽṹ��
 * 
 * ��ջ���Ƚ���� First In Last Out  FILO
 * 
 * ���У��Ƚ��ȳ� First In First Out FIFO
 * 
 * ����Ӧ����������һ����������ʹ���ṩһ������������������ֽṹ�е�һ�֡�
 */


public class LinkedTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DuiLie dl = new DuiLie();
		
		dl.myAdd("abc1");
		dl.myAdd("abc2");
		dl.myAdd("abc3");
		dl.myAdd("abc4");
		
		while(!dl.isNull()){
			System.out.println(dl.myGet());
		}
		Stack s1= new Stack();
		s1.add("1");
		s1.add("2");
		s1.add("3");
		s1.add("4");
		s1.add("5");
		// 1 2 3 4 5 
		System.out.println(s1.getItem(1));
	}

}
