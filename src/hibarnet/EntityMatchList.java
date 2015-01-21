package hibarnet;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by phenix on 9/27/14.
 */
@Entity
@Table(name = "MatchList", schema = "", catalog = "fifaworldcup")
public class EntityMatchList {
    private int matchNo;
    private int day;
    private int hour;
    private int min;

    @Basic
    @Column(name = "MatchNo", nullable = false, insertable = true, updatable = true)
    public int getMatchNo() {
        return matchNo;
    }

    public void setMatchNo(int matchNo) {
        this.matchNo = matchNo;
    }

    @Basic
    @Column(name = "day", nullable = false, insertable = true, updatable = true)
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Basic
    @Column(name = "Hour", nullable = false, insertable = true, updatable = true)
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Basic
    @Column(name = "Min", nullable = false, insertable = true, updatable = true)
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityMatchList that = (EntityMatchList) o;

        if (day != that.day) return false;
        if (hour != that.hour) return false;
        if (matchNo != that.matchNo) return false;
        if (min != that.min) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = matchNo;
        result = 31 * result + day;
        result = 31 * result + hour;
        result = 31 * result + min;
        return result;
    }
}
