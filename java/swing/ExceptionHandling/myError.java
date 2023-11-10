class myProgram {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("Value of c = " + c);
        } catch (NumberFormatException e) {
            System.out.println("Error: invalid input format");
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: insufficient arguments");
        }
    }
}