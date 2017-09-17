
public class string {
	public static void main(String[] args) {
//	    String s1 = "abc";
//	    String s2 = new String("abc");
//	    String s3 = "abc";
//	    sop(s1==s2);
//	    sop(s1==s3);
		String str = "abcdeakpf";
		sop(str.length());
		sop(str.charAt(4));
		//如果没有找到返回-1
		//从第3个位置开始算起第一次出现a的位置
		sop(str.indexOf("a", 3));
		//反向索引
		sop(str.lastIndexOf("a"));
		method_is();
		method_trans();
		String a = "wqersdfwertg";
		char [] chs = a.toCharArray();
		for(int x = 0;x<chs.length;x++){
			sop("chs="+chs[x]);
		}
		method_t();
		
	}
	public static void sop(Object object){
		System.out.println(object);
	}
	public static void method_is(){
		String str = "ArrayDemo.java";
		sop(str.isEmpty());
		sop(str.contains("Demo"));
		sop(str.endsWith(".java"));
		sop(str.startsWith("Array"));
		}
	public static void method_trans(){
		char[] arr = {'a','v','c','d','e','f'};
		String s = new String(arr,1,2);
		sop("s="+s);
	}
	public static void method_t(){
		String a = "   Hello worle   ";
		sop(a.toLowerCase());
		sop(a.toUpperCase());
		sop(a.trim());
	}
		

}
