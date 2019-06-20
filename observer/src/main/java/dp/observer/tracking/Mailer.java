/**
 * 
 */
package dp.observer.tracking;

/**
 * @author longclipeus
 *
 */
public class Mailer implements Observer {

	public void update(User user) {
		if (user.getStatus() == LoginStatus.EXPIRED) {
			System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
		}
	}

}
