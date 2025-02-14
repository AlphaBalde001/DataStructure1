
public class SearchDriver implements SearchDriverInterface{

	@Override
	public int[] getListOfNumbers() {
		
		int[] numbers = new int [10_000_000];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		return numbers;
	}

	@Override
	public int[] getTargets() {
		int [] targets = {500, 10_000, 100_000, 1_000_000, 5_000_000, 7_500_000, 10_000_000 };
		return targets;
	}

	@Override
	public TestTimes runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes) {
	    LinearSearch linearSearch = new LinearSearch(); 
        TestTimes testTimes = new TestTimes(); 

        for (int i = 0; i < numberOfTimes; i++) {
            long startTime = System.nanoTime(); 
            linearSearch.search(listOfNumbers, target); 
            long endTime = System.nanoTime(); 

            testTimes.addTestTime(endTime - startTime);
        }

        return testTimes; 
    }
	@Override
	public TestTimes runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes) {
		BinarySearch binarySearch = new BinarySearch(); 
        TestTimes testTimes = new TestTimes(); 

	        for (int i = 0; i < numberOfTimes; i++) {
	            long startTime = System.nanoTime();
	            binarySearch.search(listOfNumbers, target);
	            long endTime = System.nanoTime(); 

	            testTimes.addTestTime(endTime - startTime); 
	        }

	        return testTimes; 
	}

}
