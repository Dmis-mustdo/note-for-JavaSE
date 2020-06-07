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
		if(type.equals("¡Ωœ·")) {
			return days*300;
		}
		if(type.equals("»˝œ·")) {
			return days*350;
		}
		if(type.equals("‘Ω“∞")) {
			return days*500;
		}
		return 0.0;
	}
	
	
}
