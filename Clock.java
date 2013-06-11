public class Clock {
	public long ms = 0;
	long startms = 0;
	double s = 0;
	public Clock(){
		startms = System.currentTimeMillis();
	}
	public void delay(long ms){

		this.ms = System.currentTimeMillis() + ms;
		while(System.currentTimeMillis() < this.ms);
	}
	public double getMS(){
		double r = System.currentTimeMillis() - startms;
		s = r / 1000;
		return r;
	}
	public String convertTime(String format){
		double ms = getMS();
		if(s >= 60)
			s = s-60;
		
		format = format.replaceAll("ss","" + s);
		format = format.replaceAll("mm","" + (int)(ms/60000));
		format = format.replaceAll("hh","" + (int)(ms/360000));
		format = format.replaceAll("dd","" + (int)(ms/(24*360000)));
		format = format.replaceAll("ww","" + (int)(ms/(7*24*360000)));
		format = format.replaceAll("yyyy","" + (int)(ms/(24*360000*365)));	
		return format;
	}
	
}
