package hibarnet;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by phenix on 9/27/14.
 */
@Entity
@Table(name = "MatchDetails", schema = "", catalog = "fifaworldcup")
public class EntityMatchDetails {
    private int matchno;
    private String teamA;
    private String teamB;
    private String venue;

    @Basic
    @Column(name = "matchno", nullable = false, insertable = true, updatable = true)
    public int getMatchno() {
        return matchno;
    }

    public void setMatchno(int matchno) {
        this.matchno = matchno;
    }

    @Basic
    @Column(name = "TeamA", nullable = false, insertable = true, updatable = true, length = 100)
    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    @Basic
    @Column(name = "TeamB", nullable = false, insertable = true, updatable = true, length = 100)
    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    @Basic
    @Column(name = "Venue", nullable = false, insertable = true, updatable = true, length = 100)
    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityMatchDetails that = (EntityMatchDetails) o;

        if (matchno != that.matchno) return false;
        if (teamA != null ? !teamA.equals(that.teamA) : that.teamA != null) return false;
        if (teamB != null ? !teamB.equals(that.teamB) : that.teamB != null) return false;
        if (venue != null ? !venue.equals(that.venue) : that.venue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = matchno;
        result = 31 * result + (teamA != null ? teamA.hashCode() : 0);
        result = 31 * result + (teamB != null ? teamB.hashCode() : 0);
        result = 31 * result + (venue != null ? venue.hashCode() : 0);
        return result;
    }
}
