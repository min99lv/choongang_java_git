package lv0;

public class ex01 {
	public static void main(String[] args) {
	Solution sl = new Solution();
	System.out.println(sl.solution(10));
	}

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=0; i<= n; i++) {
        if (i % 2 == 0) {
        	answer += i;
        	}
        }
        return answer;
    }
}

//
//int answer = n;
//int result = 0;
//for(int i=0; i<=answer;i++){
//    if(i%2==0) result+=i;
//}
//return result;