/**
 * Created by luca on 06/09/14.
 */
public class Test {

    public static void main(String args[]) {

        System.out.println("Starting BenchMark");

        long elapsedtime;
        long time = System.currentTimeMillis();


        for (int i = 0; i < 1000; i++) {

            System.out.println("printing ...");


        }

        elapsedtime = System.currentTimeMillis() - time;

        System.out.println("Time Elapsed: " + elapsedtime);


        System.out.println("Modificato online su github");

    }

}
