package org.example;

public class App 
{
    private static StringConcatenator stringConcatenator;
    static
    {
        stringConcatenator=new StringConcatenator();
    }
    public static void main( String[] args )
    {
        System.out.println(stringConcatenator.concatenate("Hello","World"));
        System.out.println("Hello managing deployment/test explorers.\n");
        System.out.println("This program is running version "+
                App.class.getPackage().getImplementationVersion());
    }
}
