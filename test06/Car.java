package test06;

public class Car extends Vehicle {
	private String type;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public double getSumRent(int days) {
		if(type.equals("����")) {
			return days*300;
		}
		if(type.equals("����")) {
			return days*350;
		}
		if(type.equals("ԽҰ")) {
			return days*500;
		}
		return 0.0;
	}
	
	
}
