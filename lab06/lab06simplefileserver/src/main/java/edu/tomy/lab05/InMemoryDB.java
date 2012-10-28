package edu.tomy.lab05;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import simplefileserver.server.NoSuchFileException_Exception;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
public class InMemoryDB {

    private static final Map<String, File> fileDB = new HashMap<String, File>();

    static {
        initDB();
    }

    private static void initDB() {
        fileDB.put("monalisa.png", new File("/home/tomy/NetBeansProjects/AOS-labs/lab06/lab06simplefileserver/src/main/resources/monalisa.png"));
        fileDB.put("sailor.png", new File("/home/tomy/NetBeansProjects/AOS-labs/lab06/lab06simplefileserver/src/main/resources/sailor.png"));
        fileDB.put("snake.png", new File("/home/tomy/NetBeansProjects/AOS-labs/lab06/lab06simplefileserver/src/main/resources/snake.png"));
        fileDB.put("solar.png", new File("/home/tomy/NetBeansProjects/AOS-labs/lab06/lab06simplefileserver/src/main/resources/solar.png"));
    }

    public static boolean containsFile(String inspected) {
        return fileDB.containsKey(inspected);
    }

    public static File getFile(String fileName) throws NoSuchFileException_Exception {
        boolean exist = InMemoryDB.containsFile(fileName);
        if (!exist) {
            throw new NoSuchFileException_Exception("No file with name " + fileName);
        }
        return fileDB.get(fileName);
    }

    public static File deleteFile(String fileName) throws NoSuchFileException_Exception {
        boolean exist = InMemoryDB.containsFile(fileName);
        if (!exist) {
            throw new NoSuchFileException_Exception("No file with name " + fileName);
        }
        return fileDB.remove(fileName);
    }

    public static File saveFile(String name, File file) {
        return fileDB.put(name, file);
    }

    public static Collection<String> listFiles() {
        return Collections.unmodifiableCollection(fileDB.keySet());
    }

    public static void main(String[] args) {
        boolean test = containsFile("sailor.png");
        System.out.println(test);
    }
}
