# DocControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDocUsingDELETE**](DocControllerApi.md#deleteDocUsingDELETE) | **DELETE** /document/delete/{id} | deleteDoc
[**getDocumentUsingGET**](DocControllerApi.md#getDocumentUsingGET) | **GET** /document/get/{id} | getDocument
[**postDocUsingPOST**](DocControllerApi.md#postDocUsingPOST) | **POST** /document/post | postDoc
[**putDocUsingPUT**](DocControllerApi.md#putDocUsingPUT) | **PUT** /document/put | putDoc
[**restCallUsingGET**](DocControllerApi.md#restCallUsingGET) | **GET** /document/call/{id} | restCall


<a name="deleteDocUsingDELETE"></a>
# **deleteDocUsingDELETE**
> Long deleteDocUsingDELETE(id)

deleteDoc

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocControllerApi;


DocControllerApi apiInstance = new DocControllerApi();
Long id = 789L; // Long | id
try {
    Long result = apiInstance.deleteDocUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocControllerApi#deleteDocUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDocumentUsingGET"></a>
# **getDocumentUsingGET**
> Doc getDocumentUsingGET(id)

getDocument

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocControllerApi;


DocControllerApi apiInstance = new DocControllerApi();
Long id = 789L; // Long | id
try {
    Doc result = apiInstance.getDocumentUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocControllerApi#getDocumentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Doc**](Doc.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="postDocUsingPOST"></a>
# **postDocUsingPOST**
> Doc postDocUsingPOST(doc)

postDoc

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocControllerApi;


DocControllerApi apiInstance = new DocControllerApi();
Doc doc = new Doc(); // Doc | doc
try {
    Doc result = apiInstance.postDocUsingPOST(doc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocControllerApi#postDocUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc** | [**Doc**](Doc.md)| doc |

### Return type

[**Doc**](Doc.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="putDocUsingPUT"></a>
# **putDocUsingPUT**
> Doc putDocUsingPUT(doc)

putDoc

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocControllerApi;


DocControllerApi apiInstance = new DocControllerApi();
Doc doc = new Doc(); // Doc | doc
try {
    Doc result = apiInstance.putDocUsingPUT(doc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocControllerApi#putDocUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc** | [**Doc**](Doc.md)| doc |

### Return type

[**Doc**](Doc.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="restCallUsingGET"></a>
# **restCallUsingGET**
> Doc restCallUsingGET(id)

restCall

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocControllerApi;


DocControllerApi apiInstance = new DocControllerApi();
Long id = 789L; // Long | id
try {
    Doc result = apiInstance.restCallUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocControllerApi#restCallUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Doc**](Doc.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

