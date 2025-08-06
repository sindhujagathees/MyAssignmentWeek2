package week3.day2;

public class APIClient {

	// First overloaded method - accepts one argument
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    // Second overloaded method - accepts three arguments
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        if (requestStatus) {
            System.out.println("Request was successful.");
        } else {
            System.out.println("Request failed.");
        }
    }

    // Main method to test overloaded methods
    public static void main(String[] args) {
        // Create object of APIClient using 'new' keyword
        APIClient client = new APIClient();

        // Call first version of sendRequest
        client.sendRequest("sending the request");

        System.out.println(); // Line break for clarity

        // Call second version of sendRequest
        client.sendRequest("sending the request");
    }

	}


