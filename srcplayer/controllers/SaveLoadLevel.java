package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import entities.Level;
import entities.LevelStats;
import entities.LevelType;
import entities.PuzzleStats;
import entities.XMLFilter;

/** 
 * Controls the saving and loading of an individual level in the directory.
 * @author Richard Eberheim
 *
 */
public class SaveLoadLevel {
private XStream xstream = null;
public ArrayList<Level> loadedLevels = new ArrayList<Level>();
public static final String LEVEL_DIRECTORY = "levels/";
public static final String FILE_EXTENSION = ".xml";
public static SaveLoadLevel sll;
private SaveLoadLevel(){
	xstream = new XStream(new StaxDriver());
	xstream.ignoreUnknownElements();
	xstream.allowTypeHierarchy(LevelStats.class);
	
	
}
public static SaveLoadLevel getInstance(){
	if (sll == null){
		sll = new SaveLoadLevel();
	}
	return sll;
}

	public void saveLevel(Level lvl) throws Exception{
		saveLevel(lvl,lvl.getName());
	}
	public File saveTempLevel(Level lvl, String name) throws IOException{
		File tempFile;
		tempFile = new File(File.createTempFile(name, ".xml").getAbsolutePath());
		System.out.println(tempFile.getAbsolutePath());
		FileOutputStream fos = new FileOutputStream(tempFile);	
		xstream.toXML(lvl, fos);
		return tempFile;		
	}
	public Level getTempLevel(File tempFile) throws IOException{
		if (!tempFile.exists()){
			System.err.println("File not found");
		}
		System.out.println(tempFile.getAbsolutePath());
		return (Level) xstream.fromXML(tempFile);
	}

	public void saveLevel(Level lvl, String lvlName) throws Exception{
		File saveLevelFile  = new File(LEVEL_DIRECTORY + lvlName + FILE_EXTENSION);
		File saveDir = new File(LEVEL_DIRECTORY);
		if (!saveDir.exists()){
			if (!saveDir.mkdirs()) {
				throw new Exception("Unable to make directories");
			}			
		}
		else{
			System.out.println("File exists");
		}
		if (saveLevelFile.canWrite()){
			System.out.println("File is ready to be written to");
		}
			
		
		FileOutputStream fos = new FileOutputStream(saveLevelFile);	
		xstream.toXML(lvl, fos);
		fos.close();
	}
	public Level getLevel(File savedLevel){
		xstream = new XStream(new StaxDriver());
		xstream.ignoreUnknownElements();
		return (Level) xstream.fromXML(savedLevel);
	}
	public Level getLevel(Level savedLevel){
		File savedFile = new File(LEVEL_DIRECTORY + savedLevel.getName() + FILE_EXTENSION);
		return getLevel(savedFile);
	}
	public ArrayList<Level> getLevels(){
		File directory = new File(LEVEL_DIRECTORY);
		loadedLevels.clear();
		for (File file: directory.listFiles(new XMLFilter())) {
			loadedLevels.add(getLevel(file));
		}
		return loadedLevels;
	}
	
	
}
