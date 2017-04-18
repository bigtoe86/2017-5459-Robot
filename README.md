# 2017-5459-Robot

Testing out README

#Routing Ticket Services


## HTTP | HTTPS://st-routing-service.sematree.f9/st-routing-service/routing


The routing services track the movement of a document or an activity through the process of being worked on.


[**Contact the developer**](mailto:adam.devoe@sematree.com)


**Version** 0.0.1-SNAPSHOT

[**Terms of Service**](Terms)

[**License**](https://sematree.com/license.htm)










# APIs


## /admin/queueownerroles


### GET

<a id="findQueueOwnerRoleRefs">Fetches all QueueOwnerRoleRefs.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>domainid</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createQueueOwnerRoleRef">Create a new QueueOwnerRoleRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /admin/queueownerroles/{id}


### GET

<a id="getQueueOwnerRoleRefById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/QueueOwnerRoleRefGETData">QueueOwnerRoleRefGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateQueueOwnerRoleRefById">Updates and existing QueueOwnerRoleRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteQueueOwnerRoleRefById">Deletes an existing QueueOwnerRoleRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /admin/routingactionreasons


### GET

<a id="findRoutingActionReasonRefs">Fetches all RoutingActionReasonRefs.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>domainid</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createRoutingActionReasonRef">Create a new RoutingActionReasonRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /admin/routingactionreasons/{id}


### GET

<a id="getRoutingActionReasonRefById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingActionReasonRefGETData">RoutingActionReasonRefGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateRoutingActionReasonRefById">Updates and existing RoutingActionReasonRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteRoutingActionReasonRefById">Deletes an existing RoutingActionReasonRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /admin/routingqueuegrouproless


### GET

<a id="findRoutingQueueGroupRoless">Fetches all RoutingQueueGroupRoless.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>domainid</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createRoutingQueueGroupRoles">Create a new RoutingQueueGroupRoles.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /admin/routingqueuegrouproless/{id}


### GET

<a id="getRoutingQueueGroupRolesById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingQueueGroupRolesGETData">RoutingQueueGroupRolesGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateRoutingQueueGroupRolesById">Updates and existing RoutingQueueGroupRoles.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteRoutingQueueGroupRolesById">Deletes an existing RoutingQueueGroupRoles.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /admin/routingqueuegroups


### GET

<a id="findRoutingQueueGroupRefs">Fetches all RoutingQueueGroupRefs.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>domainid</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createRoutingQueueGroupRef">Create a new RoutingQueueGroupRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /admin/routingqueuegroups/{id}


### GET

<a id="getRoutingQueueGroupRefById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingQueueGroupRefGETData">RoutingQueueGroupRefGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateRoutingQueueGroupRefById">Updates and existing RoutingQueueGroupRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteRoutingQueueGroupRefById">Deletes an existing RoutingQueueGroupRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /admin/routingqueuegroups/{id}/grantaccess


### GET

<a id="grantaccess">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>userscsv</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>grouproleid</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingQueueGroupRefGETData">RoutingQueueGroupRefGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |


















## /admin/routingqueuegroups/{id}/revokeaccess


### GET

<a id="revokeaccess">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>userscsv</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>grouproleid</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingQueueGroupRefGETData">RoutingQueueGroupRefGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |


















## /admin/routingqueues


### GET

<a id="findRoutingQueues">Fetches all RoutingQueues.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>domainid</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createRoutingQueue">Create a new RoutingQueue.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /admin/routingqueues/{id}


### GET

<a id="getRoutingQueueById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingQueueGETData">RoutingQueueGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateRoutingQueueById">Updates and existing RoutingQueue.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteRoutingQueueById">Deletes an existing RoutingQueue.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /admin/routingticketentityaspects


### GET

<a id="findRoutingTicketEntityAspectRefs">Fetches all RoutingTicketEntityAspectRefs.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>domainid</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createRoutingTicketEntityAspectRef">Create a new RoutingTicketEntityAspectRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /admin/routingticketentityaspects/{id}


### GET

<a id="getRoutingTicketEntityAspectRefById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketEntityAspectRefGETData">RoutingTicketEntityAspectRefGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateRoutingTicketEntityAspectRefById">Updates and existing RoutingTicketEntityAspectRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteRoutingTicketEntityAspectRefById">Deletes an existing RoutingTicketEntityAspectRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /admin/ticketdomains


### GET

<a id="findTicketDomainRefs">Fetches all TicketDomainRefs.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>domainid</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createTicketDomainRef">Create a new TicketDomainRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /admin/ticketdomains/{id}


### GET

<a id="getTicketDomainRefById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/TicketDomainRefGETData">TicketDomainRefGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateTicketDomainRefById">Updates and existing TicketDomainRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteTicketDomainRefById">Deletes an existing TicketDomainRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /admin/ticketpriorities


### GET

<a id="findTicketPriorityRefs">Fetches all TicketPriorityRefs.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>domainid</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createTicketPriorityRef">Create a new TicketPriorityRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /admin/ticketpriorities/{id}


### GET

<a id="getTicketPriorityRefById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/TicketPriorityRefGETData">TicketPriorityRefGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateTicketPriorityRefById">Updates and existing TicketPriorityRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteTicketPriorityRefById">Deletes an existing TicketPriorityRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /admin/tickettypes


### GET

<a id="findTicketTypeRefs">Fetches all TicketTypeRefs.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>domainid</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createTicketTypeRef">Create a new TicketTypeRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /admin/tickettypes/{id}


### GET

<a id="getTicketTypeRefById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/TicketTypeRefGETData">TicketTypeRefGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateTicketTypeRefById">Updates and existing TicketTypeRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteTicketTypeRefById">Deletes an existing TicketTypeRef.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /tickets/routingticketentities


### GET

<a id="findRoutingTicketEntities">Fetches all RoutingTicketEntities.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createRoutingTicketEntity">Create a new RoutingTicketEntity.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /tickets/routingticketentities/{id}


### GET

<a id="getRoutingTicketEntityById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketEntityGETData">RoutingTicketEntityGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateRoutingTicketEntityById">Updates and existing RoutingTicketEntity.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteRoutingTicketEntityById">Deletes an existing RoutingTicketEntity.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /tickets/routingticketlogs


### GET

<a id="findRoutingTicketLogs">Fetches all RoutingTicketLogs.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createRoutingTicketLog">Create a new RoutingTicketLog.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /tickets/routingticketlogs/{id}


### GET

<a id="getRoutingTicketLogById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketLogGETData">RoutingTicketLogGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateRoutingTicketLogById">Updates and existing RoutingTicketLog.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteRoutingTicketLogById">Deletes an existing RoutingTicketLog.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /tickets/routingtickets


### GET

<a id="findRoutingTickets">Fetches all RoutingTickets.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>ownerUserName</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ownerQueueId</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createRoutingTicket">Create a new RoutingTicket.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /tickets/routingtickets/canroutefromqueue


### GET

<a id="canroutefromqueue">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>userName</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>queueId</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketGETData">RoutingTicketGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |


















## /tickets/routingtickets/canroutetoqueue


### GET

<a id="canroutetoqueue">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>userName</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>queueId</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketGETData">RoutingTicketGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |


















## /tickets/routingtickets/{id}


### GET

<a id="getRoutingTicketById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketGETData">RoutingTicketGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateRoutingTicketById">Updates and existing RoutingTicket.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteRoutingTicketById">Deletes an existing RoutingTicket.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /tickets/routingtickets/{id}/acceptticket


### GET

<a id="acceptticket">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>userName</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>reasonId</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>comments</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketGETData">RoutingTicketGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |


















## /tickets/routingtickets/{id}/canacceptticket


### GET

<a id="canacceptticket">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>userName</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketGETData">RoutingTicketGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |


















## /tickets/routingtickets/{id}/canrejectticket


### GET

<a id="canrejectticket">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>userName</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketGETData">RoutingTicketGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |


















## /tickets/routingtickets/{id}/closeticket


### GET

<a id="closeticket">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>userName</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>reasonId</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>comments</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketGETData">RoutingTicketGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |


















## /tickets/routingtickets/{id}/rejectticket


### GET

<a id="rejectticket">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>userName</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>reasonId</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>comments</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketGETData">RoutingTicketGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |


















## /tickets/routingtickets/{id}/routetoqueue


### GET

<a id="routetoqueue">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ownerQueueId</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>reasonId</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>comments</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketGETData">RoutingTicketGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |


















## /tickets/routingtickets/{id}/routetouser


### GET

<a id="routetouser">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ownerUserName</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>autoaccept</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>reasonId</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>comments</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketGETData">RoutingTicketGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |


















## /tickets/routingticketsetentries


### GET

<a id="findRoutingTicketSetEntries">Fetches all RoutingTicketSetEntries.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createRoutingTicketSetEntry">Create a new RoutingTicketSetEntry.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /tickets/routingticketsetentries/{id}


### GET

<a id="getRoutingTicketSetEntryById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketSetEntryGETData">RoutingTicketSetEntryGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateRoutingTicketSetEntryById">Updates and existing RoutingTicketSetEntry.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteRoutingTicketSetEntryById">Deletes an existing RoutingTicketSetEntry.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |












## /tickets/routingticketsets


### GET

<a id="findRoutingTicketSets">Fetches all RoutingTicketSets.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>name</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>businessCode</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>activeOnly</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>boolean </td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |







### POST


<a id="createRoutingTicketSet">Create a new RoutingTicketSet.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters






#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 201    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name exists. |  - |
| 500    | System error |  - |















## /tickets/routingticketsets/{id}


### GET

<a id="getRoutingTicketSetById">Fetches based the id.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | OK | <a href="#/definitions/RoutingTicketSetGETData">RoutingTicketSetGETData</a>|
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |





### PUT

<a id="updateRoutingTicketSetById">Updates and existing RoutingTicketSet.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 409    | Conflict, name already exists. |  - |
| 500    | System error |  - |







### DELETE

<a id="deleteRoutingTicketSetById">Deletes an existing RoutingTicketSet.</a>









#### Request


**Content-Type: ** application/json;charset=UTF-8

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>id</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json;charset=UTF-8


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 204    | OK |  - |
| 400    | Invalid id, no data updated or invalid data. |  - |
| 500    | System error |  - |













# Definitions

## <a name="/definitions/DateGETData">DateGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| dateMilliseconds |  
                    
                    integer (int64)
                    |   optional  | -  |  |

| dateFormat |  
                    
                    string
                    |   optional  | -  |  |

| formattedDate |  
                    
                    string
                    |   optional  | -  |  |

| year |  
                    
                    integer (int32)
                    |   optional  | -  |  |

| month |  
                    
                    integer (int32)
                    |   optional  | -  |  |

| dayOfMonth |  
                    
                    integer (int32)
                    |   optional  | -  |  |

| monthName |  
                    
                    string
                    |   optional  | -  |  |
                  

## <a name="/definitions/QueueOwnerRoleRefGETData">QueueOwnerRoleRefGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| businessCode |  
                    
                    string
                    |   optional  | Unique code  | NORMAL |

| name |  
                    
                    string
                    |   optional  | Name of the role.  | Normal Queue Role |

| description |  
                    
                    string
                    |   optional  | Long description of the object.  Supports multi-byte characters.  | Normal queue users can pull entries off the queue, and push entries onto the queue. |

| isActive |  
                    
                    integer (int32)
                    |   optional  | True and the role is in use  | 1 |
                  

## <a name="/definitions/RoutingActionReasonRefGETData">RoutingActionReasonRefGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| businessCode |  
                    
                    string
                    |   optional  | Unique code in the ticket domain  | WRONGWORKER |

| name |  
                    
                    string
                    |   optional  | Reason name  | Wrong Worker Associated with the ticket. |

| description |  
                    
                    string
                    |   optional  | Long description of the Reason.  Supports multi-byte characters.  | Use this reason if the ticket was routed to you incorrectly. |

| isActive |  
                    
                    integer (int32)
                    |   optional  | True and the reason can be chosen.  | 1 |
                  

## <a name="/definitions/RoutingQueueGETData">RoutingQueueGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| routingQueueGroupId |  
                    
                    string
                    |   optional  | The queue group this belongs to.  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| sequenceOrder |  
                    
                    integer (int32)
                    |   optional  | Order of the object in the full template or the template instance.  | 0 |

| documentXtid |  
                    
                    string
                    |   optional  | FK to Document_entity_type .  | Quote:75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| documentEntityType |  
                    
                    string
                    |   optional  | Code for the document entity_type (to make it easier to read).  | Quote |

| businessCode |  
                    
                    string
                    |   optional  | Code for lookup  | BOSTON_QUEUE |

| name |  
                    
                    string
                    |   optional  | Nice name for the queue.  | Boston Queue |

| description |  
                    
                    string
                    |   optional  | Long description of the object.  Supports multi-byte characters.  | This queue holds tickets from the Boston area. |

| escalationQueueId |  
                    
                    string
                    |   optional  | Once the escalation rule fires (basedon the ticket type), the ticket moves to this queue.  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |
                  

## <a name="/definitions/RoutingQueueGroupRefGETData">RoutingQueueGroupRefGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| businessCode |  
                    
                    string
                    |   optional  | Code for the queue group  | US_QUEUES |

| name |  
                    
                    string
                    |   optional  | Nice name of the queue group.  | United States Queues |

| description |  
                    
                    string
                    |   optional  | Long description of the object.  Supports multi-byte characters.  | The queues for the united states. |

| isActive |  
                    
                    integer (int32)
                    |   optional  | True and this group is available to choose.  | 1 |

| defaultEscalationQueueId |  
                    
                    string
                    |   optional  | The routing queue by default that queues escalate to.  | ddf2322d-0fa7-4a0c-90c6-cddba9442646 |

| lstAdminUsers |  
                
                    array[<a href="#/definitions/RoutingQueueGroupRolesGETData">RoutingQueueGroupRolesGETData</a>]
                
                
                    |   optional  | List of admin user access records for this group.  |  |

| lstNormalUsers |  
                
                    array[<a href="#/definitions/RoutingQueueGroupRolesGETData">RoutingQueueGroupRolesGETData</a>]
                
                
                    |   optional  | List of normal user access records for this group.  |  |
                  

## <a name="/definitions/RoutingQueueGroupRolesGETData">RoutingQueueGroupRolesGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| groupRoleId |  
                    
                    string
                    |   optional  | The fk to the role of the user.  | Some grouproleid |

| routingQueueGroupId |  
                    
                    string
                    |   optional  | The routing queue this role applies to.  | Some routingqueuegroupid |

| sequenceOrder |  
                    
                    integer (int32)
                    |   optional  | Order of the object in the full template or the template instance.  | 0 |

| userName |  
                    
                    string
                    |   optional  | The user in the relationship.  | henry |

| name |  
                    
                    string
                    |   optional  | Used - for diagnostics  | group:US Queues - Role : Normal  user:henry   |
                  

## <a name="/definitions/RoutingTicketEntityAspectRefGETData">RoutingTicketEntityAspectRefGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| businessCode |  
                    
                    string
                    |   optional  | -  | BUSINESSCODE |

| name |  
                    
                    string
                    |   optional  | -  | Some name |

| defaultPriorityId |  
                    
                    string
                    |   optional  | -  | Some defaultpriorityid |

| description |  
                    
                    string
                    |   optional  | Long description of the object.  Supports multi-byte characters.  | . Quo ex autem homero animal. Cu vim oporteat deseruisse. Ius et nulla choro mai |

| isActive |  
                    
                    integer (int32)
                    |   optional  | -  | 395 |
                  

## <a name="/definitions/RoutingTicketEntityGETData">RoutingTicketEntityGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| routingTicketId |  
                    
                    string
                    |   optional  | Code for the document entity_type (to make it easier to read).  | Some routingticketid |

| routingEntityAspectId |  
                    
                    string
                    |   optional  | Code for the document entity_type (to make it easier to read).  | Some routingentityaspectid |

| sequenceOrder |  
                    
                    integer (int32)
                    |   optional  | Order of the object in the full template or the template instance.  | 707 |

| documentXtuuid |  
                    
                    string
                    |   optional  | External FK to Document_entity_type .  | Some documentxtuuid |

| aspect |  
                    
                    string
                    |   optional  | -  | Some aspect |

| name |  
                    
                    string
                    |   optional  | -  | Some name |

| description |  
                    
                    string
                    |   optional  | Long description of the object.  Supports multi-byte characters.  | . Laoreet conceptam ad ius, mei te tamquam perfecto splendide. Ei eam movet i |
                  

## <a name="/definitions/RoutingTicketGETData">RoutingTicketGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| ticketTypeId |  
                    
                    string
                    |   optional  | The type of ticket governs some behavior and display.  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| parentRoutingTicketId |  
                    
                    string
                    |   optional  | If a sub-ticket, this is the parent ticket id.  | Some parentroutingticketid |

| businessCode |  
                    
                    string
                    |   optional  | Used if you want to look up a routing ticket by code.  | InfoRequst-34987239487 |

| status |  
                    
                    string
                    |   optional  | Status   | Open |

| name |  
                    
                    string
                    |   optional  | Firendly name for the ticket.  | InfoRequest for Solar panels. |

| description |  
                    
                    string
                    |   optional  | Long description of the object.  Supports multi-byte characters.  | I&#x27;m interested in buying solar panels, but don&#x27;t want them on my house. |

| languageCode |  
                    
                    string
                    |   optional  | Link into the language table.  To help with routing.  | en_US |

| dataType |  
                    
                    string
                    |   optional  | Parent document type of the ticket  | Quote |

| conversationXtid |  
                    
                    string
                    |   optional  | External key for the conversation - just the id.  FK in the Infra Service.  | 239473294-394397-247394738 |

| parentEntityXtuuid |  
                    
                    string
                    |   optional  | The parent document for the routing ticket.  | Quote:239473294-394397-247394738 |

| ownerQueueId |  
                    
                    string
                    |   optional  | If the owner of this ticket is currently the queue, this is non-null.  | 239473294-394397-247394738 |

| ownerUserName |  
                    
                    string
                    |   optional  | If a user owns the ticket, then that user.  | karley |

| ownerAccepted |  
                    
                    integer (int32)
                    |   optional  | 1 and acceptd, 0 and in inbox.  | 1 |

| priorityId |  
                    
                    string
                    |   optional  | Priority of the ticket  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |
                  

## <a name="/definitions/RoutingTicketLogGETData">RoutingTicketLogGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| routingTicketId |  
                    
                    string
                    |   optional  | fk to ticket  | Some routingticketid |

| name |  
                    
                    string
                    |   optional  | Nice words about what happened.  | Routed to the Boston Queue. |

| actionCode |  
                    
                    string
                    |   optional  | Use code trigger coding.  | ROUTED |

| actionReasonId |  
                    
                    string
                    |   optional  | The reason something was routed.  | 99028033-0fa7-4a0c-90c6-cddba9442646 |

| actionReasonMemoText |  
                    
                    string
                    |   optional  | Long description of the reason something happened.  | TBD. |

| statusFrom |  
                    
                    string
                    |   optional  | The status before the routing/action happened  | ACCEPTED |

| statusTo |  
                    
                    string
                    |   optional  | Status to.  | ROUTED |

| priorityFromId |  
                    
                    string
                    |   optional  | If priority changed.  |  |

| priorityToId |  
                    
                    string
                    |   optional  | The priority its set to.  |  |

| ownerQueueToId |  
                    
                    string
                    |   optional  | The queue routed to  | 23894fg2134-0fa7-4a0c-90c6-cddba9442646 |

| ownerQueueFromId |  
                    
                    string
                    |   optional  | Can be null, the routed from queue  |  |

| ownerUserNameFrom |  
                    
                    string
                    |   optional  | Can be null, the routed from owner  | karley |

| ownerUserNameTo |  
                    
                    string
                    |   optional  | If routed to a user, then this/  |  |

| routingDocumentId |  
                    
                    string
                    |   optional  | Unused.  |  |
                  

## <a name="/definitions/RoutingTicketSetEntryGETData">RoutingTicketSetEntryGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| routingTicketId |  
                    
                    string
                    |   optional  | fk to ticket  | Some routingticketid |

| routingTicketSetId |  
                    
                    string
                    |   optional  | The ticket set for the entry  | Some routingticketsetid |

| sequenceOrder |  
                    
                    integer (int32)
                    |   optional  | Order of the object in the full template or the template instance.  | 887 |
                  

## <a name="/definitions/RoutingTicketSetGETData">RoutingTicketSetGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| userName |  
                    
                    string
                    |   optional  | The user in the relationship.  | Some username |

| name |  
                    
                    string
                    |   optional  | -  | Some name |

| description |  
                    
                    string
                    |   optional  | Long description of the object.  Supports multi-byte characters.  | . Ei exerci definitiones eum, vix ad oratio timeam, ei his tollit aperiam omnesq |
                  

## <a name="/definitions/TicketDomainRefGETData">TicketDomainRefGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| businessCode |  
                    
                    string
                    |   optional  | Code for this domain.  | Quote |

| name |  
                    
                    string
                    |   optional  | Nice name for the domain.  | Quote Ticket domain. |

| description |  
                    
                    string
                    |   optional  | Long description of the object.  Supports multi-byte characters.  | The quote ticket domain contains all the RFQ&#x27;s and Quotes. |

| isActive |  
                    
                    integer (int32)
                    |   optional  | True and can be selected.  | 1 |
                  

## <a name="/definitions/TicketPriorityRefGETData">TicketPriorityRefGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| businessCode |  
                    
                    string
                    |   optional  | Code for the priority.  Unique in the ticketDomain.  | HIGH |

| name |  
                    
                    string
                    |   optional  | Nice name for the priority  | High Priority |

| description |  
                    
                    string
                    |   optional  | Long description of the object.  Supports multi-byte characters.  | High priority tickets have the following SLA: 2 hour address. |

| isActive |  
                    
                    integer (int32)
                    |   optional  | True and the ticket priority is available for selection.  | 1 |

| priority |  
                    
                    integer (int32)
                    |   optional  | 1 is low priority, 100 is high priority. The priority should correspond to relative escalation hours.  | 75 |

| escalationHours |  
                    
                    number (double)
                    |   optional  | The escalation rule in hours.  | 0.44 |
                  

## <a name="/definitions/TicketTypeRefGETData">TicketTypeRefGETData</a>

| name     | type | required | descriptione | example |
|----------|------|----------|--------------|---------|

| id |  
                    
                    string
                    |   optional  | -  |  |

| createdByUserName |  
                    
                    string
                    |   optional  | -  |  |

| lastUpdatedByUserName |  
                    
                    string
                    |   optional  | -  |  |

| dateCreated |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| lastUpdateDate |  
                    <a href="#/definitions/DateGETData">DateGETData</a>
                    
                    |   optional  | -  |  |

| theURI |  
                    
                    string (uri)
                    |   optional  | -  |  |

| ticketDomainId |  
                    
                    string
                    |   optional  | Fk to ticketDomainId  | 75a2122d-0fa7-4a0c-90c6-cddba9442646 |

| businessCode |  
                    
                    string
                    |   optional  | Code for the ticket type.  Unique to the domain.  | INFO_REQUEST |

| name |  
                    
                    string
                    |   optional  | Nice name for the ticket type.  | Request for Information |

| escalationRuleName |  
                    
                    string
                    |   optional  | The escalation rule escalate by time uses the escalation hours.  | ExcalateByTime |

| escalationQueueId |  
                    
                    string
                    |   optional  | The routing queue to escalate to..  | aa0a0a0ad-0fa7-4a0c-90c6-cddba9442646 |

| initialQueueId |  
                    
                    string
                    |   optional  | The routing queue that the newly initialized ticket will be sent to by default.  | bb02b2bbd-0fa7-4a0c-90c6-cddba9442646 |

| defaultPriorityId |  
                    
                    string
                    |   optional  | The default priority for the ticket if this type is chosen.  | cc97c97c8c-0fa7-4a0c-90c6-cddba9442646 |

| description |  
                    
                    string
                    |   optional  | Long description of the object.  Supports multi-byte characters.  | The informational request will be sent out to SME&#x27;s. |

| isActive |  
                    
                    integer (int32)
                    |   optional  | 1 and available for selection.  | 1 |
                  


