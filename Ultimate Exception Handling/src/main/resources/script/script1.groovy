import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;

def Message processData(Message message) {
       message.setProperty("newProperty", Integer.parseInt("1"));
       return message;
}