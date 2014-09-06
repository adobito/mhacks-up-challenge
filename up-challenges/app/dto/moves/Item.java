
package dto.moves;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Item {

    private Integer timeUpdated;
    private String xid;
    private String title;
    private String snapshotImage;
    private Integer timeCreated;
    private Integer timeCompleted;
    private Details details;
    private Integer date;
    private String type;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(Integer timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSnapshotImage() {
        return snapshotImage;
    }

    public void setSnapshotImage(String snapshotImage) {
        this.snapshotImage = snapshotImage;
    }

    public Integer getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Integer timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Integer getTimeCompleted() {
        return timeCompleted;
    }

    public void setTimeCompleted(Integer timeCompleted) {
        this.timeCompleted = timeCompleted;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
