
package dto.user;


public class Meta {

    private String userXid;
    private String message;
    private Integer code;
    private Integer time;

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

}
