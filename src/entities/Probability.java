package entities;

public class Probability {
	
	int[] valueProb;
	int[] multProb;
	
	public Probability() {
		this.valueProb = new int[6];
		this.multProb = new int[3];
		
		this.valueProb[0] = 100;
		this.valueProb[1] = 100;
		this.valueProb[2] = 100;
		this.valueProb[3] = 100;
		this.valueProb[4] = 100;
		this.valueProb[5] = 0;
		
		this.multProb[0] = 40;
		this.multProb[1] = 30;
		this.multProb[2] = 30;
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
	
	public int getTotalValueProb() {
		int sum = 0;
		
		for (int n = 0; n < 6; n++)
			sum += valueProb[n];
		
		return sum;
	}
	
	public int getTotalMultProb() {
		int sum = 0;
		
		for (int n = 0; n < 3; n++)
			sum += multProb[n];
		
		return sum;
	}
	

//	int prob1;
//	int prob2;
//	int prob3;
//	int prob4;
//	int prob5;
//	int prob6;
//	int probx1;
//	int probx2;
//	int probx3;
//	
//	public int getProb1() {
//		return prob1;
//	}
//	public void setProb1(int prob1) {
//		this.prob1 = prob1;
//	}
//	public int getProb2() {
//		return prob2;
//	}
//	public void setProb2(int prob2) {
//		this.prob2 = prob2;
//	}
//	public int getProb3() {
//		return prob3;
//	}
//	public void setProb3(int prob3) {
//		this.prob3 = prob3;
//	}
//	public int getProb4() {
//		return prob4;
//	}
//	public void setProb4(int prob4) {
//		this.prob4 = prob4;
//	}
//	public int getProb5() {
//		return prob5;
//	}
//	public void setProb5(int prob5) {
//		this.prob5 = prob5;
//	}
//	public int getProb6() {
//		return prob6;
//	}
//	public void setProb6(int prob6) {
//		this.prob6 = prob6;
//	}
//	
//	public int getProbx1(){
//		return probx1;
//	}
//	
//	public void setProbx1(int probx1){
//		this.probx1 = probx1;
//	}
//	
//	public int getProbx2(){
//		return probx2;
//	}
//	
//	public void setProbx2(int probx2){
//		this.probx2 = probx2;
//	}
//	
//	public  int getProbx3(){
//		return probx3;
//	}
//	
//	public void setProbx3(int probx3){
//		this.probx3 = probx3;
//	}
	
	@Override
	public String toString() {
		return ("(" + valueProb[0] + "," + valueProb[1] + "," + valueProb[2] + "," + valueProb[3] + "," + valueProb[4] + valueProb[5] + "," +")  " +
				"(" + multProb[0] + "," + multProb[1] + "," + multProb[2] + ")");
	}
	
}


