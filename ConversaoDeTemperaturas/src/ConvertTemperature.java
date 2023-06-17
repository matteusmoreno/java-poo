public class ConvertTemperature {
    private double fahrenheitTemperature;
    private double kelvinTemperature;
    private double rankineTemperature;
    private double reaumurTemperature;


    public double convertFahrenheit(double celsiusValue){
        return fahrenheitTemperature = (celsiusValue * 1.8) + 32;
    }
    public double convertKelvin(double celsiusValue){
        return kelvinTemperature = celsiusValue + 273.15;
    }
    public double convertRankine(double celsiusValue){
        return rankineTemperature = celsiusValue * 1.8 + 32 + 459.67;
    }
    public double convertReaumur (double celsiusValue){
        return reaumurTemperature = celsiusValue * 0.8;
    }
}
