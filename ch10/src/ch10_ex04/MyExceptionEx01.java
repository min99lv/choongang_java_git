package ch10_ex04;

public class MyExceptionEx01 {

	public static void main(String[] args) {
		int kkk = 15;
		
		try {
//	비즈니스 룰 가정
			if (kkk > 10) throw new MyException();
		} catch (Exception e) {
//												아니 10보다 크다니
			System.out.println(e.getMessage());
		}

	}

}
