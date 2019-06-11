package com.axbg.behavioral.chainofresponsibility;

abstract class AHandler {

    AHandler successor = null;

    void setSuccessor(AHandler succesor) {
        this.successor = succesor;
    }

    abstract void processRequest(Request request);

}
