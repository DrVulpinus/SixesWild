package entities;

public class Probability {
	
	int[] valueProb;
	int[] multProb;
	
	public Probability() {
		this.valueProb = new int[5];
		this.multProb = new int[3];
		
		this.valueProb[0] = 20;
		this.valueProb[1] = 20;
		this.valueProb[2] = 20;
		this.valueProb[3] = 20;
		this.valueProb[4] = 20;
		
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
	
	public boolean setValueProb(int p1, int p2, int p3, int p4, int p5) {
		this.valueProb[0] = p1;
		this.valueProb[1] = p2;
		this.valueProb[2] = p3;
		this.valueProb[3] = p4;
		this.valueProb[4] = p5;
		
		return (p1 + p2 + p3 + p4 + p5 == 100);
	}
	
	public boolean setValueProb(int p1, int p2, int p3) {
		this.multProb[0] = p1;
		this.multProb[1] = p2;
		this.multProb[2] = p3;
		
		return (p1 + p2 + p3 == 100);
	}
	
	public int getTotalValueProb() {
		int sum = 0;
		
		for (int n = 0; n < 5; n++)
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
	
}
