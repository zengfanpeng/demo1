public  class GirlfriendTest{
	public static void main(String[] args){  //主方法入口
		Girlfriend f1=new Girlfriend();        //在堆中创建一个新的对象
    //给实例变量（对象变量赋值）
		f1.age=18;  
		f1.height=170;
		f1.sex='女';
    //测试输出一下
		System.out.println(f1.age);
		System.out.println(f1.sex);
		System.out.println(f1.height);	
    //调用love方法
		System.out.println(love(520));
	}
  //编写一个简单的方法
	public static int love(int n){
		return n;//有返回值
	}
}
//定义Girlfriend类
   class Girlfriend{
   //定义成员变量（实例变量）
	String name;
	int age;
	int height;
	int hipline;
	char sex;
}
