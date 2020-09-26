public class Homework11{
	public static void main(String[] args){
		//创建一个账户类对象并赋值
		Account a=new Account("1000",1000,1.23);
		//创建一个用户类对象c并且他拥有的账户类产生关系
		Customer c=new Customer("小明",a);
		c.getAct().withdraw(520);
		c.getAct().deposit(1000);
		c.getAct().deposit(5200);
	}
}
	//创建一个用户类
	class Customer{
		//用户名
		private String name;
		//用户拥有的账户类
		private Account act;
		//构造无参方法
		public Customer(){
			
			}
			//构造有参方法
		public Customer(String name,Account act){
			this.name=name;
			this.act=act;
		}
		//setter，getter方法
		public void setName(String name){
			this.name=name;
		}
		public String getName(){
			return name;
		}
		public void setAct(Account act){
			this.act=act;
		}
		public Account getAct(){
			return act;
		}
	}
	//创建一个账户类
	class Account{
		//账户id
		private String id;
		//余额
		private double balance;
		//年利率
		private double annuaInterestRate;
		//无参构造方法
		public Account(){
			
		}
		//有参构造方法
		public Account(String id,double balance,double annuaInterestRate){
			this.id=id;
			this.balance=balance;
			this.annuaInterestRate=annuaInterestRate;
		}
		//各属性setter，getter方法
		public void setId(String id){
			this.id=id;
		}
		public String getId(){
			return id;
		}
		public void setBalance(double balance){
			this.balance=balance;
		}
		public double getBalance(){
			return balance;
		}
		public void setAnnuaInterestRate(double annuaInterestRate){
			this.annuaInterestRate=annuaInterestRate;
		}
		public double getAnnuaInterestRate(){
			return annuaInterestRate;
		}
		//定义一个存款的方法
		public void withdraw(double money){
			//banlance+=money;
			this.setBalance(this.getBalance()+money);
			System.out.println("成功存入"+money);
		}
		//定义一个取款的方法
		public void deposit(double money){
			if(money>balance){
				System.out.println("取款失败；余额不足！");
			}
			else{this.setBalance(this.getBalance()-money);
			System.out.println("成功取出"+money);
		}
		}
	}
