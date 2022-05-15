package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int count =8 ,firstNum = 0,secNum =1, sum;
		System.out.println("FibonacciSeries");
		System.out.println(firstNum);
		for (int i=1;i<count;i++)
		{					
			sum = firstNum +secNum ;
			firstNum =secNum;
			 secNum=sum;
			 
			 System.out.println(firstNum);
	}
}
}

