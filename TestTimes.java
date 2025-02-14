import java.util.Arrays;
public class TestTimes implements TestTimesInterface{
	
//Instance Variable
	private long [] testTimes;
	private final int ArrayDefaultSize = 10;
	private int numTestTimes;
	
	public TestTimes() {
		testTimes = new long[ArrayDefaultSize];
		this.numTestTimes = 0;
	}
	
	
	@Override
	public long getLastTestTime() { //works
		if (this.numTestTimes == 0) {
			return 0;
		}
		return this.testTimes[numTestTimes -1];
	}

	@Override
	public long[] getTestTimes() { //works
		
		return this.testTimes;
	}

	@Override
	public void resetTestTimes() {//works
		testTimes = new long[ArrayDefaultSize];
		this.numTestTimes = 0;
		
	}

	@Override
	public void addTestTime(long testTime) {//works
		if(this.numTestTimes < 10) {
			this.testTimes[this.numTestTimes] = testTime;
			this.numTestTimes++;
		}else {
			for (int i = 0; i < 9; i++) {
				testTimes[i] = testTimes[i + 1];
			}
			testTimes[9] = testTime;
		}
		
	}

	@Override
	public double getAverageTestTime() {
		
		if(this.numTestTimes == 0) {
			return 0;
		} else {
			double total = 0;
			for(int i = 0; i < this.numTestTimes; i++) {
				total = total + testTimes[i];
			}
			return total/this.numTestTimes;
		}
		
		
	}
	public static void main (String [] args) {
		TestTimes obj = new TestTimes();
		obj.addTestTime(1);
		obj.addTestTime(2);
		obj.addTestTime(3);
		obj.addTestTime(4);
		obj.addTestTime(5);
		obj.addTestTime(6);
		obj.addTestTime(7);
		obj.addTestTime(8);
		obj.addTestTime(9);
		obj.addTestTime(10);
		
		
		System.out.println(Arrays.toString(obj.getTestTimes()));
		System.out.println(obj.getLastTestTime());
//		obj.resetTestTimes();
//		System.out.println(Arrays.toString(obj.getTestTimes()));
		System.out.println(obj.getAverageTestTime());
		
		
		
	}

}
