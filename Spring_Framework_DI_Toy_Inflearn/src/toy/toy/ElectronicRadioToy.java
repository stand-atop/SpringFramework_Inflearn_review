package toy.toy;

import toy.battery.Battery;

public class ElectronicRadioToy {

	private Battery battery;
	
	public ElectronicRadioToy(Battery battery) {
		this.battery = battery; //생성자에서 미리 배터리를 넣어놓고 따로 또 입력받음
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	//사용자가 원할 때 set을 이용해 배터리 주입
	//생성자와 set을 이용한 의존주입
	//car, robot 보다 유연성이 강한 프로그램
}
