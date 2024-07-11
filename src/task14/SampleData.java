package task14;

import java.io.*;
import java.util.Date;
import java.util.Objects;

public class SampleData {
    static final long serialVersionUID = 132706691457162967L;

    String name;
    int value;
    Date date;

    public SampleData(String name, int value, Date date) {
        this.name = name;
        this.value = value;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleData that = (SampleData) o;
        return value == that.value &&
                Objects.equals(name, that.name) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, date);
    }

    @Override
    public String toString() {
        return "SampleData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", date=" + date +
                '}';
    }

    public static SampleData deserialize (String filePath) {
        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(filePath))){
            return (SampleData) os.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void serialize (SampleData data, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
    }
}

static class Main {
    public static void main(String[] args) {
        SampleData sampleData = new SampleData("Test", 1408, new Date());
        String filePath = "sampledata.ser";
        serialize(sampleData, filePath);
        SampleData data = deserialize(filePath);
        System.out.println(sampleData);
        System.out.println(data);
        System.out.println(sampleData.equals(data));

    }}
}



