package test.papaya.com;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class TestLambdaFunctionHandler implements RequestHandler<RequestObject, ResponseObject> {

    @Override
    public ResponseObject handleRequest(RequestObject input, Context context) {
        context.getLogger().log("Input: " + input);

        

        return null;
    }

}
