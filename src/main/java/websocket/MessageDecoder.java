package websocket;

import com.google.gson.Gson;
import model.Message;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class MessageDecoder implements Decoder.Text<Message> {
    private static Gson gson = new Gson();

    public Message decode(String s) throws DecodeException {
        Message message = gson.fromJson(s, Message.class);
        return message;
    }


    public boolean willDecode(String s) {
        return (s != null);
    }


    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
    }


    public void destroy() {
        // Close resources
    }
}
