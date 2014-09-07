package dto.moves;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class HourlyTotal {

private Integer distance;
private Integer activeTime;
private Double calories;
private Integer inactiveTime;
private Integer longestIdleTime;
private Integer steps;
private Integer longestActiveTime;
private Date date;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Integer getDistance() {
return distance;
}

public void setDistance(Integer distance) {
this.distance = distance;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Integer getActiveTime() {
return activeTime;
}

public void setActiveTime(Integer activeTime) {
this.activeTime = activeTime;
}

public Double getCalories() {
return calories;
}

public void setCalories(Double calories) {
this.calories = calories;
}

public Integer getInactiveTime() {
return inactiveTime;
}

public void setInactiveTime(Integer inactiveTime) {
this.inactiveTime = inactiveTime;
}

public Integer getLongestIdleTime() {
return longestIdleTime;
}

public void setLongestIdleTime(Integer longestIdleTime) {
this.longestIdleTime = longestIdleTime;
}

public Integer getSteps() {
return steps;
}

public void setSteps(Integer steps) {
this.steps = steps;
}

public Integer getLongestActiveTime() {
return longestActiveTime;
}

public void setLongestActiveTime(Integer longestActiveTime) {
this.longestActiveTime = longestActiveTime;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}