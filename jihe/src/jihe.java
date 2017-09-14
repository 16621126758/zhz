import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class jihe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("asd");
		list.add("asd");
		list.add("asd");
		list.add("asd");
		//传统的for循环遍历，基于计数器的：
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
			}
		//迭代器遍历，Iterator
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
		    System.out.println(it.next());
		}
		 for(Iterator<String> it2 = list.iterator();it2.hasNext();){
	            System.out.println(it2.next());
	        }
		//foreach循环遍历
		for(String s :list){
			System.out.println(s);
		}
	}

}
