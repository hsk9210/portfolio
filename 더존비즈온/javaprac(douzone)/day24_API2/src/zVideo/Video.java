package zVideo;

import java.util.HashMap;
import java.util.Map;

public class Video {
	StringBuffer title;
	StringBuffer category, lend, lendName, lendDate;

	public Video() {
		// TODO Auto-generated constructor stub
	}

	public Video(StringBuffer title, StringBuffer category, StringBuffer lend, StringBuffer lendName,
			StringBuffer lendDate) {
		super();
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}

	
	public String display() {
		return "Video [title=" + title + ", category=" + category + ", lend=" + lend + ", lendName=" + lendName
				+ ", lendDate=" + lendDate + "]";
	}	
	

}
