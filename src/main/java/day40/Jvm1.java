package day40;

//http://blog.csdn.net/ant_ren/article/details/2903630
import java.util.ArrayList;
import java.util.List;

public class Jvm1
{
	private static double d = 3.14;

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		int size = list.size();
		String s = null;
		if (size > 0)
		{
			s = list.get(0);
		}
		if (s != null)
		{
			s += " World!";// +=���صĶ���һ���µ�String����
		}
		System.out.println(d);
		System.out.println(s);
	}
}

/**
 * <pre>
�����õ�һЩ�����﷨������ӿ�ǩ�������͸�ֵ��String���졢String�����ȡ�֮������ִ��javac Demo.java�����Demo.class�ļ���JDK�ṩ��һ��������ָ�����javap��ִ��javap -c Demo > Instructions.txt�����class�ļ����Ű����Demo.class�ļ�����JVM�ֽ��룬������������ֽ���ɣ�

[java] view plain copy print?
Compiled from "Demo.java"
public class Demo extends java.lang.Object{
public Demo();
  Code:
   0:   aload_0 //��ʾ��ִ��ջ���±�0����ȡһ�����ó���
   1:   invokespecial   #1; //Method java/lang/Object."<init>":()V //<init>�������ڴ�������ʱ���г�ʼ��,����ʵ�������ĸ�ֵ�ͳ�ʼ����̬���
	   Invoke the method, special handling for superclass, private, and instance initialization method invocations
	   ����Ҫ������������ֵ�invokevirtualָ��(�ֽ��룺0xb6)�����ǵ�����Ҳ����invokevirtual����ͨ��һ�㣬�����һ��ʵ���ķ�������invokespecial�Ƕ����������������õģ�
	        1��˽�з���
	        2�����ø���̳������ķ���
	        3��ÿ������ĳ�ʼ��
        	4:   return
public static void main(java.lang.String[]);
  Code:
   0:   new #2; //class java/util/ArrayList
   3:   dup //��ֵ��������ջ
   4:   invokespecial   #3; //Method java/util/ArrayList."<init>":()V
   7:   astore_1
   8:   aload_1
   9:   ldc #4; //String Hello //ldc��ָPush item from runtime constant pool�����ӳ�������ȡֵѹ�����ջ��
   11:  invokeinterface #5,  2; //InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
   16:  pop //pop��������ջ����ֵ
   17:  aload_1
   18:  invokeinterface #6,  1; //InterfaceMethod java/util/List.size:()I
   23:  istore_2
   24:  aconst_null
   25:  astore_3
   26:  iload_2
   27:  ifle    41
   30:  aload_1
   31:  iconst_0
   32:  invokeinterface #7,  2; //InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
   37:  checkcast   #8; //class java/lang/String
   40:  astore_3
   41:  aload_3
   42:  ifnull  65
   45:  new #9; //class java/lang/StringBuilder
   48:  dup
   49:  invokespecial   #10; //Method java/lang/StringBuilder."<init>":()V
   52:  aload_3
   53:  invokevirtual   #11; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   56:  ldc #12; //String  World!
   58:  invokevirtual   #11; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   61:  invokevirtual   #13; //Method java/lang/StringBuilder.toString:()Ljava/lang/String;
   64:  astore_3
   65:  getstatic   #14; //Field java/lang/System.out:Ljava/io/PrintStream;
   68:  getstatic   #15; //Field d:D
   71:  invokevirtual   #16; //Method java/io/PrintStream.println:(D)V
   74:  getstatic   #14; //Field java/lang/System.out:Ljava/io/PrintStream;
   77:  aload_3
   78:  invokevirtual   #17; //Method java/io/PrintStream.println:(Ljava/lang/String;)V
   81:  returns
static {};
  Code:
   0:   ldc2_w  #18; //double 3.14d
   3:   putstatic   #15; //Field d:D
   6:   return
}
 * </pre>
 */