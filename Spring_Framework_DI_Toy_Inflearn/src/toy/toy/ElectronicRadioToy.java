package toy.toy;

import toy.battery.Battery;

public class ElectronicRadioToy {

	private Battery battery;
	
	public ElectronicRadioToy(Battery battery) {
		this.battery = battery; //�����ڿ��� �̸� ���͸��� �־���� ���� �� �Է¹���
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	//����ڰ� ���� �� set�� �̿��� ���͸� ����
	//�����ڿ� set�� �̿��� ��������
	//car, robot ���� �������� ���� ���α׷�
}
