package entities;

import java.util.ArrayList;



public class StockLevels extends ArrayList<Level>{
	ArrayList<Level> levels; 
	Level puzzle1;
	Level puzzle2;
	Level puzzle3;
	Level puzzle4;
	Level elimination1;
	Level elimination2;
	Level elimination3;
	Level elimination4;
	Level release1;
	Level release2;
	Level release3;
	Level release4;
	Level lightning1;
	Level lightning2;
	Level lightning3;
	Level lightning4;
	Square square1;
	Square square2;
	Square square3;
	Square square4;
	Square square5;
	Square square6;
	Probability p;
	public static StockLevels stockLevel;
	public static StockLevels getInstance(){
		if (stockLevel == null){
			stockLevel = new StockLevels();
		}
		return stockLevel;
	}
	


	


	public StockLevels() {
		this.levels = new ArrayList<Level>();
		this.puzzle1 = new Level(LevelType.PUZZLE);
		this.puzzle2 = new Level(LevelType.PUZZLE);
		this.puzzle3 = new Level(LevelType.PUZZLE);
		this.puzzle4 = new Level(LevelType.PUZZLE);

		this.elimination1 = new Level(LevelType.ELIMINATION);
		this.elimination2 = new Level(LevelType.ELIMINATION);
		this.elimination3 = new Level(LevelType.ELIMINATION);
		this.elimination4 = new Level(LevelType.ELIMINATION);

		this.release1 = new Level(LevelType.RELEASE);
		this.release2 = new Level(LevelType.RELEASE);
		this.release3 = new Level(LevelType.RELEASE);
		this.release4 = new Level(LevelType.RELEASE);

		this.lightning1 = new Level(LevelType.LIGHTNING);
		this.lightning2 = new Level(LevelType.LIGHTNING);
		this.lightning3 = new Level(LevelType.LIGHTNING);
		this.lightning4 = new Level(LevelType.LIGHTNING);

		this.square1 = new Square();
		this.p = new Probability();
	}

