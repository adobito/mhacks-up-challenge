
package dto.moves;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Meta {

    private String userXid;
    private String message;
    private Integer code;
    private Integer time;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getUserXid() {
        return userXid;
    }

    public void setUserXid(String userXid) {
        this.userXid = userXid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
