package test06;

public class Bus extends Vehicle {
	private int seat;

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	@Override
	public double getSumRent(int days) {
		if(seat<=16) {
			return 400*days;
		}else{
			return 600*days;
		}
	}
	
	
}
