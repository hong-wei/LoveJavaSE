/**
 * 
StringBuilderTest.java
��ʽ�����ı仯
stringbuilder��ϰ.bmp
string�ڴ�ͼ.bmp
-------------------------------------------8�ֻ������ݰ�װ��--------------------------------------
WrapperDemo.java
	1 �����������Ͷ����װ��--���������ö������ͳ�Ϊ�����������Ͷ����װ�ࡣ
		Ϊ�˷������������������ֵ�������װ���˶����ڶ����ж��������Ժ���Ϊ�ḻ�˸����ݵĲ�����
		Integer --  Contructor -- 2
		 	    --  Methods    -- 34
			byte		Byte
			short	   	Short
			int			Integer
			long		Long
			float		Float
			double		Double
			char		Character
			boolean		Boolean
	2 �ð�װ������Ҫ�û������ͺ��ַ���֮���ת����
		��������--->�ַ��� --2
			1,����������ֵ+""
			2,��String���еľ�̬����valueOf(����������ֵ);
		�ַ���--->�������� --2
			1,��̬���� 
				��װ����  xxx parseXxx("xxx���͵��ַ���");*****
					int parseInt("111");
					long parseLong("111");
					boolean parseBoolean("true");
					ֻ��Characterû��parse���� 
			2,�Ǿ�̬�ķ��� 
				����ַ�����Integer���ж���ķ�װ��
				��ʹ����һ���Ǿ�̬�ķ�����intValue();
				��һ��Integer����ת�ɻ�����������ֵ��
	3 ������ͬ�Ľ������֡�
		ʮ��-->�������ơ�
			toBinaryString
			toOctalString
			toHexString
		������-->ʮ���ơ�
			parseInt("string",radix) 
	4 ��װ��ļ���ͱȽ�
WrapperDemo2.java
	5 �Զ�����װ��
		jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ䡣
WrapperTest.java
-------------------------------------------����API--------------------------------------
���Ͽ��_1.txt
	1 �������������
		�������ڷ�װ�������ݣ����������Ҫ�洢���������ĸ�����ȷ������ʹ�ü����������д洢��
	2 �����ص㣺
		1�����ڴ洢�����������
		2�����ϵĳ����ǿɱ�ġ�
		3�������в����Դ洢������������ֵ��
		tips:����ͼ�����ͬ���������кβ�ͬ��
			������ȻҲ���Դ洢���󣬵������ǹ̶��ģ�
			���ϳ����ǿɱ�ġ�
			�����п��Դ洢�����������ͣ�����ֻ�ܴ洢���� 
		
���Ͽ��.bmp
	3 ���Ͽ��:����������Ϊ�ڲ������ݽṹ��ͬ���ж��־������������ϵ����ϳ�ȡ�����γ��˼��Ͽ�ܡ�
	��ܵĶ���Collection�ӿ�,����������
		1����ӡ�
			boolean add(Object obj):
			boolean addAll(Collection coll):
		2��ɾ����
			boolean remove(object obj):
			boolean removeAll(Collection coll);
			void clear();
		3���жϣ�
			boolean contains(object obj):
			boolean containsAll(Colllection coll);
			boolean isEmpty():�жϼ������Ƿ���Ԫ�ء� 
		4����ȡ��
			int size():
			Iterator iterator():ȡ��Ԫ�صķ�ʽ����������
			�ö�����������ھ�����������Ϊÿһ�����������ݽṹ����ͬ��
			���Ըõ������������������н����ڲ�ʵ�ֵġ�
			����ʹ�������߶��ԣ������ʵ�ֲ���Ҫ��ֻҪͨ��������ȡ����ʵ�ֵĵ������Ķ��󼴿ɣ�
			Ҳ����iterator������
			
			Iterator�ӿھ��Ƕ����е�Collection��������Ԫ��ȡ���Ĺ����ӿڡ�
			��ʵ����ץ������Ϸ���еļ��ӣ�
		5��������
			boolean retainAll(Collection coll);ȡ������
			Object[] toArray():������ת�����顣 
			
CollectionDemo.java
	practice all the basic methods.
IteratorDemo.java
	the iterator �� only 4 methods
	������ԭ�����Ͽ��.bmp
-------------------------------------------1List---------------------	
	Collection
		|--List������(�����ȡ����˳��һ��),Ԫ�ض�������(�Ǳ�)��Ԫ�ؿ����ظ���
		|--Set��Ԫ�ز����ظ�,����
ListDemo.java	
	List:���еĳ�����������һ�������ص���Ƕ����Բ����Ǳꡣ
		1�����
			void add(index,element);
			void add(index,collection);
		2��ɾ����
			Object remove(index):
		3���޸ģ�
			Object set(index,element);
		4����ȡ��
			Object get(index);
			int indexOf(object);
			int lastIndexOf(object);
			List subList(from,to);
	list�����ǿ�����ɶ�Ԫ�ص���ɾ�Ĳ顣
	
	List:
		|--Vector:�ڲ����������ݽṹ����ͬ���ġ���ɾ����ѯ��������
		|--ArrayList:�ڲ����������ݽṹ���ǲ�ͬ���ġ������Vector����ѯ���ٶȿ졣
		|--LinkedList:�ڲ����������ݽṹ���ǲ�ͬ���ġ���ɾԪ�ص��ٶȺܿ졣
		
	��ҵ��
	1���Լ�ȥ���ĵ���ʾVector�е�elements()������
	
	2��LinkedList�еģ�addFirst addLast getFirst��getLast  removeFirst removeLast��
		
	3����Ȼ�����Ǵ洢����ģ��붨��ArryaList���ϣ����洢Person������new Person("lisi",20);
	��ȡ�����������������ӡ������

ListDemo2.java
	listIterator �����ӹ��� 9 methods
		add(E e) ��hasPrevious() ��previous() ��	set(E e) 
Test16.txt
���Ͽ��.bmp
 */
/**
 * <h2>10 Most Sought-after Skills in Web Development</h2>
 * 
 * @author zhanghongwei
 *
 */
package itcastday16;