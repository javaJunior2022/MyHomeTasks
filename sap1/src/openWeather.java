// сценарий работы
// 1. создать точку подключения
// 2.получить результаты вызова сервиса
// 3. записать данные по дате рассвета и дате заката за
// 4 последние 5 дней, включая текущий
// 5.опредилить продолжительность светового дня и вывести максимальное значение
// день с минимальной разницей ощущаемой и фактической температурой ночью.

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class openWeather {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://api.openweathermap.org/data/2.5/weather?q=Moscow&appid=3841c2dcd8185a83ce3bef2f18270fc5"))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        String stringResponse = response.body();
        System.out.println(stringResponse);




    }
}
