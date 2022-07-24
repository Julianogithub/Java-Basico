package laptop.components;

public class Processor2 {
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxfrequency;

	public Processor2() {
		this.brand = "intel";
		this.series = "i5 7200u";
		this.generation = 7;
		this.cores = 2;
		this.threads = 4;
		this.cacheMemory = "3MB";
		this.frequency = "2.5Ghz";
		this.minFrequency = "2.5Ghz";
		this.maxfrequency = "3.1Ghz";

	}

	public Processor2(String brand, String series, int generation, int cores, int threads, String cacheMemory,
			String frequency, String minFrequency, String maxfrequency) {

		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxfrequency = maxfrequency;
	}

	@Override
	public String toString() {
		return "Processor \n brand = " + brand + ",\n series = " + series + ",\n generation = " 
	            + generation + ",\n cores = " + cores + ",\n threads = " + threads 
	            + ",\n cacheMemory = " + cacheMemory + ",\n frequency = " + frequency
				+ ",\n minFrequency = " + minFrequency + ",\n maxfrequency = " 
	            + maxfrequency + "\n********* ToString Processor ************\n";
	}

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public int getGeneration() {
		return generation;
	}

	public int getCores() {
		return cores;
	}

	public int getThreads() {
		return threads;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getMinFrequency() {
		return minFrequency;
	}

	public String getMaxfrequency() {
		return maxfrequency;
	}
}