package com.handy.aws.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.regions.Region;

import com.google.gson.Gson;



public class InventoryDetail implements RequestHandler<HttpQueryStringRequest, HttpProductResponse> {

    @Override
    public HttpProductResponse handleRequest(HttpQueryStringRequest request, Context context) {
        context.getLogger().log("This is an Input: " + request);
        context.getLogger().log("Input size: " + request.getQueryStringParameters().size());
        
        String idStr= (String)request.getQueryStringParameters().get("id");
        context.getLogger().log("idStr: " + idStr);
        Integer id= Integer.parseInt(idStr);
        
        return new HttpProductResponse(getProductById(id));
    }

    
	private Product getProductById(int id) {
		Region region= Region.US_EAST_1;
        S3Client s3client= S3Client.builder().region(region).build();
        ResponseInputStream<?> objectData= s3client.getObject(GetObjectRequest.builder()
        		.bucket("handyinventorydatavz")
        		.key("Products.json")
        		.build());
        
        InputStreamReader isr= new InputStreamReader(objectData);
        BufferedReader br= new  BufferedReader(isr);
        
        
        Product [] products=null;    
        Gson gson= new Gson();
        products= gson.fromJson(br, Product[ ].class);
        

        for(Product product : products ) {
        	if (product.getId()==id) {
        		return product;
        	}
        }
        return null;
        
	}

}
