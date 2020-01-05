public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("8 + 7 = " + context.executeStrategy(8,7));

        context = new Context(new OperationMultiply());
        System.out.println("8 + 7 = " + context.executeStrategy(8,7));

        context = new Context(new OperationSubstract());
        System.out.println("8 + 7 = " + context.executeStrategy(8,7));

    }
}
