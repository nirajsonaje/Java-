package latestJavaFeatures;

class Test implements TempI9 {

	@Override
	public void mul(int a, int b) {
		System.out.print("Answer by Abstract method = ");
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		TempI9 in = new Temp9();
		in.mul(2, 3);
		in.add(6, 2);
		TempI9.mod(5, 3);
	}
}