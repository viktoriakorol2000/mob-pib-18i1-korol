import java.io.*;

public class ShopD {
    private static final String FILENAME = "Korol";

    public static boolean isFileExists() {
        return new File(FILENAME).exists();
    }

    public static Shop readShop() throws Exception {
        try (
                FileInputStream fileInputStream = new FileInputStream(FILENAME);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream)
        ) {
            return (Shop) objectInputStream.readObject();
        }
    }

    public static void writeShop(Shop shop) throws Exception {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(FILENAME);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream)
        ) {
            objectOutputStream.writeObject(shop);
        }
    }
}
