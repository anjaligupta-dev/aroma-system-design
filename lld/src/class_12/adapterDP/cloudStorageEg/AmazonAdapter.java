package class_12.adapterDP.cloudStorageEg;

public class AmazonAdapter implements StorageService {
    private final AmazonS3SDK amazonS3SDK;

    public AmazonAdapter(AmazonS3SDK amazonS3SDK) {
        this.amazonS3SDK = amazonS3SDK;
    }

    @Override
    public void upload(String fileName) {
        String objectKey = "invoices/2026/" + fileName;
        amazonS3SDK.putObject("documents", objectKey, fileName);
    }
}