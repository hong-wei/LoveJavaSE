package goodtests;
/*
 * 
//--/LoveJavaSE/src/itcastday10/Test.java
	father class construct  pk explicit initialization ? : father class construct earlier
	eg: ����super(); // ���������ʼ�����������ʾ��ʼ����Ա����
	
//--/LoveJavaSE/src/itcastday10/Test2.java
	the construct code and explicit initialization ?      :explicit initialization earlier
	
	implicit initialization > super()> construct code >son().
	
	1 ���캯������
	2 Ĭ�ϳ�ʼ��
	3 ������
	4 �����ʼ��
	5 ��ʽ��ʼ��
	6 ��������
	7 ���캯���ľ����ʼ��
	
	answer��/LoveJavaSE/src/itcastday10/���������ʼ������.bmp	
	
*/

public class T07AllMemeryAllocation {
	    public static void main(String[] args) {    
	        objPoolTest();
	    }

	    public static void objPoolTest() {
	    	Integer i1 = 40;
	    	Integer i2 = 40;
	    	Integer i3 = 0;
	    	Integer i4 = new Integer(40);
	    	Integer i5 = new Integer(40);
	    	Integer i6 = new Integer(0);

	    	System.out.println("i1=i2   " + (i1 == i2));
	    	System.out.println("i1=i2+i3   " + (i1 == i2 + i3));
	    	System.out.println("i1=i4   " + (i1 == i4));
	    	System.out.println("i4=i5   " + (i4 == i5));
	    	System.out.println("i4=i5+i6   " + (i4 == i5 + i6));   
	    	System.out.println("40=i5+i6   " + (40 == i5 + i6));       
	    }
}





