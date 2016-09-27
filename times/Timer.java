package times;

public class Timer {
	private static final class Lock { }
	private final Object lock = new Lock();
	public long remainingTimeMillis = 0;
	
	private Thread t1 = new Thread(new Runnable()
	{
		public void run()
		{
			try {
				while(remainingTimeMillis >0)	
				{
					Thread.sleep(10);
					remainingTimeMillis -= 10;
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	});
	public void start()
	{
		t1.start();
	}
	
	public void pause()
	{
		try {
			synchronized (lock) 
			{
			        lock.wait();
			    }

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void resume()
	{
		synchronized (lock) 
		{
		        lock.notify();
		    }
	}
	
	public void reset(long timeMillis)
	{
		remainingTimeMillis = timeMillis;
	}
	
	public long getremainingTimeMillis()
	{
		return remainingTimeMillis;
	}
	
	public long getRemMilliSeconds() {
        return (remainingTimeMillis-getRemSeconds()*1000-getRemMinutes()*60000-getRemHours()* 3600000);
    }
	
	public long getRemSeconds() {
        return (remainingTimeMillis-getRemMinutes()*60000-getRemHours()* 3600000) / 1000;
    }
 
    public long getRemMinutes() {
        return (remainingTimeMillis-getRemHours()* 3600000) / 60000;
    }
 
    public long getRemHours() {
        return (remainingTimeMillis) / 3600000;
    }
	
}
