package desafios;

public class BankAccount {
    private static char l1;

    public static void main(String[] args) {
        parse( "    _  _     _  _  _  _  _ \n"+
                      "  | _| _||_||_ |_   ||_||_|\n"+
                      "  ||_  _|  | _||_|  ||_| _|\n");

//        parse("  ||_  _|  | _||_|  ||_| _|\n");
    }

    public static long parse(final String acctNbr) {
        char[] line01 = acctNbr.substring(0,28).toCharArray();
        char[] line02 = acctNbr.substring(28,56).toCharArray();
        char[] line03 = acctNbr.substring(56,84).toCharArray();

        long myAccount = 0;


        System.out.println(line01);
        for(char l1 : line01) {

        }

        return myAccount;
    }
}
