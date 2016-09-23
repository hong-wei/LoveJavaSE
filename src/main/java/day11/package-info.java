/**
ExceptionDemo.java
�쳣�׳�����.bmp
	1 definition��
		�쳣:��������ʱ�ڷ����Ĳ������������java���������ʽ�Բ�������������������ͷ�װ����
			������������������࣬�ͳ�Ϊ�쳣�ࡣ 
			��ʵ�쳣����javaͨ����������˼�뽫�����װ���˶���,���쳣��������������
	
		��ǰ:�������̴�������⴦���������. 			eg:public static void sleep2(int time)
		����:���������̴�������⴦�������롣����Ķ���. eg:public static void sleep(int time)

	2 ��ϵ System
		��ͬ�������ò�ͬ������о���������� ����Ǳ�Խ�硣��ָ��ȵ�,����ܶ࣬��ζ����������Ҳ�ܶ࣬���乲�Խ������ϳ�ȡ���γ����쳣��ϵ��
	
		1 �������⣨������������ͷֳ��������ࡣ
			|--1��һ�㲻�ɴ���ġ�Error
					�ص㣺����JVM�׳��������Ե����⡣�������ⷢ��һ�㲻����Դ���ֱ���޸ĳ���
					     eg:int[] arr = new int[1024*1024*800];
					     //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
			|--2�����Դ���ġ�Exception
						 eg: int [] arr =null; sop(arr[0]);    
						 //Exception in thread "main" java.lang.NullPointerException
			
		2 Throwable:������error�������쳣�����⣬���ⷢ����Ӧ�ÿ����׳����õ�����֪��������
			����ϵ���ص������Throwable�������е����඼���п����ԡ�
				  
		3 �����Ե���ָ����ʲô�أ���ô���ֿ������أ�
			��ʵ��ͨ�������ؼ��������ֵġ�
			throws and throw ,���ǿ��Ա��������ؼ�������������Ͷ��󶼾߱�������.
				  			  
		4 ����ϵ���ص㣺
			����ĺ�׺���������丸������Ϊ��׺���Ķ��Ժ��롣
			
ExceptionDemo2.java
	3 ����ԭ�� ( running principle )eg:ExceptionDemo2.java
		1 As the information said, the exception will be thrower level by level. 
		  Until to the main and to JVM, if no one resolve it.
		  
			Exception in thread "main" java.lang.NullPointerException
			at itcastday11.Demo2.method(ExceptionDemo2.java:15)
			at itcastday11.ExceptionDemo2.main(ExceptionDemo2.java:39)
		2 the sentences under the exception will not be executed.
			eg: System.out.println("over"); 
		3 When I know how the exception work by default, I can initialise my own exceptions.
			eg: throw new NullPointerException("��������ò���Ϊ�գ�");
			
ExceptionDemo3.java
	�쳣����trycatch.bmp
		4 �Զ����쳣
		�����һ�����Ϊ�쳣�࣬����Ҫ�̳��쳣��ϵ����Ϊֻ�г�Ϊ�쳣��ϵ����������ʸ�߱������ԡ�
		�ſ��Ա������ؼ�����������throws throw
		1 �����Լ����쳣��extends exception
		2 �ڵ����Զ����쳣�ĵط���throws:˭���ã�˭����throws
			eg1: public int method(int[] arr, int index) throws FuShuIndexException// throws
			eg2: public static void main(String[] args) throws FuShuIndexException 
	
	5 �쳣�ķ��ࣺ�Զ����쳣ʱ��Ҫô�̳�Exception��Ҫô�̳�RuntimeException��
		1������ʱ������쳣:ֻҪ��Exception�������඼�ǣ�������������RuntimeException��ϵ�� 
				��������һ�����֣�ϣ���ڱ���ʱ�ͽ��м�⣬�����������ж�Ӧ�Ĵ���ʽ��
				���������ⶼ��������ԵĴ���
		2������ʱ������쳣(����ʱ�쳣):����Exception�е�RuntimeException�������ࡣ
				��������ķ������޷��ù��ܼ����������޷����У���������Ϊ�����ߵ�ԭ���µĶ������������ڲ�״̬�ĸı䵼�µġ�
				��ô��������һ�㲻����ֱ�ӱ���ͨ����������ʱ���õ����ߵ���ʱ�ĳ���ǿ��ֹͣ,�õ����߶Դ������������
		3 throws ��throw������
			1��throwsʹ���ں����ϡ�
			   throwʹ���ں����ڡ�
			2��throws�׳������쳣�࣬�����׳�������ö��Ÿ�����
			   throw�׳������쳣����
			   
ExceptionDemo4.java
	6 �쳣����Ĳ�׽��ʽ�� ���Զ��쳣��������Դ���ķ�ʽ��
		1 ��ʽ	��
			try
			{
				//��Ҫ������쳣�Ĵ��롣
			}
			catch(�쳣�� ����)//�ñ������ڽ��շ������쳣����
			{
				//�����쳣�Ĵ��롣
			}
			finally
			{
				//һ���ᱻִ�еĴ��롣
			}
		2 ��catch�����ʹ�õĺ����׼����쳣�����ü���catch���ܡ�
			eg:catch(Exception e)//��catch�����catch���������档 {
	
	7 �쳣�����ԭ��
		1��������������׳���Ҫ�����쳣����ô�����ϱ���Ҫ������
			��������ں�������trycatch��׽���������ʧ�ܡ�
			
		2��������õ��������쳣�ĺ�����ҪôtrycatchҪôthrows���������ʧ�ܡ�
		
		3��ʲôʱ��catch��ʲôʱ��throws �أ�
			�������ݿ��Խ������catch��
			������ˣ���throws���ߵ����ߣ��ɵ����߽�� ��
		
		4��һ����������׳��˶���쳣����ô����ʱ�������ж�Ӧ���catch��������ԵĴ���
			�ڲ��ּ�����Ҫ�����쳣�����׼����쳣���׳���������catch������
		
ExceptionDemo5.java
	8 Finally ��ʹ�� eg:ExceptionDemo5.java
		1 // return ; 					-- finally ִ��
		  // System.exit(0);//�˳�jvm��   -- finally ��ִ��
		2 Ӧ��
			�������ݿ� ��ѯ��Exception �ر����ӡ�
		3 try catch finally ���������ص㣺
			* 1��try catch finally
			* 2, try catch(���)��û�б�Ҫ��Դ��Ҫ�ͷ�ʱ�����Բ��ö���finally��
		    * 3, try finally �쳣�޷�ֱ��catch����������Դ��Ҫ�رա�
			 	void show()throws Exception {  // û��catch����throws
			 		try { 
			 			//������Դ�� throw new Exception(); 
			 		} finally { 
			 			//�ر���Դ�� 
			 		}	 
ExceptionTest.java
	9 �쳣��ת������װ��
	//��ð���쳣�����Եģ�ת��Ϊ �γ��޷���ɣ���˾�ģ�
	catch (MaoYanException e)
		{
			System.out.println(e.toString());
			test();
			//���ԶԵ��Խ���ά�ޡ�
			throw new NoPlanException("��ʱ�����޷���ɣ�ԭ��"+e.getMessage());
		}
			 		
ExceptionDemo6.java
	10 �쳣��ע�����
		1�������ڸ��Ǹ��෽��ʱ������ķ�������׳����쳣��
		��ô����ķ���ֻ���׳�������쳣���߸��쳣�����ࡣ
		
		2����������׳�����쳣����ô����ֻ���׳������쳣���Ӽ���
		
		
		
		��˵�����า�Ǹ���ֻ���׳�������쳣������������Ӽ��� 
		
		ע�⣺�������ķ���û���׳��쳣����ô���า��ʱ���Բ����ף���ֻ��try .


InnerClassTest.java

 */
/**
 * @author zhanghongwei
 *
 */
package day11;