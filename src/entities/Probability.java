package entities;

public class Probability {
	
	int[] valueProb;
	int[] multProb;
	int[] releaseProb;
	
	int[] valueSeed;
	int[] multSeed;
	int[] releaseSeed;
	
	public Probability() {
		this.valueProb = new int[6];
		this.multProb = new int[3];
		this.releaseProb = new int[1];
		
		this.valueProb[0] = 20;
		this.valueProb[1] = 20;
		this.valueProb[2] = 20;
		this.valueProb[3] = 20;
		this.valueProb[4] = 20;
		this.valueProb[5] = 0;
		
		this.multProb[0] = 40;
		this.multProb[1] = 30;
		this.multProb[2] = 30;
		
		this.releaseProb[0] = 50;
		generateSeeds();
	}
	
	void generateMultSeed(){
		multSeed  = new int[1000];
		int startIndex = 0;
		for (int i = 0; i < multProb.length; i++) {
			int j = multProb[i];
			j *= 10;
			for (int j2 = startIndex; j2 < j + startIndex; j2++) {
				multSeed[j2] = i + 1;				
			}
			startIndex += j;
			
		}
	}
	void generateValueSeed(){
		valueSeed  = new int[1000];
		int startIndex = 0;
		for (int i = 0; i < valueProb.length; i++) {
			int j = valueProb[i];
			j *= 10;
			for (int j2 = startIndex; j2 < j + startIndex; j2++) {
				valueSeed[j2] = i + 1;				
			}
			startIndex += j;
			
		}
	}
	
	void generateReleaseSeed(){
		releaseSeed  = new int[1000];
		int startIndex = 0;
		for (int i = 0; i < releaseProb.length; i++) {
			int j = releaseProb[i];
			j *= 10;
			for (int j2 = startIndex; j2 < j + startIndex; j2++) {
				releaseSeed[j2] = i + 1;				
			}
			startIndex += j;
		}
			
	}
	public int getValueProb(int value) {
		
		if (value < 1 || value > 6)
			return 0;
		
		return valueProb[value-1];
	}
	
	public int getMultProb(int multiplier) {
		
		if (multiplier < 1 || multiplier > 3)
			return 0;
		
		return this.multProb[multiplier-1];
	}
	
	public boolean setValueProbs(int[] p) {
		this.valueProb[0] = p[0];
		this.valueProb[1] = p[1];
		this.valueProb[2] = p[2];
		this.valueProb[3] = p[3];
		this.valueProb[4] = p[4];
		this.valueProb[5] = p[5];
		
		return (p[0] + p[1] + p[2] + p[3] + p[4] + p[5] == 100);
	}
	
	public boolean setMultProbs(int[] p) {
		this.multProb[0] = p[0];
		this.multProb[1] = p[1];
		this.multProb[2] = p[2];
		
		return (p[0] + p[1] + p[2] == 100);
	}
	
	public boolean setValueProb(int p1, int p2, int p3, int p4, int p5, int p6) {
		this.valueProb[0] = p1;
		this.valueProb[1] = p2;
		this.valueProb[2] = p3;
		this.valueProb[3] = p4;
		this.valueProb[4] = p5;
		this.valueProb[5] = p6;
		
		return (p1 + p2 + p3 + p4 + p5 + p6 == 100);
	}
	
	public boolean setMultProb(int p1, int p2, int p3) {
		this.multProb[0] = p1;
		this.multProb[1] = p2;
		this.multProb[2] = p3;
		
		return (p1 + p2 + p3 == 100);
	}
	
	public boolean setReleaseProb(int p1){
		this.releaseProb[0] = p1;
		
		return (p1 == 50);
	}
	
	public void generateSeeds(){
		generateMultSeed();
		generateValueSeed();
		generateReleaseSeed();
	}
	
	public int[] getMultSeed() {
		if (multSeed == null){
			generateMultSeed();
		}
		return multSeed;
	}
	public int[] getValueSeed(){
		if(valueSeed == null){
			generateValueSeed();
		}
		return valueSeed;
	}
	
	public int[] getReleaseSeed(){
		if(releaseSeed == null){
			generateReleaseSeed();
		}
		return releaseSeed;
	}
	public int getRandomValue(){
		return getValueSeed()[(int) (Math.random()*999)];
	}
	public int getRandomMult(){
		return getMultSeed()[(int) (Math.random()*999)];
	}

	public int getRandomRelease(){
		float rand = (float) (Math.random()*999);
		System.out.println(rand);
		return (int)rand;
	}
	@Override
	public String toString() {
		return ("(" + valueProb[0] + "," + valueProb[1] + "," + valueProb[2] + "," + valueProb[3] + "," + valueProb[4] + valueProb[5] + "," +")  " +
				"(" + multProb[0] + "," + multProb[1] + "," + multProb[2] + ")" + "(" + releaseProb[0] + ")");
	}
	
}


