
package dto.moves;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Details {

    private Integer activeTime;
    private List<List<String>> tzs = new ArrayList<List<String>>();
    private Integer inactiveTime;
    private Integer woCount;
    private Integer woLongest;
    private Double bmr;
    private Double bgCalories;
    private List<HourlyTotal> hourlyTotals;
    private Double bmrDay;
    private Integer woActiveTime;
    private Integer sunrise;
    private Double distance;
    private String tz;
    private Integer longestActive;
    private Integer longestIdle;
    private Double calories;
    private Double km;
    private Integer steps;
    private Integer woCalories;
    private Integer woTime;
    private Integer sunset;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Integer activeTime) {
        this.activeTime = activeTime;
    }

    public List<List<String>> getTzs() {
        return tzs;
    }

    public void setTzs(List<List<String>> tzs) {
        this.tzs = tzs;
    }

    public Integer getInactiveTime() {
        return inactiveTime;
    }

    public void setInactiveTime(Integer inactiveTime) {
        this.inactiveTime = inactiveTime;
    }

    public Integer getWoCount() {
        return woCount;
    }

    public void setWoCount(Integer woCount) {
        this.woCount = woCount;
    }

    public Integer getWoLongest() {
        return woLongest;
    }

    public void setWoLongest(Integer woLongest) {
        this.woLongest = woLongest;
    }

    public Double getBmr() {
        return bmr;
    }

    public void setBmr(Double bmr) {
        this.bmr = bmr;
    }

    public Double getBgCalories() {
        return bgCalories;
    }

    public void setBgCalories(Double bgCalories) {
        this.bgCalories = bgCalories;
    }

//    public HourlyTotals getHourlyTotals() {
//        return hourlyTotals;
//    }
//
//    public void setHourlyTotals(HourlyTotals hourlyTotals) {
//        this.hourlyTotals = hourlyTotals;
//    }

    public List<HourlyTotal> getHourlyTotals() {
		return hourlyTotals;
	}

	public void setHourlyTotals(List<HourlyTotal> hourlyTotals) {
		this.hourlyTotals = hourlyTotals;
	}

	public Double getBmrDay() {
        return bmrDay;
    }

    public void setBmrDay(Double bmrDay) {
        this.bmrDay = bmrDay;
    }

    public Integer getWoActiveTime() {
        return woActiveTime;
    }

    public void setWoActiveTime(Integer woActiveTime) {
        this.woActiveTime = woActiveTime;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public Integer getLongestActive() {
        return longestActive;
    }

    public void setLongestActive(Integer longestActive) {
        this.longestActive = longestActive;
    }

    public Integer getLongestIdle() {
        return longestIdle;
    }

    public void setLongestIdle(Integer longestIdle) {
        this.longestIdle = longestIdle;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public Integer getWoCalories() {
        return woCalories;
    }

    public void setWoCalories(Integer woCalories) {
        this.woCalories = woCalories;
    }

    public Integer getWoTime() {
        return woTime;
    }

    public void setWoTime(Integer woTime) {
        this.woTime = woTime;
    }

    public Integer getSunset() {
        return sunset;
    }

    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
