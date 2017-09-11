/**
 * Created by Administrator on 2017/8/23.
 */
//public class Single
//{
//        private static Single s = null;
//        private Single(){}
//        
//        public static Single getInstance()
//        {
//                if(s==null)
//                {       
//                        synchronized (Single.class)
//                        {
//                                if (s==null)
//                                        s = new Single();
//                        }
//                }
//                return s;
//        }
//}
//懒汉式和饿汉式有什么不同？
//懒汉式特点：实例的延迟加载 但是有问题，多线程访问出现安全问题，解决，同步代码块或者同步函数，但是效率低，用双重判断解决侠侣
//加的锁是本类所属的字节码文件对象
//饿汉式
class Single{
        private static final Single s = new Single();
        private Single(){}
        public static Single getInstance()
        {
                return s;
        }
}