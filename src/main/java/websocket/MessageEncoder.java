package websocket;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;


import com.google.gson.Gson;
import model.Message;

public class MessageEncoder implements Encoder.Text<Message> {

    private static Gson gson = new Gson();

    public String encode(Message message) throws EncodeException {
        String json = gson.toJson(message);
        return json;
    }

    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
    }

    public void destroy() {
        // Close resources
    }
}