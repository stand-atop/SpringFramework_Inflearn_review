package toy.toy;

import toy.battery.Battery;
import toy.battery.NormalBattery;

public class ElectronicCarToy {
	
	private Battery battery;
	
	public ElectronicCarToy() {
		battery = new NormalBattery();
		//�����ڿ��� ���͸� ���� : ���͸� ���� �� CarToy ��ü�� ���� �����ؾ���
		//�� �����ڸ� �̿��� ���� ����
	}
	
}
