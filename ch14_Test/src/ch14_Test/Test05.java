package ch14_Test;

class Super { 
    int index = 5; 
    public void printVal() {
        System.out.println("Super");
    } 
} 
class Sub extends Super {   
    int index = 2;   
    public void printVal() {   
        System.out.println("Sub"); 
    } 
} 
// 다음 프로그램의 실행결과를 작성하시오
public class Test05 {

	public static void main(String[] args) {
		
        Super sup = new Sub();   
        System.out.print(sup.index + " ");   
        sup.printVal(); 
        
        Sub  sub = new Sub();  
        System.out.print(sub.index + " ");   
        sub.printVal(); 
        
	}

}
