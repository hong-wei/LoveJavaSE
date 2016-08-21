package itcastday19.p1.map.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * ��ϰ:
 * "fdgavcbsacdfs" ��ȡ���ַ����У�ÿһ����ĸ���ֵĴ�����
 * Ҫ���ӡ����ǣ�a(2)b(1)...;
 * 
 * ˼·��
 * ���ڽ���ķ������֣���ĸ�ʹ���֮�������ӳ��Ĺ�ϵ���������ֹ�ϵ�ܶࡣ
 * �ܶ����Ҫ�洢���ܴ洢ӳ���ϵ�������������Map���ϡ�
 * ��ϵһ��ʽ��������û�У�
 * �Ǿ���ʹ��Map���ϡ� �ַ��ֿ��Ա�֤Ψһ�Ե�һ���߱���˳���� a b c ...
 * ���Կ���ʹ��TreeMap���ϡ�
 * 
 * �����������Ӧ�ô洢������ĸ�ʹ����Ķ�Ӧ��ϵ�� 
 * 
 * 1����Ϊ���������ַ����е���ĸ�������Ƚ��ַ�������ַ����顣
 * 2�������ַ����飬��ÿһ����ĸ��Ϊ��ȥ��Map���������
 * �������ĸ�������ڣ��ͽ�����ĸ��Ϊ�� 1��Ϊֵ�洢��map�����С�
 * �������ĸ�����ڣ��ͽ�����ĸ����Ӧֵȡ����+1���ڽ�����ĸ��+1���ֵ�洢��map�����У�
 * ����ֵͬ�Ḳ�ǡ������ͼ�¼ס�˸���ĸ�Ĵ���.
 * 3������������map���Ͼͼ�¼������ĸ�ĳ��ֵĴ�����oy.
 * 
 * 
 */

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 String str = "fdg+avAdc  bs5dDa9c-dfs";

		 String s = getCharCount(str);
		String s1 = getCharCountMy(str);

		 System.out.println(s);
		 System.out.println(s1);
//		 System.out.println((int)'z' +"-"+ (int)'A');
	}

	private static String getCharCountMy(String str) {
		String temp = "";
		TreeMap <String, Integer> hashMap = new TreeMap<String, Integer>( new CompByLetter());
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) { //1 ѭ�������ַ���
			//if hasmap had, we add if not we set 0;
			// if is letter:
			if(charArray[i]>=65 &&charArray[i]<=122){
				Integer integer = hashMap.get(String.valueOf(charArray[i]));
				if (integer==null) {
					integer=1;
				} else {
					integer=integer+1;
				}
				hashMap.put(String.valueOf(charArray[i]), integer);
	//			System.out.println(integer);
				
	//			System.out.println(charArray[i]);
			}
		}
//		 2 output
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		for (Iterator iterator = entrySet.iterator(); iterator.hasNext();) {
			Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
			Integer value = entry.getValue();
			String key = entry.getKey();
//			System.out.println(key + ":" + value);
			temp=temp+key + "(" + value+")";
		}

		return temp;
	}

	public static String getCharCount(String str) {

		// ���ַ�������ַ�����
		char[] chs = str.toCharArray();

		// ����map���ϱ�
		Map<Character, Integer> map = new TreeMap<Character, Integer>();

		for (int i = 0; i < chs.length; i++) {

			if (!(chs[i] >= 'a' && chs[i] <= 'z' || chs[i] >= 'A' && chs[i] <= 'Z'))
				// if(!(Character.toLowerCase(chs[i])>='a' &&
				// Character.toLowerCase(chs[i])<='z'))
				continue;

			// �������е���ĸ��Ϊ��ȥ��map��
			Integer value = map.get(chs[i]);

			int count = 1;

			// �ж�ֵ�Ƿ�Ϊnull.
			if (value != null) {
				count = value + 1;
			}
			// count++;
			map.put(chs[i], count);
			/*
			 * if(value==null){ map.put(chs[i], 1); }else{ map.put(chs[i],
			 * value+1); }
			 */
		}

		return mapToString(map);
	}

	private static String mapToString(Map<Character, Integer> map) {

		StringBuilder sb = new StringBuilder();

		Iterator<Character> it = map.keySet().iterator();

		while (it.hasNext()) {
			Character key = it.next();
			Integer value = map.get(key);

			sb.append(key + "(" + value + ")");
		}

		return sb.toString();
	}

}
