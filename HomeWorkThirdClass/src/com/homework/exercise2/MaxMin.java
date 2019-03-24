package com.homework.exercise2;

public class MaxMin {

	//	public int getMinimum(int value1,int value2){
	//		int min = 0;
	//		if(value1!=value2 && value1>=0 &&value2>=0){
	//		if(value1<value2)
	//			//min = value1;
	//			return value1;
	//		else 
	//			//min = value2;
	//			return value2;
	//		}
	//		else 
	//			return -1;
	//	}


	public Integer getMinimum(Integer value1,Integer value2){
		int min = 0;

		min =  value1.compareTo(value2);

		if(min!=0&&value1!=0 && value2!=0){
			if(min == -1){
				return value1;
			}
			else if (min ==1){
				return value2;
			}
		}
		
		else if (min==0 && value1!=0 && value2!=0){
			return 0;
		}
		
		else if (min==0 && value1 ==0 && value2 == 0){
			return 0;
		}
		return null;


	}


	public static void main(String[] args) {

		MaxMin maxmin = new MaxMin();
		int result = maxmin.getMinimum(12, 12);
		if(result!=0){
			System.out.println(result);
		}
		else{
			System.out.println();
		}
	}

}
