package eu.europa.op.eli.pillar4.helper.csv2pillar4;

import java.io.File;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(
		commandDescription = "Generates a Pillar 4 sitemap and Atom feed from a CSV file."
)
public class ArgumentsCsv2Pillar4 {

	@Parameter(
			names = { "-i", "--input" },
			description = "Path to the input CSV file",
			required = true
	)
	private File input;
	
	@Parameter(
			names = { "-o", "--output" },
			description = "Path to the output directory",
			required = true
	)
	private File output;
	
	@Parameter(
			names = { "-u", "--baseurl" },
			description = "Base URL",
			required = true
	)
	private String baseurl;
	
	@Parameter(
			names = { "-uset", "--baseurlset" },
			description = "Base URL",
			required = false
	)
	private String baseurlset;

	public File getInput() {
		return input;
	}

	public void setInput(File input) {
		this.input = input;
	}

	public File getOutput() {
		return output;
	}

	public void setOutput(File output) {
		this.output = output;
	}
	
	public String getbaseurl() {
		return baseurl;
	}
	
	public void setbaseurl(String baseurl) {
		this.baseurl = baseurl;
	}
	
	public String getbaseurlset() {
		return baseurlset;
	}
	
	public void setbaseurlset(String baseurlset) {
		this.baseurlset = baseurlset;
	}
	
	
	@Override
	public String toString() {
		return "ArgumentsCsv2SitemapAndAtom [input=" + input + ", output=" + output + ",baseurl="+ baseurl +",baseurlset=" + baseurlset + "]";
	}
	
	
}
