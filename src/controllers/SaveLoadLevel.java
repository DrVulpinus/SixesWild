package controllers;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import entities.Level;

public final class SaveLoadLevel {
private XStream xstream = null;
private File saveFile;
private SaveLoadLevel(){
	xstream = new XStream(new StaxDriver());
	xstream.ignoreUnknownElements();
	
	
}
public static SaveLoadLevel getInstance(){
	return new SaveLoadLevel();
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
	public Level getLevel(){
		return (Level) xstream.fromXML(saveFile);
	}
	
}
