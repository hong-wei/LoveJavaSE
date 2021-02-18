package reviewreflection;
//https://mp.weixin.qq.com/s?__biz=MzI1NDU0MTE1NA==&mid=2247483785&idx=1&sn=f696c8c49cb7ecce9818247683482a1c&chksm=e9c2ed84deb564925172b2dd78d307d4dc345fa313d3e44f01e84fa22ac5561b37aec5cbd5b4&scene=0#rd
//����(Reflection) �� Java ������ʱ��Run time�����Է��ʡ������޸�������״̬����Ϊ��һ�������������������е� Java �����ȡ�������Ϣ��
// ���ҿ��Բ�����������ڲ����ԡ�
//
//Class ����ܣ�Java�����Ϊÿ�����͹���һ��Class���󣬰����������йص���Ϣ����ͨ�� javac ����Java���ļ�ʱ�����ɵ�ͬ�� .class �ļ�����
// �Ÿ���� Class ����JVM ����һ���༴�Ǽ��ظ� .class �ļ���
//
//Class �� java.lang.reflect һ��Է����ṩ��֧�֣�java.lang.reflect ������õļ�����Ĺ�ϵ���£�
//src/main/java/reviewreflection/Reflect.jpg


import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Person {
    public String name;     // ���� ����
    protected String age;   // ���� ����
    private String hobby;   // ����   ˽��

    public Person(String name, String age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    public String getHobby() {
        return hobby;
    }
}

class Employee extends Person {
    public static Integer totalNum = 0; // Ա����
    public int empNo;   // Ա����� ����
    protected String position;  // ְλ ����
    private int salary; // ����   ˽��

    public void sayHello() {
        System.out.println(String.format("Hello, ���� %s, ���� %s ��, ������%s, ��Ŀǰ�Ĺ�����%s, ����%sԪ\n", name, age, getHobby(), position, salary));
    }
    private void work() {
        System.out.println(String.format("My name is %s, ����������.", name));
    }
    public Employee(String name, String age, String hobby, int empNo, String position, int salary) {
        super(name, age, hobby);
        this.empNo = empNo;
        this.position = position;
        this.salary = salary;
        Employee.totalNum++;
    }
}

class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("reviewreflection.Employee");   // ��1�֣�forName ��ʽ��ȡClass����
        Class c2 = Employee.class;                               // ��2�֣�ֱ��ͨ�����ȡClass����
        Employee employee = new Employee("С��", "18", "д����", 1, "Java����ʨ", 100000);
        Class c3 = employee.getClass();                          // ��3�֣�ͨ�����ö����getClass()������ȡClass����

        if (c1 == c2 && c1 == c3) {     // ����ͨ�� == �Ƚ�Class�����Ƿ�Ϊͬһ������
            System.out.println("c1��c2��c3 Ϊͬһ������");
            System.out.println(c1);     // class reflect.Employee
        }


        //ͨ������������ʵ��:2�ַ�ʽ.
        Class c = Date.class;
        Date date1 = (Date) c.newInstance();    // ��1�ַ�ʽ��ʹ��Class�����newInstance()����������Class�����Ӧ���ʵ��
        System.out.println(date1.getTime());              // Wed Dec 19 22:57:16 CST 2018

//        long timestamp =date1.getTime();
        //Constructor is from the java.lang.reflect package.
        java.lang.reflect.Constructor constructor = c.getConstructor(long.class); //you can have the arguments or not.
        Date date2 = (Date)constructor.newInstance(1);  // ��2�ַ�ʽ����ͨ��Class�����ȡָ����Constructor�����ٵ���Constructor�����newInstance()����������ʵ��
        
        Date date3 =  new Date(1); //���Ǳ�׼�Ĺ��캯��, 
        System.out.println(date2.getTime());                              // Wed Dec 19 22:57:16 CST 2018
        System.out.println(date3.getTime());                              // Wed Dec 19 22:57:16 CST 2018
        
        
        
        
        //��ȡ���ȫ����Ϣ
//        �������Ƕ����������࣬�����и����󣺻�ȡEmployee��������������ǩ�������еķ��������е������ԣ���ֵ��Ȼ���ӡ��������ͨ��ʲô��ʽ��ʵ���أ�

        //--> ֪��JVM�����Ϊÿ�����͹���һ��Class����
         System.out.println(c1.getName());
         System.out.println(c1.getConstructors());
         System.out.println(c1.getDeclaredConstructors());
         System.out.println(c1.getMethods());
         System.out.println(c1.getFields());
         System.out.println(c1.getModifiers()); //����һ����������Field��Method��Constructor�����η���������ֵ������ֵ����ĺ����ͨ��Modifier��������
//        Modifier �� ���ṩ���й�Field��Method��Constructor�ȵķ������η�����Ϣ����Ҫ�ķ����У�toString(int modifiers)����������
//        ֵmodifiers��������η����ַ�����isAbstract�Ƿ�abstract���Σ�isVolatile�Ƿ�volatile���Σ�isPrivate�Ƿ�Ϊprivate��
//        isProtected�Ƿ�Ϊprotected��isPublic�Ƿ�Ϊpublic��isStatic�Ƿ�Ϊstatic���Σ��ȵȣ�����֪��
         System.out.println(c1.getCanonicalName());
    }
}

