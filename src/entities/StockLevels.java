package entities;

import java.util.ArrayList;

import src.PuzzleStats;



public class StockLevels extends ArrayList<Level>{
	private ArrayList<Level> levels; 
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
	public static StockLevels stockLevel;
	public static StockLevels getInstance(){
		if (stockLevel == null){
			stockLevel = new StockLevels();
		}
		return stockLevel;
	}






	public StockLevels() {
		this.setLevels(new ArrayList<Level>());
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
		
	}


	public Level generatePuzzle1(){
		puzzle1.setName("Puzzle1");
		Probability p = new Probability();
		p.setValueProb(75,25 , 0, 0, 0, 0);
		this.puzzle1.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				puzzle1.grid.add(s);
			}

		}


		return puzzle1;
	}



	public Level generatePuzzle2(){
		puzzle2.setName("Puzzle2");
		Probability p = new Probability();
		p.setValueProb(17,17,17,17,17,15);
		this.puzzle2.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				puzzle2.grid.add(s);
			}

		}
		return puzzle2;
	}

	public Level generatePuzzle3(){
		puzzle3.setName("Puzzle3");
		Probability p = new Probability();
		p.setValueProb(15,20, 20,7,30,8);
		this.puzzle3.setProbability(p);

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				puzzle3.grid.add(s);
			}

		}
		return puzzle3;
	}

	public Level generatePuzzle4(){
		puzzle4.setName("Puzzle4");
		Probability p = new Probability();
		p.setValueProb(10,20 , 10, 30, 10, 20);
		this.puzzle4.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				puzzle4.grid.add(s);
			}

		}
		return puzzle4;
	}

	public Level generateRelease1(){
		release1.setName("Release1");
		Probability p = new Probability();
		p.setValueProb(20,10 , 10, 10, 20, 30);
		this.release1.setProbability(p);

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				release1.grid.add(s);
			}

		}
		Location location8 = new Location(0,8);
		release1.grid.getSquare(location8).setRelease(true);

		Location location7 = new Location(3,7);
		release1.grid.getSquare(location7).setRelease(true);

		Location location6 = new Location(2,1);
		release1.grid.getSquare(location6).setRelease(true);

		Location location0 = new Location(3,5);
		release1.grid.getSquare(location0).setRelease(true);

		Location location1 = new Location(8,4);
		release1.grid.getSquare(location1).setRelease(true);

		Location location2 = new Location(3,3);
		release1.grid.getSquare(location2).setRelease(true);


		Location location3 = new Location(1,5);
		release1.grid.getSquare(location3).setRelease(true);

		Location location4 = new Location(4,6);
		release1.grid.getSquare(location4).setRelease(true);

		Location location5 = new Location(0,0);
		release1.grid.getSquare(location5).setRelease(true);
		return release1;
	}

	public Level generateRelease2(){
		release2.setName("Release2");
		Probability p = new Probability();
		p.setValueProb(10,10 , 30, 10, 0, 40);
		this.release2.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				release2.grid.add(s);
			}

		}

		Location location8 = new Location(8,8);
		release2.grid.getSquare(location8).setRelease(true);

		Location location7 = new Location(7,7);
		release2.grid.getSquare(location7).setRelease(true);

		Location location6 = new Location(6,6);
		release2.grid.getSquare(location6).setRelease(true);

		Location location0 = new Location(5,5);
		release2.grid.getSquare(location0).setRelease(true);

		Location location1 = new Location(4,4);
		release2.grid.getSquare(location1).setRelease(true);

		Location location2 = new Location(3,3);
		release2.grid.getSquare(location2).setRelease(true);


		Location location3 = new Location(2,2);
		release2.grid.getSquare(location3).setRelease(true);

		Location location4 = new Location(1,1);
		release2.grid.getSquare(location4).setRelease(true);

		Location location5 = new Location(0,0);
		release2.grid.getSquare(location5).setRelease(true);
		return release2;
	}

	public Level generateRelease3(){
		release3.setName("Release3");
		Probability p = new Probability();
		p.setValueProb(20,10 , 10, 10, 20, 30);
		this.release3.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				release3.grid.add(s);
			}

		}
		Location location0 = new Location(8,8);
		release3.grid.getSquare(location0).setRelease(true);

		Location location1 = new Location(0,3);
		release3.grid.getSquare(location1).setRelease(true);

		Location location2 = new Location(5,6);
		release3.grid.getSquare(location2).setRelease(true);


		Location location3 = new Location(3,5);
		release3.grid.getSquare(location3).setRelease(true);

		Location location4 = new Location(2,7);
		release3.grid.getSquare(location4).setRelease(true);

		Location location5 = new Location(6,8);
		release3.grid.getSquare(location5).setRelease(true);
		return release3;
	}

	public Level generateRelease4(){
		release4.setName("Release4");
		Probability p = new Probability();
		p.setValueProb(10,20 , 10, 30, 10, 20);
		this.release4.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				release4.grid.add(s);
			}

		}

		Location location0 = new Location(0,0);
		release4.grid.getSquare(location0).setRelease(true);

		Location location1 = new Location(5,8);
		release4.grid.getSquare(location1).setRelease(true);

		Location location2 = new Location(2,3);
		release4.grid.getSquare(location2).setRelease(true);


		Location location3 = new Location(4,4);
		release4.grid.getSquare(location3).setRelease(true);

		Location location4 = new Location(3,7);
		release4.grid.getSquare(location4).setRelease(true);

		Location location5 = new Location(2,4);
		release4.grid.getSquare(location5).setRelease(true);
		return release4;
	}

	public Level generateElimination1(){
		elimination1.setName("Elimination1");
		Probability p = new Probability();
		p.setValueProb(10,30 ,30 , 0,20 , 10);
		this.elimination1.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				elimination1.grid.add(s);
			}

		}
		return elimination1;
	}

	public Level generateElimination2(){
		elimination2.setName("Elimination2");
		Probability p = new Probability();
		p.setValueProb(10,10 , 40, 10, 10, 20);
		this.elimination2.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				elimination2.grid.add(s);
			}

		}
		return elimination2;
	}

	public Level generateElimination3(){
		elimination3.setName("Elimination3");
		Probability p = new Probability();
		p.setValueProb(15,27 , 3, 30, 5, 20);
		this.elimination3.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				elimination3.grid.add(s);
			}

		}
		return elimination3;
	}

	public Level generateElimination4(){
		elimination4.setName("Elimination4");
		Probability p = new Probability();
		p.setValueProb(40,10 , 10, 10, 10, 20);
		this.elimination4.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				elimination4.grid.add(s);
			}

		}
		return elimination4;
	}
	public Level generateLightning1(){
		lightning1.setName("Lightning1");
		Probability p = new Probability();
		p.setValueProb(40,10 , 10, 10, 10, 20);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				lightning1.grid.add(s);
			}

		}
		return lightning1;
	}

	public Level generateLightning2(){
		lightning2.setName("Lightning2");
		Probability p = new Probability();
		p.setValueProb(10,20 , 10, 30, 10, 20);
		this.lightning1.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				lightning2.grid.add(s);
			}

		}
		return lightning2;
	}

	public Level generateLightning3(){
		lightning3.setName("Lightning3");
		Probability p = new Probability();
		p.setValueProb(40,10 , 10, 10, 10, 20);
		this.lightning3.setProbability(p);

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				lightning3.grid.add(s);
			}

		}
		return lightning3;
	}


	public Level generateLightning4(){
		lightning4.setName("Lightning4");
		Probability p = new Probability();
		p.setValueProb(17,17,17,17,17,15);
		this.lightning4.setProbability(p);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				lightning4.grid.add(s);
			}

		}

		return lightning4;
	}


	public ArrayList<Level>	generateLevels(){

		generatePuzzle1();
		getLevels().add(puzzle1);
		generateLightning1();
		getLevels().add(lightning1);
		generateElimination1();
		getLevels().add(elimination1);
		generateRelease1();
		getLevels().add(release1);
		
		generatePuzzle2();
		getLevels().add(puzzle2);
		generateLightning2();
		getLevels().add(lightning2);
		generateElimination2();
		getLevels().add(elimination2);
		generateRelease2();
		getLevels().add(release2);
		
		
		generatePuzzle3();
		getLevels().add(puzzle3);
		generateLightning3();
		getLevels().add(lightning3);
		generateElimination3();
		getLevels().add(elimination3);
		generateRelease3();
		getLevels().add(release3);
		
	

		
		generatePuzzle4();
		getLevels().add(puzzle4);
		generateLightning4();
		getLevels().add(lightning4);
		generateElimination4();
		getLevels().add(elimination4);
		generateRelease4();
		getLevels().add(release4);

		return getLevels();
	}






	public ArrayList<Level> getLevels() {
		return levels;
	}






	public void setLevels(ArrayList<Level> levels) {
		this.levels = levels;
	}
}






