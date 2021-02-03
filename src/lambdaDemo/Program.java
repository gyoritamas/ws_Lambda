package lambdaDemo;

public class Program implements Growl {

    public void doIt(Growl le, int a, String str) {
        le.growling( a, str);
    }

    @Override
    public void growling(int a, String gr) {
        System.out.println("prg - growling " + a + " " + gr );
        System.out.println(gr.repeat(a));
    }

    public void testDefaultInterfaceMethod(){
        Growl.super.anotherInterface();
    }



}

