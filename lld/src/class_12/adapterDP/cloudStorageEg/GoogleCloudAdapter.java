package class_12.adapterDP.cloudStorageEg;

public class GoogleCloudAdapter implements StorageService {
    private final GoogleCloudSDK googleCloudSDK;

    public GoogleCloudAdapter(GoogleCloudSDK googleCloudSDK) {
        this.googleCloudSDK = googleCloudSDK;
    }

    @Override
    public void upload(String fileName) {
        String objectName = "reports/2026/" + fileName;
        googleCloudSDK.uploadObject("company-docs", objectName, fileName);
    }
}
