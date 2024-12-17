package onechapter;

public class PhraseOMatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//세종류의 단어 목록을 생성
		String[] wordListOne = {"agnostic", "opinionated",
				"voice activated", "haptically driven", "extensible",
				"reactive", "agent based", "functional", "AI enabled",
				"strongly typed"};

		String[] wordListTwo = {"loosely coupled", "six sigma",
				"asynchronous", "event driven", "pub-sub", "IoT", "cloud native", 
				"service oriented", "containerized", "serverless",
				"microservices", "distributed ledger"};

		String[] wordListThree = {"framework", "library", "DSL",
				"REST API", "repository", "pipeline", "service mesh",
				"architecture", "perspective", "design", "orientation"};

		//각 단어 목록에 몇개가 들어있는지 세는 코드
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//난수 세개 발생
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(twoLength);
		int rand3 = randomGenerator.nextInt(threeLength);
		
		//이제 구문을 만든다
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		//출력
		System.out.println("What we need is a "+phrase);

	}

}
