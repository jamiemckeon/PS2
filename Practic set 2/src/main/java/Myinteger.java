
// Jamie McKeon Practice Set 2



public class Myinteger {
	private int value;

	private int getValue() {
		return value;
	}

	public Myinteger(int value) {
		this.value = value;

	}

	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return true;
		}
	}

	public boolean isOdd() {
		if (this.value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isPrime() {
		int placeholder = 0;
		for (int i = 2; i < this.value; i++) {
			double value2 = this.value;
			double primecheck1 = value2 / i;
			int primecheck2 = this.value / i;
			if (primecheck1 == primecheck2) {
				placeholder = 1;
				i = i + this.value;
			}
		}
		if (placeholder == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			return true;

		}
	}

	public static boolean isPrime(int value) {
		int placeholder = 0;
		for (int i = 2; i < value; i++) {
			double value2 = value;
			double primecheck1 = value2 / i;
			int primecheck2 = value / i;
			if (primecheck1 == primecheck2) {
				placeholder = 1;
				i = i + value;
			}
		}
		if (placeholder == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isPrime(Myinteger myInt) {
		int placeholder = 0;
		for (int i = 2; i < myInt.getValue(); i++) {
			double value2 = myInt.getValue();
			double primecheck1 = value2 / i;
			int primecheck2 = myInt.getValue() / i;
			if (primecheck1 == primecheck2) {
				placeholder = 1;
				i = i + myInt.getValue();
			}
		}
		if (placeholder == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isOdd(Myinteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return false;
		} else {
			return true;
		}

	}

	public static boolean isEven(Myinteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(int Digit) {
		if (Digit == value) {
			return true;
		} else
			return false;
	}

	public boolean equals(Myinteger Digit) {
		if (Digit.getValue() == value) {
			return true;
		} else {
			return false;
		}
	}

	public static int parseInt(char[] array){
		int wut = Integer.parseInt(new String(array));
		return wut;
	}	
//		int a = 0;
//		int b = 0;
//		for(int n = 0; n < array.length -1; n++) {
//			if (typeof(array[a]) == "number"); {
//				b = b + array[a];
//				a++;
//			}
//			else{
//				a++; }
//		}
//		//return ...; NEED TO RETURN SOMETHING HERE
//	}

	public static int parseInt(String myString) {
		return Integer.parseInt(myString);
	}

}



