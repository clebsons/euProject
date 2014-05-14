package exercise1;

public class SumMultiples3and5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start_time= System.currentTimeMillis(); 
		int minRange = 0;
		int maxRange = 1000;

		int somaMultiplos3 = new MathGenerals().sumMultiples(3, minRange, maxRange);
		int somaMultiplos5 = new MathGenerals().sumMultiples(5, minRange, maxRange);
		int somaMultiplos15 = new MathGenerals().sumMultiples(15,minRange,maxRange);
		int somaMultiplos  = somaMultiplos3 + somaMultiplos5 - somaMultiplos15;

		System.out.println("Soma dos Multiplos de 3 e 5 no intervalo de " +minRange+ " até " +maxRange+ " é: "  + somaMultiplos);
		System.out.println("Total time taken:"+ ((System.currentTimeMillis()-start_time))+" millis");
	}

}