	public Level generatePuzzle1(){
		this.puzzle1.setName("Puzzle1");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(75,25 , 0, 0, 0, 0);
		this.puzzle1.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.puzzle1.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.puzzle1.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.puzzle1.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.puzzle1.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.puzzle1.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.puzzle1.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.puzzle1.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.puzzle1.grid.add(square);
			y7++;
		}
		return puzzle1;
	}

	public Level generatePuzzle2(){
		this.puzzle2.setName("Puzzle2");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(17,17,17,17,17,15);
		this.puzzle2.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.puzzle1.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.puzzle2.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.puzzle2.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.puzzle2.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.puzzle2.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.puzzle2.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.puzzle2.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.puzzle2.grid.add(square);
			y7++;
		}
		return puzzle2;
	}

	public Level generatePuzzle3(){
		this.puzzle3.setName("Puzzle3");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(15,20, 20,7,30,8);
		this.puzzle3.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.puzzle3.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.puzzle3.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.puzzle3.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.puzzle3.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.puzzle3.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.puzzle3.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.puzzle3.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.puzzle3.grid.add(square);
			y7++;
		}
		return puzzle3;
	}


	public Level generatePuzzle4(){
		this.puzzle4.setName("Puzzle4");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(10,20 , 10, 30, 10, 20);
		this.puzzle4.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.puzzle4.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.puzzle4.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.puzzle4.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.puzzle4.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.puzzle4.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.puzzle4.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.puzzle4.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.puzzle4.grid.add(square);
			y7++;
		}
		return puzzle4;
	}

	public Level generateElimination1(){
		this.elimination1.setName("Elimination1");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(10,30 ,30 , 0,20 , 10);
		this.elimination1.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.elimination1.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.elimination1.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.elimination1.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.elimination1.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.elimination1.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.elimination1.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.elimination1.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.elimination1.grid.add(square);
			y7++;
		}
		return elimination1;
	}


	public Level generateElimination2(){
		this.elimination2.setName("Elimination2");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(10,10 , 40, 10, 10, 20);
		this.elimination2.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.elimination2.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.elimination2.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.elimination2.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.elimination2.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.elimination2.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.elimination2.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.elimination2.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.elimination2.grid.add(square);
			y7++;
		}
		return elimination2;
	}

	public Level generateElimination3(){
		this.elimination3.setName("Elimination3");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(15,27 , 3, 30, 5, 20);
		this.elimination3.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.elimination3.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.elimination3.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.elimination3.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.elimination3.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.elimination3.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.elimination3.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.elimination3.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.elimination3.grid.add(square);
			y7++;
		}
		return elimination3;
	}

	public Level generateElimination4(){
		this.elimination4.setName("Elimination4");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(40,10 , 10, 10, 10, 20);
		this.elimination4.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.elimination4.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.elimination4.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.elimination4.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.elimination4.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.elimination4.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.elimination4.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.elimination4.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.elimination4.grid.add(square);
			y7++;
		}
		return elimination4;
	}

	public Level generateRelease1(){
		this.release1.setName("Release1");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(20,10 , 10, 10, 20, 30);
		this.release1.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.release1.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.release1.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.release1.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.release1.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.release1.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.release1.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.release1.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.release1.grid.add(square);
			y7++;
		}
		return release1;
	}

	public Level generateRelease2(){
		this.release2.setName("Release2");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(10,10 , 30, 10, 0, 40);
		this.release2.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.release2.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.release2.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.release2.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.release2.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.release2.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.release2.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.release2.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.release2.grid.add(square);
			y7++;
		}
		return release2;
	}

	public Level generateRelease3(){
		this.release3.setName("Release3");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(20,10 , 10, 10, 20, 30);
		this.release3.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.release3.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.release3.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.release3.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.release3.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.release3.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.release3.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.release3.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.release3.grid.add(square);
			y7++;
		}
		return release3;
	}

	public Level generateRelease4(){
		this.release4.setName("Release4");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(10,20 , 10, 30, 10, 20);
		this.release4.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.release4.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.release4.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.release4.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.release4.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.release4.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.release4.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.release4.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.release4.grid.add(square);
			y7++;
		}
		return release4;
	}

	public Level generateLightning1(){
		this.lightning1.setName("Lightning1");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(10,20 , 10, 30, 10, 20);
		this.lightning1.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.lightning1.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.lightning1.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.lightning1.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.lightning1.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.lightning1.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.lightning1.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.lightning1.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.lightning1.grid.add(square);
			y7++;
		}
		return lightning1;
	}

	public Level generateLightning2(){
		this.lightning2.setName("Lightning2");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(20,10 , 10, 10, 20, 30);
		this.lightning2.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.lightning2.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.lightning2.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.lightning2.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.lightning2.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.lightning2.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.lightning2.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.lightning2.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.lightning2.grid.add(square);
			y7++;
		}
		return lightning2;
	}

	public Level generateLightning3(){
		this.lightning3.setName("Lightning3");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(40,10 , 10, 10, 10, 20);
		this.lightning3.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.lightning3.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.lightning3.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.lightning3.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.lightning3.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.lightning3.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.lightning3.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.lightning3.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.lightning3.grid.add(square);
			y7++;
		}
		return lightning3;
	}

	public Level generateLightning4(){
		this.lightning4.setName("Lightning4");

		int i0;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;


		int x0=0;
		int y0=0;

		int y1=0;
		int y2=0;
		int y3=0;
		int y4=0;
		int y5=0;
		int y6=0;
		int y7=0;

		int x1=1;
		int x2=2;
		int x3=3;
		int x4=4;
		int x5=5;
		int x6=6;
		int x7=7;

		this.p.setValueProb(17,17,17,17,17,15);
		this.lightning4.setProbability(p);
		// adding first column
		for(i0=0; i0<=9; i0++){

			Location location = new Location(x0,y0);
			Square square =new Square(location);
			this.lightning4.grid.add(square);
			y0++;
		}

		// adding second column
		for(i1 =0; i1<=9; i1++){
			Location location = new Location(x1,y1);
			Square square =new Square(location);
			this.lightning4.grid.add(square);
			y1++;
		}
		// adding 3rd column
		for(i2 =0; i2<=9; i2++){
			Location location = new Location(x2,y2);
			Square square =new Square(location);
			this.lightning4.grid.add(square);
			y2++;
		}
		//adding 4th column
		for(i3 =0; i3<=9; i3++){
			Location location = new Location(x3,y3);
			Square square =new Square(location);
			this.lightning4.grid.add(square);
			y3++;
		}
		//adding 5th column
		for(i4 =0; i4<=9; i4++){
			Location location = new Location(x4,y4);
			Square square =new Square(location);
			this.lightning4.grid.add(square);
			y4++;
		}

		//adding 6th column
		for(i5 =0; i5<=9; i5++){
			Location location = new Location(x5,y5);
			Square square =new Square(location);
			this.lightning4.grid.add(square);
			y5++;
		}
		//adding 7th column
		for(i6 =0; i6<=9; i6++){
			Location location = new Location(x6,y6);
			Square square =new Square(location);
			this.lightning4.grid.add(square);
			y6++;
		}
		// adding 8th column
		for(i7 =0; i7<=9; i7++){
			Location location = new Location(x7,y7);
			Square square =new Square(location);
			this.lightning4.grid.add(square);
			y7++;
		}
		return lightning4;
	}


	public ArrayList<Level>	generateLevels(){

		generatePuzzle1();
		levels.add(puzzle1);
		generateRelease1();
		levels.add(release1);
		generateElimination1();
		levels.add(elimination1);
		generateLightning1();
		levels.add(lightning1);
		
		generateLightning2();
		levels.add(lightning2);
		generateElimination2();
		levels.add(elimination2);
		generateRelease2();
		levels.add(release2);
		generatePuzzle2();
		levels.add(puzzle2);
		
		generateRelease3();
		levels.add(release3);
		generateLightning3();
		levels.add(lightning3);
		generateElimination3();
		levels.add(elimination3);
		generatePuzzle3();
		levels.add(puzzle3);
	
		generatePuzzle4();
		levels.add(puzzle4);
		generateRelease4();
		levels.add(release4);
		generateElimination4();
		levels.add(elimination4);
		generateLightning4();
		levels.add(lightning4);

		return levels;
	}
}






