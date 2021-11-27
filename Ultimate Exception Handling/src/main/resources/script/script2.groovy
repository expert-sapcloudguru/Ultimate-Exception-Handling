import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;

def Message processData(Message message) {
       map = message.getProperties();
       String A = map.get("A");
       
       message.setProperty("newProperty", Integer.parseInt(A));
       return message;
}