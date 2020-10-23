package com.hufei.didiyun;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;

import java.io.File;

/**
*@Author:hufei
*@CreateTime:2020-10-22
*@Description:上传测试
*/public class uploadTest {

    private static String endpoint = "https://play.min.io";
    private static String accessKey = "Q3AM3UQ867SPQQA43P2F";
    private static String secretKey = "zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG";
    private static String bucketName = "asiatrip";

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        String backUrl = "";
        try {

            // Create a minioClient with the MinIO Server name, Port, Access key and Secret key.
            MinioClient minioClient = new MinioClient(endpoint, accessKey, secretKey);
            // Check if the bucket already exists.
            boolean isExist = minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
            if(!isExist) {
                // Make a new bucket called asiatrip to hold a zip file of photos.
                minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
            }
            // Upload the zip file to the bucket with putObject
//            minioClient.putObject("asiatrip","asiaphotos.zip", "/home/user/Photos/asiaphotos.zip", null);
            minioClient.putObject(bucketName, "image"+File.separator+"test123.jpg", "C:\\Users\\yang bing\\Pictures\\Saved Pictures\\ce9LRDIfaIvs.jpg", null);
            System.out.println(endpoint + File.separator + "test123.jpg");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
