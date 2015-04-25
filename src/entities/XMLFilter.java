package entities;

import java.io.File;
import java.io.FilenameFilter;

import javax.swing.filechooser.FileFilter;

public class XMLFilter extends FileFilter implements FilenameFilter {

	@Override
	public boolean accept(File arg0) {
		if (arg0.getName().endsWith(".xml")){
			return true;
		}
		return false;
	}

	@Override
	public String getDescription() {
		return "XML Game Level Files";
	}

	@Override
	public boolean accept(File dir, String name) {
		if (name.endsWith(".xml")){
			return true;
		}
		return false;
	}

}
