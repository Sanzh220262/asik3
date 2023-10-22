class WeatherService {
    public String getWeatherData() {
        return "Temperature: 25°C, Humidity: 60%";
    }
}
class WeatherData {
    private double temperature;
    private double humidity;
    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }
        public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public double getHumidity() {
        return humidity;
    }
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}

class WeatherDataAdapter {
    private WeatherService weatherService;
    public WeatherDataAdapter(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    public WeatherData getFormattedWeatherData() {
        String weatherData = weatherService.getWeatherData();
        double temperature = parseTemperature(weatherData);
        double humidity = parseHumidity(weatherData);
        WeatherData formattedWeatherData = new WeatherData(temperature, humidity);
        return formattedWeatherData;
    }
    private double parseTemperature(String weatherData) {
                return 25.0;
    }
    private double parseHumidity(String weatherData) {
        return 60.0;
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();
        WeatherDataAdapter adapter = new WeatherDataAdapter(weatherService);
        WeatherData formattedWeatherData = adapter.getFormattedWeatherData();
        System.out.println("Temperature: " + formattedWeatherData.getTemperature() + "°C");
        System.out.println("Humidity: " + formattedWeatherData.getHumidity() + "%");
    }
}