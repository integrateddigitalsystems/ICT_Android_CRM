package com.ids.ict.retrofit;

import com.ids.ict.classes.Models.RequestAttchComment;
import com.ids.ict.classes.Models.RequestCreateTicket;
import com.ids.ict.classes.Models.RequestTicket;
import com.ids.ict.classes.Models.ResponseCommentToTicket;
import com.ids.ict.classes.Models.ResponseCreateToken;
import com.ids.ict.classes.Models.ResponseIssues;
import com.ids.ict.classes.Models.ResponseProblemCategories;
import com.ids.ict.classes.Models.ResponseProblemTypes;
import com.ids.ict.classes.Models.ResponseRetrieveTicketLocations;
import com.ids.ict.classes.Models.ResponseServiceProviders;
import com.ids.ict.classes.Models.ResponseTicketComments;
import com.ids.ict.classes.Models.ResponseTickets;
import com.ids.ict.classes.Models.ResponseUpdateTicketLocation;
import com.ids.ict.classes.Models.RetrieveIssuesResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("RetrieveIssues")
    Call<ResponseIssues> retrieveIssue(
            @Query(ApiParameters.STR_PROBLEM_TYPE) String problemType,
            @Query(ApiParameters.LANGUAGE) int language);
//
    @GET("RetrieveProblemTypes")
    Call<ResponseProblemTypes> retrieveProblemTypes(
            @Query(ApiParameters.STR_PROBLEM_CATEGORY) String problemCategory,
            @Query(ApiParameters.LANGUAGE) int language);

   @GET("RetrieveProblemCategories")
   // @GET("GetRetrieveProblemCategoriesResult")
    Call<ResponseProblemCategories> retrieveProblemCategory(@Query(ApiParameters.LANGUAGE) int language);

    @POST("createticket")
    Call<RetrieveIssuesResult> createTickets(@Body RequestTicket requestCreateTicket);


    @GET("RetrieveTickets")
    //@GET("GetRetrieveTickets")
    Call<ResponseTickets> retrieveTickets(
            @Query(ApiParameters.AFFECTED_SERVICE_NUMBER) String affectedServiceNumber,
            @Query(ApiParameters.CUSTOMER_ID) String customerId,
            @Query(ApiParameters.LANGUAGE) int language,
            @Query(ApiParameters.CUSTOMER_TYPE) int CustomerType
    );

/*    @POST("AttachCommentToTicket")
    Call<ResponseCommentToTicket> attachCommentToTicket(@Body RequestAttchComment requestAttachCommentTicket);*/
   // @Headers({"Accept: */*"})
    @Headers("Connection:close")
    @POST("AttachCommentToTicket")
    Call<ResponseCommentToTicket> attachCommentToTicket(@Body RequestAttchComment requestAttachCommentTicket);

    @GET("RetrieveServiceProviders")
   // @GET("GetRetrieveServiceProviders")
    Call<ResponseServiceProviders> retrieveServiceProvider(@Query(ApiParameters.LANGUAGE) int language);


    @GET("CreateToken")
    Call<ResponseCreateToken> createToken(@Query(ApiParameters.DEVICE_ID) String deviceId);

    @Headers("Connection:close")
    @GET("RetrieveTicketComments")
   // @GET("GetRetrieveTicketComments")
    Call<ResponseTicketComments> retrieveTicketComments(@Query(ApiParameters.TICKET_ID) String ticketId);

    @GET("UpdateTicketLocation")
   // @GET("GetUpdateTicketLocation")
    Call<ResponseUpdateTicketLocation> updateTicketLocation(
            @Query(ApiParameters.TOKEN_ID) String TokenID,
            @Query(ApiParameters.TICKET_ID) String TicketID,
            @Query(ApiParameters.LOCATION_X) String LocationX,
            @Query(ApiParameters.LOCATION_Y) String LocationY
    );

    @GET("RetrieveTicketLocations")
   // @GET("GetRetrieveTicketLocations")
    Call<ResponseRetrieveTicketLocations> retrieveTicketLocations(
            @Query(ApiParameters.SERVICE_PROVIDER_ID) String serviceProvider
    );

     @GET("RetrieveTicketLocations")
    //@GET("GetRetrieveTicketLocations")
    Call<ResponseRetrieveTicketLocations> retrieveTicketLocations(
    );

}


