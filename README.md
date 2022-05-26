# hockey-test

The testingApi.http file can be used to test the api once it is running.

Initial data is loaded in data.sql.

I initially went for an overkill model of the entities, refactored that into a classic many to many.

I didn't use a service layer because it would be pretty useless for such a small application, it would only be a redirection layer. Hence, the
respositories are directly injected in the controllers.

I assumed all provided body and pathparams would be valid, so there is no error http code mapped to exceptions.

I used Lombok but implemented the dto to entity and vice versa myself.
