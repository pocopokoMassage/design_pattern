import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileProperties extends Properties implements FileIO
{
	Reader fileReader;
	Writer fileWriter;
	static String writeComments;
	
	public FileProperties()
	{
		writeComments = "Wrote to file";
	}
	
	@Override
	public void readFromFile(String filename) throws IOException
	{
		fileReader = new FileReader(filename);
		super.load(fileReader);
	}
	
	@Override
	public void writeToFile(String filename) throws IOException
	{
		fileWriter = new FileWriter(filename);
		super.store(fileWriter, writeComments);
	}
	
	@Override
	public void setValue(String key, String value)
	{
		super.setProperty(key, value);
	}
	
	@Override
	public String getValue(String key)
	{
		return super.getProperty(key);
	}
}
