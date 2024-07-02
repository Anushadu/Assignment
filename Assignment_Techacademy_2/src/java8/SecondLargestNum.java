package java8;

public class SecondLargestNum {
	
	public static void main(String[]args){
		int[]numbers ={50,40,58,97,41,18};
		if(numbers.length<2){
		System.out.println("Arrayshouldhaveatleast two elements");
		return;
		}
		 
		int firstMax= Integer.MIN_VALUE;
		int secondMax =Integer.MIN_VALUE;
		for(int num:numbers){
		if (num >firstMax) { secondMax=firstMax; firstMax = num;
		}else if(num>secondMax&&num!=firstMax){ secondMax = num;
		}
		}
		if (secondMax == Integer.MIN_VALUE) { System.out.println("There is no second largest element");
		}else {
		System.out.println("Second largest number:"+ secondMax);
		}
		}


}
