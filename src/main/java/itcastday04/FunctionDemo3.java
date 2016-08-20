package itcastday04;

class FunctionDemo3 
{
	public static void main(String[] args) 
	{
		draw(4,6);
		drawMine(4,6);
		draw(7,9);
		drawMine(7,9);
		print99();	
		print99Mine();	

		System.out.println(getScoreLevel(-10));
		
	}
	/*
	 * 1*1=1
	 * 1*2=2 2*2=4
	 * 1*3=3 2*3=6 3*3=9
	 * */
	private static void print99Mine() {
		for (int row = 0; row <=9; row++) {
			for (int column = 1; column <=row; column++)
				System.out.print(column+"*"+row+"="+column*row+"\t");
			System.out.println();
		}
	}

	private static void drawMine(int i, int j) {
		for(int row=0;row<i;row++){
			for(int column=0;column <j;column++)
				System.out.print("*");
			System.out.println();
		}
	}

	/*
	����2�� ����һ�����ܣ�������������ĺ͵Ļ�ȡ��
	˼·����Ȼ���幦�ܣ����ǿ����ú��������֡�
		��ζ���һ�������أ�
		ͨ��������ȷ����ɡ�
	��ȷһ��������ܵĽ����ʲô��
		�Ǻ͡��ǹ��ܵĽ�������Ըù��ܵķ���ֵ������int ��
		��ʵ��������ȷ�����ķ���ֵ���͡�

			
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
		�У������ͱ�����������Ǻ����Ĳ����б�(�����ĸ���������������)
		��ʵ��������ȷ�����б�

	ע�⣺����ֵ���ͺͲ�������û��ֱ�ӹ�ϵ��

	*/
	public static int add(int a,int b)
	{
		int sum = a+b;
		return sum;
	}

	/*
	����3�� ����һ�����ܣ���һ�������ڿ���̨��
	��ȷһ��������ܵĽ����ʲô��
		û�н������Ϊֱ�Ӵ�ӡ���ˣ�����̨����δ���ظ������ߡ�
		��void��ʾ��
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
		�У��к��в�ȷ�������������� int.
	*/
	public static void draw(int row,int col)
	{
		for (int x=1; x<=row ;x++ )
		{
			for (int y=1;y<=col ; y++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
//		return ;//����ʡ�Բ�д��
	}


	/*
	����4�� ����һ�����ܣ��Ƚ��������Ƿ���ȡ�
	��ȷһ��������ܵĽ����ʲô��
			�У�boolean.
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
			�У�����������

	*/
	public static boolean equals (double a,double b)
	{
		return a==b?true:false;
	}
	public static boolean equals(int a,int b)
	{
		/*
		if(a==b)
			return true;
		else
			return false;


		boolean x ;
		if(a==b)
			x = true;
		else
			x = false;
		return x;

		*/
//		return (a==b)?true:false;

		return a==b;
		
	}

	/*
	����5�� ����һ�����ܣ���ȡ���������нϴ���Ǹ�����
	��ȷһ��������ܵĽ����ʲô��
			�У�����һ������ int
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
			�У�����Ƚϵ��������� int
	*/
	public static double getMax(double a,double b)
	{
		return a>b?a:b;
		
	}
	public static int getMax(int a,int b)
	{
		/*
		if(a>b)
			return a;
		else
			return b;
		*/

		return a>b?a:b;
	}

	/*
	���幦6����ӡ99�˷���

	*/

	public static void print99()
	{
		for(int x=1; x<=9; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

	/*
	 * ����7 
	���ݿ��Գɼ���ȡѧ��������Ӧ�ĵȼ�
	90~100		A
	80~89		B
	70~79		C
	60~69		D
	60����		E

	������ȼ����ַ���char
	���������� ��int.
	*/

	public static char getScoreLevel(int scores) {
		char studentLevel = 0;
		if (scores <= 100 && scores >= 90) {
			studentLevel = 'A';
		} else if (scores < 90 && scores >= 80) {
			studentLevel = 'B';
		} else if (scores < 80 && scores >= 70) {
			studentLevel = 'C';
		} else if (scores < 70 && scores >= 60) {
			studentLevel = 'D';
		} else if (scores < 60 && scores >= 0) {
			studentLevel = 'E';
		} else {
			System.out.println("Wrong number");
		}
		return studentLevel;
	}
	
	public static char getLevel(int num)
	{
		char level ;
		if(num>=90 && num<=100)
			level = 'A';
		else if(num>=80 && num<=89)
			level =  'B';
		else if(num>=70 && num<=79)
			level =  'C';
		else if(num>=60 && num<=69)
			level =  'D';
		else 
			level =  'E';

		return level;
	}


}
