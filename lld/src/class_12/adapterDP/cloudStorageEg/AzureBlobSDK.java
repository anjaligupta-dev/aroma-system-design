package class_12.adapterDP.cloudStorageEg;

public class AzureBlobSDK {
    public void uploadBlob(String containerName, String blobName, String fileName) {
        System.out.println("Uploading " + fileName + " to Azure Blob Container : " + containerName + ", inside blob : " + blobName);
    }
}