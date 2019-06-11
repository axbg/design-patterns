package com.axbg.behavioral.chainofresponsibility;

class Manager extends AHandler {

    @Override
    void processRequest(Request request) {

        if (request.getGrade() >= 5) {
            if (request.getGrade() < 20) {
                System.out.println("The manager will process the request: " + request.getTitle());
            } else {
                if (successor != null) {
                    System.out.println("The manager cannot process this request. Redirecting to successor.");
                    successor.processRequest(request);
                } else {
                    System.out.println("Nobody can process this command: " + request.getTitle());
                }
            }
        } else {
            System.out.println("The request should be processed by a predecessor.");
        }
    }

}
