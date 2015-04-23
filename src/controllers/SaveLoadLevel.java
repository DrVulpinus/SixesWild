package controllers;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;

import entities.Level;

public final class SaveLoadLevel {
private XStream xstream = null;
private FileWriter writer;
private FileReader reader;
public SaveLoadLevel(String levelName){
	xstream = new XStream();
	 try {
		writer = new FileWriter(levelName + ".xml");
		reader = new FileReader(levelName + ".xml");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public void saveLevel(Level lvl){
		xstream.toXML(lvl, writer);
	}
	public Level getLevel(){
		return (Level) xstream.fromXML(reader);
	}
	
}
