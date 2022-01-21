import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;

def Message processData(Message message) {
       
    body = message.getBody(java.lang.String) as String
       
    map = message.getProperties();
    logs = map.get("logs");
       
    logs = logs.equals("NA") ? body : logs + body  
    message.setProperty("logs", logs);
       
    return message;
}