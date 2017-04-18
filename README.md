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

**Content-Type: **  application/json;charset=UTF-8booger


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

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>dateMilliseconds</td>
            <td>                                        integer (int64)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateFormat</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>formattedDate</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>year</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>month</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dayOfMonth</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>monthName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
     
</table>

## <a name="/definitions/QueueOwnerRoleRefGETData">QueueOwnerRoleRefGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>businessCode</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Unique code</td>
            <td>NORMAL</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Name of the role.</td>
            <td>Normal Queue Role</td>
        </tr>
             <tr>
            <td>description</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the object.  Supports multi-byte characters.</td>
            <td>Normal queue users can pull entries off the queue, and push entries onto the queue.</td>
        </tr>
             <tr>
            <td>isActive</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>True and the role is in use</td>
            <td>1</td>
        </tr>
     
</table>

## <a name="/definitions/RoutingActionReasonRefGETData">RoutingActionReasonRefGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>businessCode</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Unique code in the ticket domain</td>
            <td>WRONGWORKER</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Reason name</td>
            <td>Wrong Worker Associated with the ticket.</td>
        </tr>
             <tr>
            <td>description</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the Reason.  Supports multi-byte characters.</td>
            <td>Use this reason if the ticket was routed to you incorrectly.</td>
        </tr>
             <tr>
            <td>isActive</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>True and the reason can be chosen.</td>
            <td>1</td>
        </tr>
     
</table>

## <a name="/definitions/RoutingQueueGETData">RoutingQueueGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>routingQueueGroupId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The queue group this belongs to.</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>sequenceOrder</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>Order of the object in the full template or the template instance.</td>
            <td>0</td>
        </tr>
             <tr>
            <td>documentXtid</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>FK to Document_entity_type .</td>
            <td>Quote:75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>documentEntityType</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Code for the document entity_type (to make it easier to read).</td>
            <td>Quote</td>
        </tr>
             <tr>
            <td>businessCode</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Code for lookup</td>
            <td>BOSTON_QUEUE</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Nice name for the queue.</td>
            <td>Boston Queue</td>
        </tr>
             <tr>
            <td>description</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the object.  Supports multi-byte characters.</td>
            <td>This queue holds tickets from the Boston area.</td>
        </tr>
             <tr>
            <td>escalationQueueId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Once the escalation rule fires (basedon the ticket type), the ticket moves to this queue.</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
     
</table>

## <a name="/definitions/RoutingQueueGroupRefGETData">RoutingQueueGroupRefGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>businessCode</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Code for the queue group</td>
            <td>US_QUEUES</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Nice name of the queue group.</td>
            <td>United States Queues</td>
        </tr>
             <tr>
            <td>description</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the object.  Supports multi-byte characters.</td>
            <td>The queues for the united states.</td>
        </tr>
             <tr>
            <td>isActive</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>True and this group is available to choose.</td>
            <td>1</td>
        </tr>
             <tr>
            <td>defaultEscalationQueueId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The routing queue by default that queues escalate to.</td>
            <td>ddf2322d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>lstAdminUsers</td>
            <td>                                    array[<a href="#/definitions/RoutingQueueGroupRolesGETData">RoutingQueueGroupRolesGETData</a>]                                                            </td>
            <td>optional</td>
            <td>List of admin user access records for this group.</td>
            <td></td>
        </tr>
             <tr>
            <td>lstNormalUsers</td>
            <td>                                    array[<a href="#/definitions/RoutingQueueGroupRolesGETData">RoutingQueueGroupRolesGETData</a>]                                                            </td>
            <td>optional</td>
            <td>List of normal user access records for this group.</td>
            <td></td>
        </tr>
     
</table>

## <a name="/definitions/RoutingQueueGroupRolesGETData">RoutingQueueGroupRolesGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>groupRoleId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The fk to the role of the user.</td>
            <td>Some grouproleid</td>
        </tr>
             <tr>
            <td>routingQueueGroupId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The routing queue this role applies to.</td>
            <td>Some routingqueuegroupid</td>
        </tr>
             <tr>
            <td>sequenceOrder</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>Order of the object in the full template or the template instance.</td>
            <td>0</td>
        </tr>
             <tr>
            <td>userName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The user in the relationship.</td>
            <td>henry</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Used - for diagnostics</td>
            <td>group:US Queues - Role : Normal  user:henry  </td>
        </tr>
     
</table>

