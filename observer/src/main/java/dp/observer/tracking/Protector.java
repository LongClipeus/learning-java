/**
 * 
 */
package dp.observer.tracking;

/**
 * @author longclipeus
 *
 */
public class Protector implements Observer {

	public void update(User user) {
		if (user.getStatus() == LoginStatus.INVALID) {
			System.out.println(
					"Protector: User " + user.getEmail() + " is invalid. " + "IP " + user.getIp() + " is blocked");
		}
	}

}
