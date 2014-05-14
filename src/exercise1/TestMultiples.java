package exercise1;

public class TestMultiples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiplo = 5;
		int somaMultiplos = 0;
		int minRange = 0;
		int maxRange = 25;
		
		somaMultiplos = new MathGenerals().sumMultiples(5, minRange, maxRange);

		System.out.println("Soma dos Multiplos de " +multiplo+ " no intervalo de " +minRange+ " até " +maxRange+ " é: "  + somaMultiplos);
	}

}