//��ӡ����Ϣ����
public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("����һ��������e.g. java.util.Date����"); // reflect.Employee
            name = in.next();
        }
        try {
            Class cl = Class.forName(name);
            Class superCl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + name);
            if (superCl != null && superCl != Object.class) {
                System.out.print(" extends " + superCl.getName());
            }
            System.out.println("\n{");

            printConstructors(cl); // ��ӡ���췽��
            System.out.println();
            printMethods(cl);   // ��ӡ����
            System.out.println();
            printFields(cl);    // ��ӡ����
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * ��ӡClass��������й��췽��
     */
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors) {
            // ��ӡ���캯��������:
            String name = c.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            // ��ӡ�������:
            Class[] paramTypes = c.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * ��ӡClass�����з���
     */
    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        //Method[] methods = cl.getMethods();
        for (Method m : methods) {
            Class retType = m.getReturnType();  // ��������
            System.out.print("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + m.getName() + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * ��ӡClass����������
     */
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field f: fields) {
            Class type = f.getType();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length()> 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + f.getName() + ";");
        }
    }
}

class ObjectAnalyzer {
    private ArrayList<Object> visited = new ArrayList<>();

    public String toString(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (visited.contains(obj)) {    // ����ö����Ѿ�����������ٴ���
            return "...";
        }
        visited.add(obj);

        Class cl = obj.getClass(); // ��ȡClass����
        if (cl == String.class) {   // �����String������ֱ��תΪString
            return (String) obj;
        }
        if (cl.isArray()) {        // ���������
            String r = cl.getComponentType() + "[]{\n";     // �����Ԫ�ص�����
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) {   // ��������ĵ�һ��Ԫ�ؼӶ��źͻ��У���ʾ��������
                    r += ",\n";
                }
                r += "\t";
                Object val = Array.get(obj, i);
                if (cl.getComponentType().isPrimitive()) { // ClassΪ8�ֻ������͵�ʱ��Ϊ true��ֱ�����
                    r += val;
                } else {
                    r += toString(val); // ����8�л�������ʱ��˵�����࣬�ݹ����toString
                }
            }
            return r + "\n}";
        }
        // �Ȳ���String��Ҳ��������ʱ������ö�������ͺ�����ֵ
        String r = cl.getName();
        do {
            r += "[";
            Field[] fields = cl.getDeclaredFields();    // ��ȡ�����Լ�����������򣬰���˽�еģ������������
            AccessibleObject.setAccessible(fields, true); // ����˽�е����ԣ���Ҫ��������ã�����ᱨ�Ƿ������쳣
            for (Field field : fields) {
                if (!Modifier.isStatic(field.getModifiers())) { // ͨ�� Modifier �ɻ�ȡ��������η��������ж��Ƿ�Ϊ static
                    if (!r.endsWith("[")) {
                        r += ",";
                    }
                    r += field.getName() + "=";     // ������
                    try {
                        Class t = field.getType();     // �����ԣ�������
                        Object val = field.get(obj);   // ��ȡobj�����ϸ����ʵ��ֵ
                        if (t.isPrimitive()) {         // �������Ϊ8�ֻ������ͣ���ֱ�����
                            r += val;
                        } else {
                            r += toString(val);        // ����8�ֻ������ͣ��ݹ����toString
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            r += "]";
            cl = cl.getSuperclass(); // ������ӡ���������Ϣ, ����һ��do ��ѭ��, ֻҪcl��Ϊnull,��һֱѭ��.
        } while (cl != null);
        return r;
    }
}

class ObjectAnalyzerTest {
    public static void main(String[] args) {
        int size = 4;
        ArrayList<Integer> squares = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            squares.add(i * i);
        }
        ObjectAnalyzer objectAnalyzer = new ObjectAnalyzer(); // ����һ�����涨��ķ�����ObjectAnalyzer�Ķ���
        System.out.println(objectAnalyzer.toString(squares)); // ����ArrayList<Integer>�����ʵ��ֵ

        Employee employee = new Employee("С��", "18", "����д����", 1, "Java����ʨ", 100); // �����Զ�����Employee�Ķ����ʵ��ֵ
        System.out.println(objectAnalyzer.toString(employee));
    }
}

//�������ⷽ��
class MethodTableTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Employee employee = new Employee("С��", "18", "д����", 1, "Java����ʨ", 100000);
        Method sayHello = employee.getClass().getMethod("sayHello");
        System.out.println(sayHello);   // ��ӡ sayHello �ķ�����Ϣ
        sayHello.invoke(employee);      // �� employee ִ�� sayHello ����

        double x = 3.0;
        Method square = MethodTableTest.class.getMethod("square", double.class);  // ��ȡ MethodTableTest ��square����
        double y1 = (double) square.invoke(null, x);    // �����෽�� square ��ƽ������������ x 
        System.out.printf("square    %-10.4f -> %10.4f%n", x, y1);

        Method sqrt = Math.class.getMethod("sqrt", double.class);   // ��ȡ Math �� sqrt ����
        double y2 = (double) sqrt.invoke(null, x);  // �����෽�� sqrt ������������� x 
        System.out.printf("sqrt      %-10.4f -> %10.4f%n", x, y2);
    }

    // static��̬���� ����˷�
    public static double square(double x) {
        return x * x;
    }
}