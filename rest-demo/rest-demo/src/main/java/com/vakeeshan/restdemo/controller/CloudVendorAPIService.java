package com.vakeeshan.restdemo.controller;

import com.vakeeshan.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendor;
//                ("C1", "Vendor 1", "Address One",
//                "xxxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping
    public String deleteCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}
