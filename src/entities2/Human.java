package entities2;

/**
 * Created by wookie on 5/25/16.
 */
public class Human {
    private Activity activity;

    public void doSomething(){
        activity.doSomething(this);
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
