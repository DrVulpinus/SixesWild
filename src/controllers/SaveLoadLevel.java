package controllers;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import entities.Level;
import entities.XMLFilter;

public final class SaveLoadLevel {
private XStream xstream = null;
private File saveFile;
public ArrayList<Level> loadedLevels = new ArrayList<Level>();
public SaveLoadLevel(){
	xstream = new XStream(new StaxDriver());
	xstream.ignoreUnknownElements();
	
	
}
	public void saveLevel(Level lvl, String lvlName){
		saveFile  = new File(lvlName + ".xml");
		
		FileWriter writer = null;
		try {
			writer = new FileWriter(saveFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		xstream.toXML(lvl, writer);
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Level getLevel(File savedLevel){
		return (Level) xstream.fromXML(savedLevel);
	}
	ArrayList<Level> getLevels(){
		File directory = new File("/levels");
		loadedLevels.clear();
		for (File file: directory.listFiles(new XMLFilter())) {
			loadedLevels.add(getLevel(file));
		}
		return loadedLevels;
	}
	
	
}
