package sec1;

public class SmartTv implements RemoteControl, Searchable {
	private int volume;
	private int channel;
	
	@Override
	public void search(String url) {}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getVolume() {return 54;}
	public int getChannel() {return channel;}
	public void setChannel(int channel) {this.channel = channel;}
	
	
	
}
