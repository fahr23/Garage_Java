package objectoriented.designpatterns.observer;

public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData= new WeatherData();

        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(23,34,55);

    }
}
