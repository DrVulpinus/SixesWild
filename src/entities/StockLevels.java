package entities;

import java.util.ArrayList;

import src.PuzzleStats;



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
puzzle1.setName("Puzzle1");
this.p.setValueProb(75,25 , 0, 0, 0, 0);
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
		this.p.setValueProb(17,17,17,17,17,15);
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
		this.p.setValueProb(15,20, 20,7,30,8);
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
		this.p.setValueProb(10,20 , 10, 30, 10, 20);
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
		this.p.setValueProb(20,10 , 10, 10, 20, 30);
				this.release1.setProbability(p);
		
			for (int row = 0; row < 9; row++) {
				for (int col = 0; col < 9; col++) {
					
						Square s = new Square(new Location(row, col));
						release1.grid.add(s);
					}

				}
			return release1;
			}

	public Level generateRelease2(){
		release2.setName("Release2");
		this.p.setValueProb(10,10 , 30, 10, 0, 40);
				this.release2.setProbability(p);
			for (int row = 0; row < 9; row++) {
				for (int col = 0; col < 9; col++) {
					
						Square s = new Square(new Location(row, col));
						release2.grid.add(s);
					}

				}
			return release2;
			}
	
	public Level generateRelease3(){
		release3.setName("Release3");
		this.p.setValueProb(20,10 , 10, 10, 20, 30);
				this.release3.setProbability(p);
			for (int row = 0; row < 9; row++) {
				for (int col = 0; col < 9; col++) {
					
						Square s = new Square(new Location(row, col));
						release3.grid.add(s);
					}

				}
			return release3;
			}
	
	public Level generateRelease4(){
		release4.setName("Release4");
		this.p.setValueProb(10,20 , 10, 30, 10, 20);
				this.release4.setProbability(p);
			for (int row = 0; row < 9; row++) {
				for (int col = 0; col < 9; col++) {
					
						Square s = new Square(new Location(row, col));
						release4.grid.add(s);
					}

				}
			return release4;
			}
	
	public Level generateElimination1(){
		elimination1.setName("Elimination1");
		this.p.setValueProb(10,30 ,30 , 0,20 , 10);
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
		this.p.setValueProb(10,10 , 40, 10, 10, 20);
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
		this.p.setValueProb(15,27 , 3, 30, 5, 20);
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
		this.p.setValueProb(40,10 , 10, 10, 10, 20);
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
		this.p.setValueProb(10,20 , 10, 30, 10, 20);
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
		this.p.setValueProb(40,10 , 10, 10, 10, 20);
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
		this.p.setValueProb(17,17,17,17,17,15);
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





