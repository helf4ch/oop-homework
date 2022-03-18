package com.company;

public class ForecastDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    ForecastDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = getForecastTemperature(temperature);
        this.humidity = getForecastHumidity(humidity);
        this.pressure = getForecastPressure(pressure);
        this.display();
    }

    public float getForecastTemperature(float temperature) {
        return 0;
    }

    public float getForecastHumidity(float humidity) {
        return 0;
    }

    public float getForecastPressure(float pressure) {
        return 0;
    }

    public void display() {
        System.out.println("Forecast temperature: " + temperature);
        System.out.println("Forecast humidity: " + humidity);
        System.out.println("Forecast pressure: " + pressure);
    }
}
