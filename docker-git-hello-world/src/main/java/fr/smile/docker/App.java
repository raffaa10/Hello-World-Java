package fr.smile.docker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String args[]) throws Exception{
        for(int i = 0 ; i < 100; i++){
            System.out.println("Hi World Ping " + i );
            Thread.sleep(3000);
        }
    }
}
