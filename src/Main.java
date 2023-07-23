import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        String globalPath = "I://Games/";

        ArrayList<String> pathsFolders = new ArrayList<String>();
        pathsFolders.add("I://Games/temp");
        pathsFolders.add("I://Games/src");
        pathsFolders.add("I://Games/res");
        pathsFolders.add("I://Games/savegames");
        pathsFolders.add("I://Games/src/main");
        pathsFolders.add("I://Games/src/test");
        pathsFolders.add("I://Games/res/drawables");
        pathsFolders.add("I://Games/res/vectors");
        pathsFolders.add("I://Games/res/icons");

        ArrayList<String> pathsFiles = new ArrayList<String>();
        pathsFiles.add("I://Games/temp/temp.txt");

        LocalTime timestamp = LocalTime.now();
        StringBuilder log = new StringBuilder();

        pathsFolders.forEach((n) -> {
            log.append(createDirectory(n, timestamp));
        });

        pathsFiles.forEach((n) -> {
            log.append(createFile(n, timestamp));
        });

        printLog(log);

    }

    public static void printLog(StringBuilder log) {
        try (FileWriter writer = new FileWriter("I://Games/temp/temp.txt", false)) {
            writer.write(log.toString());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String createDirectory(String path, LocalTime timestamp) {
        String result;
        File folder = new File(path);
        if (folder.mkdir()) {
            result = timestamp + "  Папка " + path + " создана" + "\r\n";
        } else {
            result = timestamp + " Ошибка при создании папки" + path + "\r\n";
        }
        return result;
    }

    public static String createFile(String path, LocalTime timestamp) {
        String result;
        File tempFile = new File(path);
        try {
            if (tempFile.createNewFile()) {
                result = timestamp + "  Файл  " + path + " создан";
            } else {
                result = timestamp + " Ошибка при создании файла " + path;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

}