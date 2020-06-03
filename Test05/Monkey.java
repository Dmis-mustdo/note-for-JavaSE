package Test05;

public class Monkey {
	private String name;
	private boolean sex;
	public void speak() {
		System.out.println("咿咿呀呀！");
	}
	
	
	//如果把无参构造省略，则Human无法继承有参构造方法，报错如下：
//	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		Implicit super constructor Monkey() is undefined for default constructor. Must define an explicit constructor
	public Monkey(String name, boolean sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public Monkey() {
		this("Anne",true);
	}//这样的无参也可以
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
}
