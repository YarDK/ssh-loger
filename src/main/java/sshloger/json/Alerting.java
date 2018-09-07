
package sshloger.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alerting {

    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("month")
    @Expose
    private Integer month;
    @SerializedName("day")
    @Expose
    private Integer day;
    @SerializedName("timezone")
    @Expose
    private Integer timezone;
    @SerializedName("hour")
    @Expose
    private Integer hour;
    @SerializedName("minute")
    @Expose
    private Integer minute;
    @SerializedName("second")
    @Expose
    private Integer second;
    @SerializedName("fractionalSecond")
    @Expose
    private Double fractionalSecond;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Alerting withYear(Integer year) {
        this.year = year;
        return this;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Alerting withMonth(Integer month) {
        this.month = month;
        return this;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Alerting withDay(Integer day) {
        this.day = day;
        return this;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public Alerting withTimezone(Integer timezone) {
        this.timezone = timezone;
        return this;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Alerting withHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Alerting withMinute(Integer minute) {
        this.minute = minute;
        return this;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Alerting withSecond(Integer second) {
        this.second = second;
        return this;
    }

    public Double getFractionalSecond() {
        return fractionalSecond;
    }

    public void setFractionalSecond(Double fractionalSecond) {
        this.fractionalSecond = fractionalSecond;
    }

    public Alerting withFractionalSecond(Double fractionalSecond) {
        this.fractionalSecond = fractionalSecond;
        return this;
    }

}
