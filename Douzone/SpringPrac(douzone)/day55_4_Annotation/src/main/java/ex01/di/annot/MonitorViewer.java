package ex01.di.annot;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	//@Autowired
	private Recorder recorder;
	
	public MonitorViewer(Recorder recorder) {
		super();
		this.recorder = recorder;
	}
	public MonitorViewer() {
		
	}

	public Recorder getRecorder() {
		System.out.println("context read success and autowired");
		return recorder;
	}

	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter Dependency Injection success.");
	}
	
	public Recorder getRecorder2() {
		System.out.println("context read success and autowired" +this.recorder);
		return recorder;
	}

	
	
	

}
