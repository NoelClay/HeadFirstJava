package onechapter;

public class PoolPuzzleOne {

	public static void main(String[] args) {
		int x = 0;
		
		while(x<4) { //크게 돌려면 x<4 밖에 없음
			System.out.print("a"); //첫 시작에 선택권이 없음
			if(x<1) {
				System.out.print(" "); //1번째 0일때만 실행되는 공백
			}
			System.out.print("n"); //다음은 n
			if(x>1) {
				System.out.print(" oyster"); //3번째 2일때만 실행되는 띄어쓰기 포함된 oyster
				x=x+2; //반복문 탈출
			}
			if(x==1) {
				System.out.print("noys"); //2번째 1일때만 실행되는 noys느 띄어쓰기가 없음
			}
			if(x<1) {//1번째 0일때만 실행되도록 조건문
				System.out.print("oise ");//1번째 0일때만 oise를
			}
			System.out.println();
			x=x+1;
		}
	}
}

/*

 System.out.print(" "); //
 System.out.print("a"); //
 System.out.print("n");
 System.out.print("an"); //
 
 x>0
 x<1
 x>1
 x>3 
 x<4//
 
 x=x+1; //
 x=x+2; 
 x=x-2; 
 x=x-1;//
 
 System.out.print("noys ");
 System.out.print("oise ");
 System.out.print(" oyster ");
 System.out.print("annoys");
 System.out.print("noise"); //
 
 */