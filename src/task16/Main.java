package task16;


public class Main {
    public static void main(String[] args) {
        SavedList <String> savedList = new SavedList <> ("saved_file");
        savedList.addFile("Java");
        savedList.addFile("Language");
        System.out.println(savedList);

    }
}



