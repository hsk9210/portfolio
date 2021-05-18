package ex01.oop;

public class TV {

	public TV() {
		// TODO Auto-generated constructor stub
	}
	private int channel = 0;
	private String color = "coral blue";
	
	//지금의 채널은?
	public int _channelIs() {
		return channel;
	}
	//채널 변경하기.
	public void _changeChannel(int channel) {
		this.channel = channel;
	}
	//현재의 색상은?
	public String _colorIs() {
		return color;
	}
	//티비 색상 변경하기.
	public void _changeColor(String color) {
		this.color = color;
	}
	//그러므로 지금 채널과, 색상은...
	public void display() {
		System.out.println("channel is "+channel+", and color is "+color+".");
	}

}
