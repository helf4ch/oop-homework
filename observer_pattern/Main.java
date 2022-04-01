package observer_pattern;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.measurementsChanged();

        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.removeObserver(statisticsDisplay);
        weatherData.removeObserver(forecastDisplay);
        
        weatherData.measurementsChanged();
    }
}
