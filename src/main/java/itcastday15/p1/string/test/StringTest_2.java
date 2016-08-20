package itcastday15.p1.string.test;

/*
 * 2��һ���Ӵ��������г��ֵĴ�����
 * "nbaernbatynbauinbaopnba"
 * ˼·��
 * 1��Ҫ�ҵ��Ӵ��Ƿ���ڣ�������ڻ�ȡ����ֵ�λ�á��������ʹ��indexOf��ɡ�
 * 2������ҵ��ˣ���ô�ͼ�¼���ֵ�λ�ò���ʣ����ַ����м������Ҹ��Ӵ���
 * ��ʣ���ַ�������ʼλ�ǳ���λ��+�Ӵ��ĳ���.
 * 3,�Դ����ƣ�ͨ��ѭ����ɲ��ң�����Ҳ�������-1������ ÿ���ҵ��ü�������¼�� 
 * 
 */

public class StringTest_2 {
	public static void main(String[] args) {

		String str = "nbaernbatnbaynbauinbaopnba";
		String key = "nba";

		int countMy=getKeyStringCountMy(str, key);
		System.out.println("count="+countMy);
		
		int countMy2=getKeyStringCountMy2(str, key);
		System.out.println("count="+countMy2);

		int count = getKeyStringCount_2(str,key);
		System.out.println("count="+count);

	}

	/**
	 * 	
	 * 1�жϴ����Ӵ�<br>
	 * str.contains(key);<br>
	 * 2���ھͼ�����<br>
	 * 	cnt++<br>
	 * 3ѭ������ �� ѭ����<br>
	 * 	������ str.contains(key);<br>
	 * 	ѭ���壺��str ����nbaer -->baer<br>
	 * 
	 * @param str
	 * @param key
	 */

	private static int getKeyStringCountMy2(String str, String key) {
		int cnt=0;
		while(str.contains(key)){
			cnt++;
			int beginIndex= str.indexOf(key);//0 5
			str= str.substring(beginIndex+1, str.length()); //0+1,5+1
		}
		System.out.println(cnt);
		return cnt;
	}

	/**
	 * 
	 * loop:
	 * 	condition : str.indexOf(key)>=0
	 * 	loop 	  : 
	 * 		str = "nbaernbatnba"
	 * 		key = "nba"
	 * 		beginIndex = str.indexOf(key,beginIndex)
	 * 		
	 * @param str
	 * @param key
	 */
	private static int getKeyStringCountMy(String str, String key) {
		int counter = 0;
		int startIndex = 0;
		while (str.indexOf(key,startIndex)>=0) {//0 0,1 5,
			counter++;//1 2
			startIndex=str.indexOf(key,startIndex)+1;//0 1,1 6,
		}
		return counter;
	}
	
	public static int getKeyStringCount_2(String str, String key) {

		int count = 0;
		int index = 0;

		while ((index = str.indexOf(key, index)) != -1) {

			index = index + key.length();
			count++;

		}

		return count;
	}

	/**
	 * ��ȡ�Ӵ��������г��ֵĴ�����
	 * 
	 * @param str
	 * @param key
	 * @return
	 */
	public static int getKeyStringCount(String str, String key) {

		// 1,�����������
		int count = 0;

		// 2�����������¼key���ֵ�λ�á�
		int index = 0;

		while ((index = str.indexOf(key)) != -1) {

			str = str.substring(index + key.length());
			count++;
		}
		return count;
	}

}
