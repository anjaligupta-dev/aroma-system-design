package class_12.adapterDP.cloudStorageEg;

public class Main {
    public static void main(String[] args) {
        StorageService local = new LocalStorage();
        local.upload("resume.pdf"); // Output : Uploading resume.pdf to Local Storage

        StorageService amazon = new AmazonAdapter(new AmazonS3SDK());
        amazon.upload("photo.jpg"); // Output : Uploading photo.jpg to Amazon S3 bucket : documents, using object key : invoices/2026/photo.jpg

        StorageService azure = new AzureAdapter(new AzureBlobSDK());
        azure.upload("invoice.pdf"); // Output : Uploading invoice.pdf to Azure Blob Container : company-files, inside blob : employee-documents/invoice.pdf

        StorageService google = new GoogleCloudAdapter(new GoogleCloudSDK());
        google.upload("report.docx"); // Output : Uploading report.docx to Google Cloud Storage bucket : company-docs, using object key : reports/2026/report.docx
    }
}
