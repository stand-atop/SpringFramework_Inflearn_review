package toy.toy;

import toy.battery.Battery;
import toy.battery.NormalBattery;

public class ElectronicCarToy {
	
	private Battery battery;
	
	public ElectronicCarToy() {
		battery = new NormalBattery();
		//생성자에서 배터리 주입 : 배터리 방전 시 CarToy 자체를 새로 구입해야함
		//즉 생성자를 이용한 의존 주입
	}
	
}
