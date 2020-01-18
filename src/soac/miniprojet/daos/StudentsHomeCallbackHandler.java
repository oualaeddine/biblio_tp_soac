
/**
 * StudentsHomeCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

    package soac.miniprojet.daos;

    /**
     *  StudentsHomeCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class StudentsHomeCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public StudentsHomeCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public StudentsHomeCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for findByExample method
            * override this method for handling normal response from findByExample operation
            */
           public void receiveResultfindByExample(
                    soac.miniprojet.daos.StudentsHomeStub.FindByExampleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findByExample operation
           */
            public void receiveErrorfindByExample(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for merge method
            * override this method for handling normal response from merge operation
            */
           public void receiveResultmerge(
                    soac.miniprojet.daos.StudentsHomeStub.MergeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from merge operation
           */
            public void receiveErrormerge(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findById method
            * override this method for handling normal response from findById operation
            */
           public void receiveResultfindById(
                    soac.miniprojet.daos.StudentsHomeStub.FindByIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findById operation
           */
            public void receiveErrorfindById(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                


    }
    