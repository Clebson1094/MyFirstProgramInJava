import java.util.HashMap;
import java.util.Map;

public class Contagem {

      private String url;
      private String token;
      private String Authorization;


     public Contagem(String url, String token) {
          this.url = url;
          this.token = token;
     }

     public String getUrl() {
          return url;
     }

     public void setUrl(String url) {
          this.url = url;
     }

     public String getToken() {
          return token;
     }

     public void setToken(String token) {
          this.token = token;
     }

     Map<String, String> headers = new HashMap<>();

     headers.put(Authorization, "Baerer");
}
