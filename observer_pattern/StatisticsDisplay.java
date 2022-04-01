package observer_pattern;

public class StatisticsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    StatisticsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = getDeltaTemperature(temperature);
        this.humidity = getDeltaHumidity(humidity);
        this.pressure = getDeltaPressure(pressure);
        this.display();
    }

    public float getDeltaTemperature(float temperature) {
        return 0;
    }

    public float getDeltaHumidity(float humidity) {
        return 0;
    }

    public float getDeltaPressure(float pressure) {
        return 0;
    }


    public void display() {
        System.out.println("Delta temperature: " + temperature);
        System.out.println("Delta humidity: " + humidity);
        System.out.println("Delta pressure: " + pressure);
    }
}
