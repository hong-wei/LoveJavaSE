package itcastday15.p2.stringbuffer.test;
/**��һ��int[]�������ַ�����
	 	eg1����String���˷ѿռ䣬ÿ�ζ�������µ�String�ڳ������С�
	 	eg2����StringBuffer�������Ч�ʡ�
	����㱣�������Ҫ���ַ�������ʽ��ʹ������stringbuffer ��stringbuilder����ʽ��
	һ����������ȡ���ľ�ֻ���ַ��������飬�����ȡ���ĸ�ʽһ���ġ�
	
	@author zhanghongwei
	@param arr
	@return
	 
*/

public class StringBuilderTest {
	public static void main(String[] args) {

		int[] arr = {3,1,5,3,8};
		String s = arrayToString_2(arr);
		String s1 = arrayToString_My(arr);
		String s2 = arrayToString_My2(arr);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
	private static String arrayToString_My2(int[] arr) {
		StringBuffer sBuffer= new StringBuffer("[");
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1)
				sBuffer=sBuffer.append(arr[i]).append("] ");	
			else
				sBuffer=sBuffer.append(arr[i]).append(", ");	
		}
		return sBuffer.toString();
	}
	private static String arrayToString_My(int[] arr) {
		String string = "[";
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1)
				string=string+arr[i]+"] ";	
			else
				string=string+arr[i]+", ";
		}
		return string;
	}
	public static String arrayToString_2(int[] arr){
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				sb.append(arr[i]+", ");
			else
				sb.append(arr[i]+"]");
		}
		return sb.toString();
	}
	
	public static String arrayToString(int[] arr){
		
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				str+=arr[i]+", ";
			else
				str+=arr[i]+"]";
		}
		return str;
	}

}
