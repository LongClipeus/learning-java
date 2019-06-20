/**
 * 
 */
package dp.observer.tracking;

/**
 * @author longclipeus
 *
 */
public class Logger implements Observer {

    public void update(User user) {
        System.out.println("Logger: " + user);
    }

}
