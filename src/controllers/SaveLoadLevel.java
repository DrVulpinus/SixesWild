package controllers;

import java.io.File;
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
import entities.XMLFilter;

public class SaveLoadLevel {
private XStream xstream = null;
private File saveFile;
public ArrayList<Level> loadedLevels = new ArrayList<Level>();
public static final String LEVEL_DIRECTORY = "levels/";
public static final String FILE_EXTENSION = ".xml";
public static SaveLoadLevel sll;
private SaveLoadLevel(){
	xstream = new XStream(new StaxDriver());
	xstream.ignoreUnknownElements();
	
	
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
			
		
		FileOutputStream fos = new FileOutputStream(saveFile);	
		xstream.toXML(lvl, fos);
		fos.close();
	}
	public Level getLevel(File savedLevel){
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
