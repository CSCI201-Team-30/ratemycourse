import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Review {
	private String courseName;
	private String profName;
	private int rating;
	private String title;
	private String body;
	
	public Review(String courseName, String profName, int rating, String headline, String body) {
		this.courseName = courseName;
		this.profName = profName;
		this.rating = rating;
		this.title = title;
		this.body = body;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public String getProfName() {
		return profName;
	}

	public int getRating() {
		return rating;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}
}
