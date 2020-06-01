package Test02;

public class Customer1 {
	String name;
	public static void shopping() {
		Customer a1=new Customer1();
		a1.name="张三";
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		shopping();
	}
}
//不能用this,因为无法在静态方法中引用非静态变量
/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Cannot use this in a static context

	at Test02.Customer.shopping(Customer.java:8)
	at Test02.Customer.main(Customer.java:11)
*/