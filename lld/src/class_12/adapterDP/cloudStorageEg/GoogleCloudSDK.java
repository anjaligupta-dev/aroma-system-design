package class_12.adapterDP.cloudStorageEg;

public class GoogleCloudSDK {
    public void uploadObject(String bucket, String objectName, String fileName) {
        System.out.println("Uploading " + fileName + " to Google Cloud Storage bucket : " + bucket + ", using object name : " + objectName);
    }
}
