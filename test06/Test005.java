package test06;

public class Test005 {

	public static void main(String[] args) {
		Car c=new Car();
		c.setBrand("宝马");
		c.setNum("京A 88888");
		c.setType("三厢");
		System.out.println("品牌："+c.getBrand()+",车牌号："+c.getNum()+",10天总租金："+c.getSumRent(10));
		
		Bus b=new Bus();
		b.setBrand("宝马");
		b.setNum("京A 88888");
		b.setSeat(60);
		System.out.println("品牌："+b.getBrand()+",车牌号："+b.getNum()+",10天总租金："+b.getSumRent(10));
	}

}
