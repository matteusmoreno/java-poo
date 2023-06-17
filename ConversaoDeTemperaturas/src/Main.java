public class Main {
    public static void main(String[] args) {


        ConvertTemperature temperatureValue = new ConvertTemperature();

        System.out.println(temperatureValue.convertFahrenheit(155));
        System.out.println(temperatureValue.convertKelvin(155));
        System.out.println(temperatureValue.convertRankine(155));
        System.out.println(temperatureValue.convertReaumur(155));
    }
}
