package task16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SavedList <T> {

    private List<T> list;
    private File file;

    public SavedList(String filePath) {
        this.list = new ArrayList<>();
        this.file = new File(filePath);

        if (file.exists()) {
            loadFromFile();
        }
    }

    private void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            list = (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addFile(T value) {
        list.add(value);
        saveFile();
    }

    private void saveFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeFile (T value) {
        list.remove(value);
        saveFile();
    }

    public T getIndexFile (int index) {
        return list.get(index);
    }

    public int sizeFile () {
        return list.size();
    }
}
