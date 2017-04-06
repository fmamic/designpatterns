package org.fmamic.design.patterns.observer;

import org.fmamic.design.patterns.observer.display.CurrentCondition;
import org.fmamic.design.patterns.observer.display.Forecast;
import org.junit.Test;

public class WeatherDataTest {

    @Test
    public void weatherDataTest() {
        final WeatherData weatherData = new WeatherData();

        final Observer forecast = new Forecast();
        final Observer currentCondition = new CurrentCondition();

        weatherData.registerObserver(forecast);
        weatherData.registerObserver(currentCondition);

        weatherData.setTemperature(10);
        weatherData.setHumidity(15);
        weatherData.setPressure(20);

        weatherData.notifyObserver();
    }

}
