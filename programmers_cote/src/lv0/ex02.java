package lv0;

public class ex02 {
	
	public static void main(String[] args) {
		Solution1 sl = new Solution1();
		System.err.println(sl.solution(3,2));
	}

}

class Solution1 {
    public int solution(int num1, int num2) {
        int answer = 0;
        double n1 = (double)num1 / num2 ;
        System.out.println(n1);
        double n2 = n1 * 1000;
        answer = (int)n2;
        return answer;
    }
}
