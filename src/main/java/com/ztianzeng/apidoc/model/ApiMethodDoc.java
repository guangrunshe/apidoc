package com.ztianzeng.apidoc.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * api文档
 */
@Data
public class ApiMethodDoc implements Serializable {

    private String desc;

    private String url;

    private String type;

    private String headers;

    private String contentType = "application/x-www-form-urlencoded";

    private Map<String, String> requestParams;

    private String requestUsage;

    private String responseUsage;

    private String responseParams;


}
