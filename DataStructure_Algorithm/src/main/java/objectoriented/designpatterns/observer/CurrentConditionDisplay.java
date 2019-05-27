package objectoriented.designpatterns.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {


    private float temp;
    private float humidity;
    private Subject weatherdata;

    public CurrentConditionDisplay(Subject weatherdata) {
        this.weatherdata = weatherdata;
        weatherdata.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temp " + temp + "humidity " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
