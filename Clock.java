public class Clock {
	private long ms = 0,startms = 0,timerstartms = 0,timerstopms = 0;
	public Clock(){
		startms = System.currentTimeMillis();
	}
	public void delay(long ms){
		this.ms = System.currentTimeMillis() + ms;
		while(System.currentTimeMillis() < this.ms);
	}
	public long getMillisecondsPassed(){
		return System.currentTimeMillis() - startms;
	}
	public void startTimer(){
		timerstartms = getMillisecondsPassed();		
	}
	public void stopTimer(){
		timerstopms = getMillisecondsPassed();
	}
	public long getTimerValue(){
		return timerstopms - timerstartms;
	}
}
