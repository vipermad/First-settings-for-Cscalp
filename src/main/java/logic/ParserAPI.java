package logic;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParserAPI {

  public static List<DataCrypto> dataCryptoList = new ArrayList<>();
  public static HashMap<String, Double> priceList = new HashMap<>();
  public static HashMap<String, Double> stepSizeList = new HashMap<>();

  public static void connect(){
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.binance.com//fapi/v1/exchangeInfo")).build();
    client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        .thenApply(HttpResponse::body)
        .thenApply(ParserAPI::parse)
        .join();
  }
  public static String parse(String responseBody) {

    try {
      JsonElement fileElement = JsonParser.parseString(responseBody);
      JsonObject fileObject = fileElement.getAsJsonObject();
      JsonArray symbols = fileObject.get("symbols").getAsJsonArray();
      for (int i = 0; i < symbols.size(); i++) {
        JsonObject symbol = symbols.get(i).getAsJsonObject();
        JsonElement symbolN = symbol.get("symbol");
        String symbolName = symbolN.toString().replace("\"", "");
        JsonArray filters = symbol.get("filters").getAsJsonArray();
        JsonObject filter = filters.get(1).getAsJsonObject();
        double stepSize = Double.parseDouble(filter.get("stepSize").toString().replace("\"", ""));
        stepSizeList.put(symbolName, stepSize);
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return  null;
  }

  public static void connect2() {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.binance.com/fapi/v1/ticker/price")).build();
    client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        .thenApply(HttpResponse::body)
        .thenApply(ParserAPI::parse2)
        .join();
  }
  public static String parse2(String responseBody){
    JsonElement fileElement = JsonParser.parseString(responseBody);
    JsonArray data = fileElement.getAsJsonArray();
    for (int i = 0; i < data.size(); i++){
      JsonObject symbol = data.get(i).getAsJsonObject();
      String name = symbol.get("symbol").getAsString();
      double price = symbol.get("price").getAsDouble();
      priceList.put(name, price);
    }
    return  null;
  }

}