/**
--------------------------------------------String----------------------------------------------
StringDemo.java
01-���ö���API(String��-�ص�).avi (23:42)
	1 �ص㣺�ַ�������һ������ʼ���Ͳ��ᱻ�ı䡣
	2 �ַ���������--����û�оͽ����������У�ֱ���á�
		String s = "abc";
	3 new ���Ķ����ڶ��С�
	eg:StringDemo.java 
	
StringConstructorDemo.java
	1 һ����15��constructors�� 1+8+2+1+3 =15
	2 byte[]--> String 
	3 char[]--> String 
	eg: StringConstructorDemo 

StringMethodDemo.java
	1 һ����65��methods��������������˼����ַ������й��ܷ��ࡣ
	1,��ȡ��
		1.1 ��ȡ�ַ������ַ��ĸ���(����).
				int length();
		1.2 ����λ�û�ȡ�ַ���
				char charAt(int index);
		1.3 ����'�ַ�'��ȡ���ַ����еĵ�һ�γ��ֵ�λ��.
				int indexOf(int ch)
				int indexOf(int ch,int fromIndex):��ָ��λ�ý���ch�Ĳ��ҵ�һ�γ���λ�� 
				int lastIndexOf(int ch)
				int lastIndexOf(int ch,int fromIndex):��ָ��λ�ý���ch�Ĳ��ҵ�һ�γ���λ�� 
			����'�ַ���'��ȡ���ַ����еĵ�һ�γ��ֵ�λ��.
				int indexOf(String str);
				int indexOf(String str,int fromIndex);
				int lastIndexOf(String str);
				int lastIndexOf(String str,int fromIndex);
		1.4 ��ȡ�ַ�����һ�����ַ�����Ҳ���Ӵ�.
				String substring(int beginIndex, int endIndex)//����begin ������end ��
				String substring(int beginIndex);
	2��ת����
		2.1 ���ַ�������ַ�������(�ַ������и�)
			String[]  split(String regex):�漰��������ʽ.
		2.2 ���ַ�������ַ����顣
			char[] toCharArray();
		2.3 ���ַ�������ֽ����顣
			byte[] getBytes();
		2.4 ���ַ����е���ĸת�ɴ�Сд��
			String toUpperCase():��д
			String toLowerCase():Сд
		2.5 ���ַ����е����ݽ����滻
			String replace(char oldch,char newch);
			String replace(String s1,String s2);
		2.6 ���ַ������˵Ŀո�ȥ����
			String trim();
		2.7 ���ַ����������� ��
			String concat(string);
		2.8 ��̬�������ѱ��ֵ��Ϊ�ַ���
			String.valueOf(4)--> 4 --> �ַ���
	3���ж�
		3.1 �����ַ��������Ƿ���ͬ����
			boolean equals(Object obj);
			boolean equalsIgnoreCase(string str);���Դ�д�Ƚ��ַ������ݡ�
		3.2 �ַ������Ƿ����ָ���ַ�����
			boolean contains(string str);
		3.3 �ַ����Ƿ���ָ���ַ�����ͷ���Ƿ���ָ���ַ�����β��
			boolean startsWith(string);
			boolean endsWith(string);
	4���Ƚϡ�
		4.1 "abc".compareTo("aqz")
		
StringObjectDemo.java
	//intern():���ַ����ؽ��в�����,�Ѷ������ݣ����볣������

StringTest.java
StringTest_1.java
	1������һ���ַ������顣�����ֵ�˳����д�С���������
		{"nba","abc","cba","zz","qq","haha"}
StringTest_2.java
	2��һ���Ӵ��������г��ֵĴ�����
 		"nbaernbatynbauinbaopnba"
StringTest_3.java
 	3�������ַ����������ͬ���Ӵ���
 		"qwerabcdtyuiop"
  		"xcabcdvbn"
StringTest_4.java
 	4��ģ��һ��trim����һ�µķ�����ȥ���ַ������˵Ŀհ� 


--------------------------------------------StringBuffer------------------------------------------
StringBufferDemo.java	
	StringBuffer:�����ַ���������,���ڴ洢���ݵ�������
	1 �ص㣺
		1�����ȵĿɱ�ġ� 
		2�����Դ洢��ͬ�������ݡ�
		3������Ҫת���ַ�������ʹ�á�
		4�����Զ��ַ��������޸ġ�
	2 ������ -- 4 
		StringBuffer() 
		StringBuffer(CharSequence seq) 
		StringBuffer(int capacity) 
		StringBuffer(String str) 
	3 ���� -- 50
	  ��Ȼ��һ����������Ӧ�þ߱�ʲô�����أ�
	  CURD --��ɾ�Ĳ�  C(create)U(update)R(read)D(delete) 
		1����ӣ�
				StringBuffer append(data); --14
				StringBuffer insert(index,data); --12
				sb.append(x) �� sb.insert(sb.length(), x) ������ͬ��Ч����
		2��ɾ����
				StringBuffer delete(start,end):����ͷ��������β�� -1
				StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ�Ԫ�� -1
		3�����ң�
				char charAt(index);
				int indexOf(string);
				int lastIndexOf(string);
		4���޸ģ�
				StringBuffer replace(start,end,string);
				void setCharAt(index,char);
--------------------------------------------day15StringBuilder---------------------------------------
StringBuilderDemo.java
	jdk1.5�Ժ�����˹��ܺ�StringBufferһģһ���Ķ��󡣾���StringBuilder
	��ͬ���ǣ�
		StringBuffer���߳�ͬ���ġ�ͨ�����ڶ��̡߳�
		StringBuilder���̲߳�ͬ���ġ�ͨ�����ڵ��̡߳� ���ĳ������Ч�ʡ�

StringBuilderTest.java
 	��һ��int[]�������ַ�����
	 	eg1����String���˷ѿռ䣬ÿ�ζ�������µ�String�ڳ������С�
	 	eg2����StringBuffer�������Ч�ʡ�
	����㱣�������Ҫ���ַ�������ʽ��ʹ������stringbuffer ��stringbuilder����ʽ��
	һ����������ȡ���ľ�ֻ���ַ��������飬�����ȡ���ĸ�ʽһ���ġ�

JDK����
	1������д��
	2�����Ч�ʡ�
	3�����Ӱ�ȫ�ԡ�

*/
/**
* show �����ļ���. 
* <p>show ��������ϸ˵����һ��<br> 
* show ��������ϸ˵���ڶ��� 
* @param b true ��ʾ��ʾ��false ��ʾ���� 
* @return û�з���ֵ  

 * @author zhanghongwei
 *
 */

package itcastday15;