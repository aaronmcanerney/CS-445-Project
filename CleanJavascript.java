public class CleanJavascript {

    public static void main(String[] args){
        System.out.println(args[0]
                .replaceAll("<", "&lt;")
                .replaceAll(">", "\\$gt;")
                .replaceAll("\'", "\\&quot;"));
    }
}
