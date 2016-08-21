package goodtests;

public class T05ArrayHexOctalBinary 
{
	public static void main(String[] args) {
		toHex(0xff);
		toHex1(0xff);
		
		toBinary(-6);
		toBinary1(-6);
		System.out.println(Integer.toBinaryString(-6));
		
		toOctal(26);
		toOctal1(26);
		 
	}

	private static void toHex1(int num) {
		trans1(num, 16);
	}

	private static void toOctal1(int num) {
		trans1(num, 8);
	}

	private static void toBinary1(int num) {
		trans1(num, 2);
	}

	private static void trans1(int num, int bits) { // 2-1-2 8-7-3 16-15-4
		char[] hexData = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] hexDataReg = new char[32];
		for (int j = 0; j < 32; j++) {
			if (num == 0)
				break;

			int temp = num & (bits - 1); //
			hexDataReg[j] = hexData[temp];

			if (bits == 2)
				num = num >>> 1;
			else if (bits == 8)
				num = num >>> 3;
			else if (bits == 16)
				num = num >>> 4;
			else {
			}
		}
//		myPrint(hexDataReg);
		for (int i = 31; i >= 0; i--) {
			System.out.print(hexDataReg[i]);
		}
		System.out.println();
	}

	// ʮ����-->ʮ�����ơ�
	public static void toHex(int num) {
		trans(num, 15, 4);
	}

	// ʮ����-->�����ơ�
	public static void toBinary(int num) {
		trans(num, 1, 1);
	}

	// ʮ����-->�˽��ơ�
	public static void toOctal(int num) {
		trans(num, 7, 3);
	}

	public static void trans(int num, int base, int offset) {

		if (num == 0) {
			System.out.println("0");
			return;
		}
		// ����һ����Ӧ��ϵ��
		char[] chs = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		/*
		 * һ�����鵽�Ƚϵ����ݡ� ����һ�࣬���ȴ洢�������ڽ��в����� ���Զ���һ�����顣 ��ʱ������
		 */
		char[] arr = new char[32];
		int pos = arr.length;

		while (num != 0) {
			int temp = num & base;
			arr[--pos] = chs[temp];
			num = num >>> offset;
		}

		for (int x = pos; x < arr.length; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();

	}


}

