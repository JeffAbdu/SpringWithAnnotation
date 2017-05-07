package script;

public class UnixScript implements ICommandLineScript {

	public String viewDirectoryContents(String dir) {
		return "dir " + dir;
	}

}
