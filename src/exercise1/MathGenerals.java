package exercise1;

public class MathGenerals {
	
	public int sumMultiples (int multiple, int minRange, int maxRange){
		int sum = 0;
		int cycles = 0;
		cycles = minRange;
		while (cycles < maxRange){
			sum = cycles + sum;
			cycles = cycles + multiple;
		}
		return sum;
	}
}
