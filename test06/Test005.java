package test06;

public class Test005 {

	public static void main(String[] args) {
		Car c=new Car();
		c.setBrand("����");
		c.setNum("��A 88888");
		c.setType("����");
		System.out.println("Ʒ�ƣ�"+c.getBrand()+",���ƺţ�"+c.getNum()+",10�������"+c.getSumRent(10));
		
		Bus b=new Bus();
		b.setBrand("����");
		b.setNum("��A 88888");
		b.setSeat(60);
		System.out.println("Ʒ�ƣ�"+b.getBrand()+",���ƺţ�"+b.getNum()+",10�������"+b.getSumRent(10));
	}

}
