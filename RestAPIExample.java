import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;


public class RestAPIExample {
    public static void main(String[] args) throws Exception{
        Transcript transcript=new Transcript();
        transcript.setAudio_url("https://github.com/chowpawan/Audio-file/blob/22c8ec2afb54fc2dd1176d090e284f11450f280f/Thirsty.mp4?raw=true");
        Gson gson=new Gson();
        String jsonRequest=gson.toJson(transcript);
        System.out.println(jsonRequest);
       // HttpRequest postRequest = HttpRequest.newBuilder().uri(new URI("https://api.assemblyai.com/v2/transcript"))
      //  .header("Authorization","87ccbbd6a71d4c538bfd7eceff08d9c5").
     //   POST(BodyPublishers.ofString(null))

  }
    
}
