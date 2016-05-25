package entities2;

/**
 * Created by wookie on 5/25/16.
 */
public class Work implements Activity {
    @Override
    public void doSomething(Human context) {
        System.out.println("Working...");
        context.setActivity(new Rest());
    }
}
