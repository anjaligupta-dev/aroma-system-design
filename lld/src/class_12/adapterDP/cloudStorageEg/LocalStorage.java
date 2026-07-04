package class_12.adapterDP.cloudStorageEg;

public class LocalStorage implements StorageService {
    @Override
    public void upload(String fileName) {
        System.out.println("Uploading " + fileName + " to Local Storage");
    }
}
