package dto.database;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "challenges")
public class Challenges {

	Integer id;
	Integer challengerId;
	Integer defenderId;
	Date challengeDate;
	Date startDate;
	Date endDate;
	Boolean challengerReady;
	Boolean defenderReady;
	Date challengerReadyDate;
	Date defenderReadyDate;
	Float wager;
	
	public Challenges() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "challenger")
	public Integer getChallengerId() {
		return challengerId;
	}
	public void setChallengerId(Integer challengerId) {
		this.challengerId = challengerId;
	}
	@Column(name = "defender")
	public Integer getDefenderId() {
		return defenderId;
	}
	public void setDefenderId(Integer defenderId) {
		this.defenderId = defenderId;
	}
	@Column(name = "challenge_date")
	public Date getChallengeDate() {
		return challengeDate;
	}
	public void setChallengeDate(Date challengeDate) {
		this.challengeDate = challengeDate;
	}
	@Column(name = "start_date")
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@Column(name = "end_date")
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Column(name = "challenger_ready")
	public Boolean getChallengerReady() {
		return challengerReady;
	}
	public void setChallengerReady(Boolean challengerReady) {
		this.challengerReady = challengerReady;
	}
	@Column(name = "defender_ready")
	public Boolean getDefenderReady() {
		return defenderReady;
	}
	public void setDefenderReady(Boolean defenderReady) {
		this.defenderReady = defenderReady;
	}
	@Column(name = "challenger_ready_date")
	public Date getChallengerReadyDate() {
		return challengerReadyDate;
	}
	public void setChallengerReadyDate(Date challengerReadyDate) {
		this.challengerReadyDate = challengerReadyDate;
	}
	@Column(name = "defender_ready_date")
	public Date getDefenderReadyDate() {
		return defenderReadyDate;
	}
	public void setDefenderReadyDate(Date defenderReadyDate) {
		this.defenderReadyDate = defenderReadyDate;
	}
	@Column(name = "wager")
	public Float getWager() {
		return wager;
	}
	public void setWager(Float wager) {
		this.wager = wager;
	}
	
}
