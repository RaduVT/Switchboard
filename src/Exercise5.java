public class Exercise5 {
    public static void main(String[] args) {
        Call c = new Call(12345, 54321, 90,true);
        System.out.println(c);
        Call c2 = new Call(84615, 21928, 30,false);
        System.out.println(c2);
        Call c3 = new Call(91532, 91634, 22,false);
        System.out.println(c3);
        Call c4 = new Call(90032, 81345, 67,false);
        System.out.println(c4);
        Switchboard switchboard = new Switchboard(100);
        Switchboard.registerCall(c);
        Switchboard.registerCall(c2);
        Switchboard.print();
    }
}
