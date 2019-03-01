public class SplitPathName {
	public static String[] splitPath(String s) {
		String[] comps = new String[4];
		comps[0] = s.substring(0, s.lastIndexOf('/') + 1);
		comps[1] = s.substring(s.lastIndexOf('/') + 1, s.length());
		if(s.indexOf('.') > -1) {
			comps[2] = s.substring(s.lastIndexOf('/') + 1, s.lastIndexOf('.'));
			comps[3] = s.substring(s.lastIndexOf('.'), s.length());
		} else {
			comps[2] = s.substring(s.lastIndexOf('/') + 1, s.length());
			comps[3] = "";
		}
		return comps;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			String[] components = splitPath(args[i]);
			System.out.println("File: " + components[1] + " Type: " + components[3] + " [" + components[0] + "]");
		}
	}
}