package dp.observer.weather;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); ++i) {
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		// Chúng ta thông báo cho các Observer một khi chúng ta đã cập nhật thành công
		// các thông tin từ Weather Station.
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		// Chúng ta có phương thức này để tạm thời có thể thay đổi trạng thái của
		// WeaterData.
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

		measurementsChanged();
	}

}
