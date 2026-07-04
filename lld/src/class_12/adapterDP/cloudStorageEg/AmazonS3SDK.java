package class_12.adapterDP.cloudStorageEg;

public class AmazonS3SDK {
    public void putObject(String bucketName, String objectKey, String fileName) {
        System.out.println("Uploading " + fileName + " to Amazon S3 bucket : " + bucketName + ", using object key : " + objectKey);
    }
}
