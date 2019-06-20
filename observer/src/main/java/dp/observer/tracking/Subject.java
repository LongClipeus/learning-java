/**
 * 
 */
package dp.observer.tracking;

/**
 * @author longclipeus
 *
 */
public interface Subject {

	void attach(Observer observer);

	void detach(Observer observer);

	void notifyAllObserver();

}
