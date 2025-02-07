
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Divisa {

    public Moneda convertirMoneda(String base, String a, double monto){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/74ce4ed8485505603af3bc88/pair/"+base+"/"+a+"/"+monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No se pudo reaizar la convercion.");
        }


    }
}