## <a name="/definitions/RoutingTicketEntityAspectRefGETData">RoutingTicketEntityAspectRefGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>businessCode</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td>BUSINESSCODE</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td>Some name</td>
        </tr>
             <tr>
            <td>defaultPriorityId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td>Some defaultpriorityid</td>
        </tr>
             <tr>
            <td>description</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the object.  Supports multi-byte characters.</td>
            <td>. Quo ex autem homero animal. Cu vim oporteat deseruisse. Ius et nulla choro mai</td>
        </tr>
             <tr>
            <td>isActive</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>-</td>
            <td>395</td>
        </tr>
     
</table>

## <a name="/definitions/RoutingTicketEntityGETData">RoutingTicketEntityGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>routingTicketId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Code for the document entity_type (to make it easier to read).</td>
            <td>Some routingticketid</td>
        </tr>
             <tr>
            <td>routingEntityAspectId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Code for the document entity_type (to make it easier to read).</td>
            <td>Some routingentityaspectid</td>
        </tr>
             <tr>
            <td>sequenceOrder</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>Order of the object in the full template or the template instance.</td>
            <td>707</td>
        </tr>
             <tr>
            <td>documentXtuuid</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>External FK to Document_entity_type .</td>
            <td>Some documentxtuuid</td>
        </tr>
             <tr>
            <td>aspect</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td>Some aspect</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td>Some name</td>
        </tr>
             <tr>
            <td>description</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the object.  Supports multi-byte characters.</td>
            <td>. Laoreet conceptam ad ius, mei te tamquam perfecto splendide. Ei eam movet i</td>
        </tr>
     
</table>

## <a name="/definitions/RoutingTicketGETData">RoutingTicketGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>ticketTypeId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The type of ticket governs some behavior and display.</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>parentRoutingTicketId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>If a sub-ticket, this is the parent ticket id.</td>
            <td>Some parentroutingticketid</td>
        </tr>
             <tr>
            <td>businessCode</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Used if you want to look up a routing ticket by code.</td>
            <td>InfoRequst-34987239487</td>
        </tr>
             <tr>
            <td>status</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Status </td>
            <td>Open</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Firendly name for the ticket.</td>
            <td>InfoRequest for Solar panels.</td>
        </tr>
             <tr>
            <td>description</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the object.  Supports multi-byte characters.</td>
            <td>I&#x27;m interested in buying solar panels, but don&#x27;t want them on my house.</td>
        </tr>
             <tr>
            <td>languageCode</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Link into the language table.  To help with routing.</td>
            <td>en_US</td>
        </tr>
             <tr>
            <td>dataType</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Parent document type of the ticket</td>
            <td>Quote</td>
        </tr>
             <tr>
            <td>conversationXtid</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>External key for the conversation - just the id.  FK in the Infra Service.</td>
            <td>239473294-394397-247394738</td>
        </tr>
             <tr>
            <td>parentEntityXtuuid</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The parent document for the routing ticket.</td>
            <td>Quote:239473294-394397-247394738</td>
        </tr>
             <tr>
            <td>ownerQueueId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>If the owner of this ticket is currently the queue, this is non-null.</td>
            <td>239473294-394397-247394738</td>
        </tr>
             <tr>
            <td>ownerUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>If a user owns the ticket, then that user.</td>
            <td>karley</td>
        </tr>
             <tr>
            <td>ownerAccepted</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>1 and acceptd, 0 and in inbox.</td>
            <td>1</td>
        </tr>
             <tr>
            <td>priorityId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Priority of the ticket</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
     
</table>

## <a name="/definitions/RoutingTicketLogGETData">RoutingTicketLogGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>routingTicketId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>fk to ticket</td>
            <td>Some routingticketid</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Nice words about what happened.</td>
            <td>Routed to the Boston Queue.</td>
        </tr>
             <tr>
            <td>actionCode</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Use code trigger coding.</td>
            <td>ROUTED</td>
        </tr>
             <tr>
            <td>actionReasonId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The reason something was routed.</td>
            <td>99028033-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>actionReasonMemoText</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the reason something happened.</td>
            <td>TBD.</td>
        </tr>
             <tr>
            <td>statusFrom</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The status before the routing/action happened</td>
            <td>ACCEPTED</td>
        </tr>
             <tr>
            <td>statusTo</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Status to.</td>
            <td>ROUTED</td>
        </tr>
             <tr>
            <td>priorityFromId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>If priority changed.</td>
            <td></td>
        </tr>
             <tr>
            <td>priorityToId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The priority its set to.</td>
            <td></td>
        </tr>
             <tr>
            <td>ownerQueueToId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The queue routed to</td>
            <td>23894fg2134-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>ownerQueueFromId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Can be null, the routed from queue</td>
            <td></td>
        </tr>
             <tr>
            <td>ownerUserNameFrom</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Can be null, the routed from owner</td>
            <td>karley</td>
        </tr>
             <tr>
            <td>ownerUserNameTo</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>If routed to a user, then this/</td>
            <td></td>
        </tr>
             <tr>
            <td>routingDocumentId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Unused.</td>
            <td></td>
        </tr>
     
