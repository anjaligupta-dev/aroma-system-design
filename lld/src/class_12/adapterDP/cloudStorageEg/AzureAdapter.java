package class_12.adapterDP.cloudStorageEg;

public class AzureAdapter implements StorageService {
    private final AzureBlobSDK azureBlobSDK;

    public AzureAdapter(AzureBlobSDK azureBlobSDK) {
        this.azureBlobSDK = azureBlobSDK;
    }

    @Override
    public void upload(String fileName) {
        String blobName = "employee-documents/" + fileName;
        azureBlobSDK.uploadBlob("company-files", blobName, fileName);
    }
}