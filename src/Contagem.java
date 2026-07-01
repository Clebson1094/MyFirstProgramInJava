import java.util.HashMap;
import java.util.Map;

public class Contagem {

      private String url;
      private String token;
      private Map<String, String> headers;


     public Contagem(String url, String token) {
          this.url = url;
          this.token = token;
          this.headers = new HashMap<>();

          headers.put("Authorization", "Bearer " + this.token);
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


}