</table>

## <a name="/definitions/RoutingTicketSetEntryGETData">RoutingTicketSetEntryGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>routingTicketId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>fk to ticket</td>
            <td>Some routingticketid</td>
        </tr>
             <tr>
            <td>routingTicketSetId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The ticket set for the entry</td>
            <td>Some routingticketsetid</td>
        </tr>
             <tr>
            <td>sequenceOrder</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>Order of the object in the full template or the template instance.</td>
            <td>887</td>
        </tr>
     
</table>

## <a name="/definitions/RoutingTicketSetGETData">RoutingTicketSetGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>userName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The user in the relationship.</td>
            <td>Some username</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td>Some name</td>
        </tr>
             <tr>
            <td>description</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the object.  Supports multi-byte characters.</td>
            <td>. Ei exerci definitiones eum, vix ad oratio timeam, ei his tollit aperiam omnesq</td>
        </tr>
     
</table>

## <a name="/definitions/TicketDomainRefGETData">TicketDomainRefGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>businessCode</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Code for this domain.</td>
            <td>Quote</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Nice name for the domain.</td>
            <td>Quote Ticket domain.</td>
        </tr>
             <tr>
            <td>description</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the object.  Supports multi-byte characters.</td>
            <td>The quote ticket domain contains all the RFQ&#x27;s and Quotes.</td>
        </tr>
             <tr>
            <td>isActive</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>True and can be selected.</td>
            <td>1</td>
        </tr>
     
</table>

## <a name="/definitions/TicketPriorityRefGETData">TicketPriorityRefGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>businessCode</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Code for the priority.  Unique in the ticketDomain.</td>
            <td>HIGH</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Nice name for the priority</td>
            <td>High Priority</td>
        </tr>
             <tr>
            <td>description</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the object.  Supports multi-byte characters.</td>
            <td>High priority tickets have the following SLA: 2 hour address.</td>
        </tr>
             <tr>
            <td>isActive</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>True and the ticket priority is available for selection.</td>
            <td>1</td>
        </tr>
             <tr>
            <td>priority</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>1 is low priority, 100 is high priority. The priority should correspond to relative escalation hours.</td>
            <td>75</td>
        </tr>
             <tr>
            <td>escalationHours</td>
            <td>                                        number (double)                            </td>
            <td>optional</td>
            <td>The escalation rule in hours.</td>
            <td>0.44</td>
        </tr>
     
</table>

## <a name="/definitions/TicketTypeRefGETData">TicketTypeRefGETData</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
            <tr>
            <td>id</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>createdByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdatedByUserName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>dateCreated</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>lastUpdateDate</td>
            <td>                    <a href="#/definitions/DateGETData">DateGETData</a>                                                </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>theURI</td>
            <td>                                        string (uri)                            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
             <tr>
            <td>ticketDomainId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Fk to ticketDomainId</td>
            <td>75a2122d-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>businessCode</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Code for the ticket type.  Unique to the domain.</td>
            <td>INFO_REQUEST</td>
        </tr>
             <tr>
            <td>name</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Nice name for the ticket type.</td>
            <td>Request for Information</td>
        </tr>
             <tr>
            <td>escalationRuleName</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The escalation rule escalate by time uses the escalation hours.</td>
            <td>ExcalateByTime</td>
        </tr>
             <tr>
            <td>escalationQueueId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The routing queue to escalate to..</td>
            <td>aa0a0a0ad-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>initialQueueId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The routing queue that the newly initialized ticket will be sent to by default.</td>
            <td>bb02b2bbd-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>defaultPriorityId</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>The default priority for the ticket if this type is chosen.</td>
            <td>cc97c97c8c-0fa7-4a0c-90c6-cddba9442646</td>
        </tr>
             <tr>
            <td>description</td>
            <td>                                        string                            </td>
            <td>optional</td>
            <td>Long description of the object.  Supports multi-byte characters.</td>
            <td>The informational request will be sent out to SME&#x27;s.</td>
        </tr>
             <tr>
            <td>isActive</td>
            <td>                                        integer (int32)                            </td>
            <td>optional</td>
            <td>1 and available for selection.</td>
            <td>1</td>
        </tr>
     
</table>


