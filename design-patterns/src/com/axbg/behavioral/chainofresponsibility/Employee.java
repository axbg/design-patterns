package com.axbg.behavioral.chainofresponsibility;

class Employee extends AHandler {

    @Override
    void processRequest(Request request) {

        if (request.getGrade() < 5) {
            System.out.println("The employee will process the request: " + request.getTitle());
        } else {
            if (successor != null) {
                System.out.println("The employee cannot process this request. Redirecting to successor.");
                successor.processRequest(request);
            } else {
                System.out.println("Nobody can process this command: " + request.getTitle());
            }
        }
    }

}
