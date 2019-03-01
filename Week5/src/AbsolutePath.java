public class AbsolutePath {
	public static String ensureAbsolute(String path) {
		String currDir = System.getProperty("user.dir");
		if(path.startsWith("/"))
			return path;
		return currDir + "/" + path;
	}
	
	public static String[] absoluteSplitPath(String s) {
		return SplitPathName.splitPath(ensureAbsolute(s));
	}
	
	public static void main(String[] args) {
		String test = "/test.java";
		System.out.println(ensureAbsolute(test));
		String[] components = absoluteSplitPath(test);
		System.out.println("File: " + components[1] + " Type: " + components[3] + " [" + components[0] + "]");
	}
}