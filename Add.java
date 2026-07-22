
/* Simple Java program to add two numbers */
class Add {
	public static void main(String[] args) throws Exception {
		if (args.length >= 2) {
			try {
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				System.out.println(a + b);
			} catch (NumberFormatException e) {
				System.err.println("Invalid number");
				System.exit(1);
			}
		} else {
			java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			System.out.print("Enter first number: ");
			double a = Double.parseDouble(r.readLine());
			System.out.print("Enter second number: ");
			double b = Double.parseDouble(r.readLine());
			System.out.println(a + b);
		}
	}
}
