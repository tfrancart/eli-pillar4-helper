package eu.europa.op.eli.pillar4.helper.sitemap2atom;

import java.io.File;
import java.net.URL;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(
		commandDescription = "Generates a Pillar 4 atom feed from a Pillar 4 sitemap file."
)
public class ArgumentsSitemap2Atom {

	@Parameter(
			names = { "-i", "--sitemapInput" },
			description = "Path to the input Sitemap file",
			required = true
	)
	private File sitemapInput;
	
	@Parameter(
			names = { "-su", "--sitemapBaseUrl" },
			description = "Base URL of every ELI listed in the sitemap file. All ELIs in the sitemap MUST begin by this base URL.",
			required = true
	)
	private URL sitemapBaseUrl;
	
	@Parameter(
			names = { "-ao", "--atomOutput" },
			description = "Path to the output Atom feed",
			required = true
	)
	private File atomOutput;
	
	@Parameter(
			names = { "-ah", "--atomHeader" },
			description = "Path to the input Atom 'skeleton' file containing the Atom header information",
			required = true
	)
	private File atomHeader;
	
	@Parameter(
			names = { "-ad", "--atomDays" },
			description = "The number of days that the Atom feed should contain. Defaults to 60.",
			required = false
	)
	private int atomDays = 60;
	
	
	public File getSitemapInput() {
		return sitemapInput;
	}

	public void setSitemapInput(File sitemapInput) {
		this.sitemapInput = sitemapInput;
	}
	
	public URL getSitemapBaseUrl() {
		return sitemapBaseUrl;
	}

	public void setSitemapBaseUrl(URL sitemapBaseUrl) {
		this.sitemapBaseUrl = sitemapBaseUrl;
	}

	public File getAtomOutput() {
		return atomOutput;
	}
	
	public void setAtomOutput(File atomOutput) {
		this.atomOutput = atomOutput;
	}

	public File getAtomHeader() {
		return atomHeader;
	}

	public void setAtomHeader(File atomHeader) {
		this.atomHeader = atomHeader;
	}

	public int getAtomDays() {
		return atomDays;
	}

	public void setAtomDays(int atomDays) {
		this.atomDays = atomDays;
	}

	@Override
	public String toString() {
		return "ArgumentsSitemap2Atom [sitemapInput=" + sitemapInput + ", sitemapBaseUrl=" + sitemapBaseUrl
				+ ", atomOutput=" + atomOutput + ", atomHeader=" + atomHeader + ", atomDays=" + atomDays + "]";
	}

	

	
}
