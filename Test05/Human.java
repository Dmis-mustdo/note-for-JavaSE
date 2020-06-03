package Test05;

public class Human extends Monkey {

	@Override
	public void speak() {
		System.out.println(this.getName()+"哟！小伙会说话了！");
	}
	
}
