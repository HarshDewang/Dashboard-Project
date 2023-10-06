package com.datadashboard.dd.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="data")
public class Dashboard {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name="end_year")
	private Integer EndYear;
	
	@Column(name="citylng")
	private String  CityLang;
	
	@Column(name="citylat")
	private String  CityLat;
	
	@Column(name="intensity")
	private Integer Intensity;
	
	@Column(name="sector")
	private String  Sector;
	
	@Column(name="topic")
	private String Topic;
	
	@Column(name="insight")
	private String Insight;
	
	@Column(name="swot")
	private String Swot;
	
	@Column(name="url")
	private String URL;
	
	@Column(name="region")
	private String Region;
	
	@Column(name="start_year")
	private String StartYear;
	
	@Column(name="impact")
	private String Impact;
	
	@Column(name="added")
	private String Added;
	
	@Column(name="published")
	private String Published;
	
	@Column(name="city")
	private String City;
	
	@Column(name="country")
	private String Country;
	
	@Column(name="relevance")
	private Integer Relevance;
	
	@Column(name="pestle")
	private String Pestle;
	
	@Column(name="source")
	private String Source;
	
	@Column(name="title")
	private String Title;
	
	@Column(name="likelihood")
	private Integer Likelihood;

	public Dashboard(Integer id, Integer endYear, String cityLang, String cityLat, Integer intensity, String sector,
			String topic, String insight, String swot, String uRL, String region, String startYear, String impact,
			String added, String published, String city, String country, Integer relevance, String pestle,
			String source, String title, Integer likelihood) {
		super();
		Id = id;
		EndYear = endYear;
		CityLang = cityLang;
		CityLat = cityLat;
		Intensity = intensity;
		Sector = sector;
		Topic = topic;
		Insight = insight;
		Swot = swot;
		URL = uRL;
		Region = region;
		StartYear = startYear;
		Impact = impact;
		Added = added;
		Published = published;
		City = city;
		Country = country;
		Relevance = relevance;
		Pestle = pestle;
		Source = source;
		Title = title;
		Likelihood = likelihood;
	}

	public Dashboard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getEndYear() {
		return EndYear;
	}

	public void setEndYear(Integer endYear) {
		EndYear = endYear;
	}

	public String getCityLang() {
		return CityLang;
	}

	public void setCityLang(String cityLang) {
		CityLang = cityLang;
	}

	public String getCityLat() {
		return CityLat;
	}

	public void setCityLat(String cityLat) {
		CityLat = cityLat;
	}

	public Integer getIntensity() {
		return Intensity;
	}

	public void setIntensity(Integer intensity) {
		Intensity = intensity;
	}

	public String getSector() {
		return Sector;
	}

	public void setSector(String sector) {
		Sector = sector;
	}

	public String getTopic() {
		return Topic;
	}

	public void setTopic(String topic) {
		Topic = topic;
	}

	public String getInsight() {
		return Insight;
	}

	public void setInsight(String insight) {
		Insight = insight;
	}

	public String getSwot() {
		return Swot;
	}

	public void setSwot(String swot) {
		Swot = swot;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getStartYear() {
		return StartYear;
	}

	public void setStartYear(String startYear) {
		StartYear = startYear;
	}

	public String getImpact() {
		return Impact;
	}

	public void setImpact(String impact) {
		Impact = impact;
	}

	public String getAdded() {
		return Added;
	}

	public void setAdded(String added) {
		Added = added;
	}

	public String getPublished() {
		return Published;
	}

	public void setPublished(String published) {
		Published = published;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Integer getRelevance() {
		return Relevance;
	}

	public void setRelevance(Integer relevance) {
		Relevance = relevance;
	}

	public String getPestle() {
		return Pestle;
	}

	public void setPestle(String pestle) {
		Pestle = pestle;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Integer getLikelihood() {
		return Likelihood;
	}

	public void setLikelihood(Integer likelihood) {
		Likelihood = likelihood;
	}

	@Override
	public String toString() {
		return "Dashboard [Id=" + Id + ", EndYear=" + EndYear + ", CityLang=" + CityLang + ", CityLat=" + CityLat
				+ ", Intensity=" + Intensity + ", Sector=" + Sector + ", Topic=" + Topic + ", Insight=" + Insight
				+ ", Swot=" + Swot + ", URL=" + URL + ", Region=" + Region + ", StartYear=" + StartYear + ", Impact="
				+ Impact + ", Added=" + Added + ", Published=" + Published + ", City=" + City + ", Country=" + Country
				+ ", Relevance=" + Relevance + ", Pestle=" + Pestle + ", Source=" + Source + ", Title=" + Title
				+ ", Likelihood=" + Likelihood + "]";
	}
	
	
	

}
