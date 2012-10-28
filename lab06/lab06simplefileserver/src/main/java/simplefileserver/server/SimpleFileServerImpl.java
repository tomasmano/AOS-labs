package simplefileserver.server;

import edu.tomy.lab05.InMemoryDB;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

/**
 *
 * @author Tomas Mano <tomasmano@gmail.com>
 */
class SimpleFileServerImpl implements SimpleFileServer {

    public SimpleFileServerImpl() {
    }

    public String deleteFile(String fileName) throws NoSuchFileException_Exception {
        return InMemoryDB.deleteFile(fileName).toString();
    }

    public BinaryFile getFile(String fileName) throws NoSuchFileException_Exception {
        File required = InMemoryDB.getFile(fileName);
        return new BinaryFile(new DataHandler(new FileDataSource(required)));
    }

    public void putFile(String filename, BinaryFile fileFromClient) {
        boolean doOverwriting = InMemoryDB.containsFile(filename);
        if (doOverwriting) {
            try {
                deleteFile(filename);
            } catch (NoSuchFileException_Exception ignored) {
            }
        }
        doSaveFileRoutine(filename, fileFromClient);
    }

    public StringArray listFiles(BigInteger outputSize) {
        Collection<String> fileList = InMemoryDB.listFiles();
        int outputSizeInteger = new Integer(outputSize.toString());
        if (fileList.size() > outputSizeInteger) {
            List fitToSize = new ArrayList(fileList);
            fitToSize.subList(outputSizeInteger, fitToSize.size()).clear();
            return new StringArray(fitToSize);
        }
        return new StringArray(new ArrayList<String>(fileList));
    }

    public String postFile(String filename, BinaryFile file) throws NoSuchFileException_Exception {
        boolean overwrite = InMemoryDB.containsFile(filename);
        if (overwrite) {
            throw new NoSuchFileException_Exception("Cannot save file " + filename + ". File with this name already exists.");
        }
        doSaveFileRoutine(filename, file);
        return "Created new file.";
    }

    private void doSaveFileRoutine(String filename, BinaryFile file) {
        try {
            File newFile = new File(filename);
            FileOutputStream out = new FileOutputStream(newFile);
            file.getFile().writeTo(out);
            InMemoryDB.saveFile(filename, newFile);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) throws NoSuchFileException_Exception {
//        SimpleFileServerImpl s = new SimpleFileServerImpl();
//        BinaryFile f = s.getFile("sailor.png");
////        s.deleteFile("sailor.png");
////        System.out.println(f);
////        File required = new File("/home/tomy/Pictures/simpledesktops/deer.png");
////        BinaryFile bf = new BinaryFile(new DataHandler(new FileDataSource(required)));
////        s.postFile("deer.png", bf);
////        System.out.println(s.listFiles(new BigInteger("99")));
//    }
}
