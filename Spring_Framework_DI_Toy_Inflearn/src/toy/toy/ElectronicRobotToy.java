package toy.toy;

import toy.battery.Battery;

public class ElectronicRobotToy {

	private Battery battery;
	
	public ElectronicRobotToy() {
		//생성자에 아무것도 없음
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	//set을 이용한 배터리 주입, set을 이용한 의존 주입
	
}
