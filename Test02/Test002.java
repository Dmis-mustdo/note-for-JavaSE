package Test02;

public class Test002 {

	public static void main(String[] args) {
		class Customer2{
			String name;
			public void shopping() {
				System.out.println(this.name);
			}
		}
		Customer2 a2=new Customer2();
		a2.name="zhangsan";
		a2.shopping();
		
	}

}
