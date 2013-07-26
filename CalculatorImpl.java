package calculatrice;

public class CalculatorImpl implements Calculator {

	@Override
	public int Additionner(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Soustraire(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Multiplier(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Diviser(int a, int b) {
		// TODO Auto-generated method stub
		if (b == 0) {
			throw new ArithmeticException();
		}
		boolean resEstNegatif = false;
		int res = 0;
		if ( a < 0) {
		resEstNegatif = !resEstNegatif;
		a = -a;
		}
		
		if ( b < 0) {
			resEstNegatif = !resEstNegatif;
			b = -b;
		}
		
		while (a > 0) {
			a = Soustraire(a, b);
			res++;
		}
		if (resEstNegatif) {
			res = -res;
			}
		
		return res ;
	}

}
