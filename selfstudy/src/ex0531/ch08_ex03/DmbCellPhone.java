package ex0531.ch08_ex03;
// 0531완

// cellphone 클래스 상속
public class DmbCellPhone extends CellPhone {
//	필드
	int channel;

//  생성자
	DmbCellPhone(String model, String color, int channel) {
//		super 변수 재정의 가능
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
//	메서드
	void turnOnDmb() {
		System.out.println("채널 10번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 "+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
