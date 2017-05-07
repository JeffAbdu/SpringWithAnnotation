package script;

public class ScriptLoaderDemoClass {

	private ICommandLineScript script;

	public ICommandLineScript getScript() {
		return script;
	}

	public void setScript(ICommandLineScript script) {
		this.script = script;
	}

	public ScriptLoaderDemoClass(){}
	
	public void loadScript(){
		
		System.out.println("Loading script of type: " + script.getClass());
		System.out.println(script.viewDirectoryContents("myDir"));
		
	}
	
	
}
