import java.io.*;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws IOException {
        LocalTime myObj = LocalTime.now();
        StringBuilder log = new StringBuilder();

        File temp = new File("I://Games/temp");
        if (temp.mkdir()) {
            log.append(myObj + "  Папка temp создана");
            log.append("\r\n");
            System.out.println(myObj + " Папка temp создана");
        } else {
            log.append(myObj + " Ошибка при создании папки temp");
            log.append("\r\n");
            System.out.println(myObj + " Ошибка при создании папки temp");
        }

        File tempFile = new File("I://Games/temp/temp.txt");
        try {
            if (tempFile.createNewFile()) {
                log.append(myObj + "  Файл temp/temp.txt создан");
                log.append("\r\n");
                System.out.println(myObj + " Файл temp/temp.txt создан");
            } else {
                System.out.println(myObj + " Ошибка при создании файла temp/temp.txt");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File src = new File("I://Games/src");
        if (src.mkdir()) {
            log.append(myObj + "  Папка scr создана");
            log.append("\r\n");
            System.out.println(myObj + " Папка scr создана");
        } else {
            log.append(myObj + "  Ошибка при создании папки scr");
            log.append("\r\n");
            System.out.println(myObj + " Ошибка при создании папки scr");
        }

        File res = new File("I://Games/res");
        if (res.mkdir()) {
            log.append(myObj + "  Папка res создана");
            log.append("\r\n");
            System.out.println(myObj + " Папка res создана");
        } else {
            log.append(myObj + "  Ошибка при создании папки res");
            log.append("\r\n");
            System.out.println(myObj + " Ошибка при создании папки res");
        }

        File savegames = new File("I://Games/savegames");
        if (savegames.mkdir()) {
            log.append(myObj + "  Папка savegames создана");
            log.append("\r\n");
            System.out.println(myObj + " Папка savegames создана");
        } else {
            log.append(myObj + "  Ошибка при создании папки savegames");
            log.append("\r\n");
            System.out.println(myObj + " Ошибка при создании папки savegames");
        }

        File main = new File("I://Games/src/main");
        if (main.mkdir()) {
            log.append(myObj + "  Папка src/main создана");
            log.append("\r\n");
            System.out.println(myObj + " Папка src/main создана");
        } else {
            log.append(myObj + "  Ошибка при создании папки src/main");
            log.append("\r\n");
            System.out.println(myObj + " Ошибка при создании папки src/main");
        }

        File test = new File("I://Games/src/test");
        if (test.mkdir()) {
            log.append(myObj + "  Папка src/test создана");
            log.append("\r\n");
            System.out.println(myObj + " Папка src/test создана");
        } else {
            log.append(myObj + "  Ошибка при создании папки src/test");
            log.append("\r\n");
            System.out.println(myObj + " Ошибка при создании папки src/test");
        }

        File drawables = new File("I://Games/res/drawables");
        if (drawables.mkdir()) {
            log.append(myObj + "  Папка res/drawables создана");
            log.append("\r\n");
            System.out.println(myObj + " Папка res/drawables создана");
        } else {
            log.append(myObj + "  Ошибка при создании папки res/drawables");
            log.append("\r\n");
            System.out.println(myObj + " Ошибка при создании папки res/drawables");
        }

        File vectors = new File("I://Games/res/vectors");
        if (vectors.mkdir()) {
            log.append(myObj + "  Папка res/vectors создана");
            log.append("\r\n");
            System.out.println(myObj + " Папка res/vectors создана");
        } else {
            log.append(myObj + "  Ошибка при создании папки res/vectors");
            log.append("\r\n");
            System.out.println(myObj + " Ошибка при создании папки res/vectors");
        }

        File icons = new File("I://Games/res/icons");
        if (icons.mkdir()) {
            log.append(myObj + "  Папка res/icons создана");
            System.out.println(myObj + " Папка res/icons создана");
        } else {
            log.append(myObj + "  Ошибка при создании папки res/icons");
            System.out.println(myObj + " Ошибка при создании папки res/icons");
        }

        try (FileWriter writer = new FileWriter("I://Games/temp/temp.txt", false)) {
            writer.write(log.toString());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}