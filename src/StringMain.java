public class StringMain {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        boolean tandf = true && false;
        boolean torf = true || false;
        System.out.println("True and False is " +tandf);
        System.out.println("True or False is " +torf);
        boolean complex = (5 > 8) || (3 < 9) ;
        System.out.println("The output of the complex boolean is " +complex);
        char t = 't';
        String myString ="This is IT1090";
        String titleString = "Computer Programming";
        System.out.println("My String is " + myString);
        String lower = myString.toLowerCase();
        System.out.println("Lower case string is "+ lower);

        String complexString = "Name: " +myString +"\t"+"Title: "+titleString;
        System.out.println(complexString);
    }
}