package com.axbg.behavioral.chainofresponsibility;

class Request {

    private String title;
    private int grade;

    Request(String title, int grade) {
        this.title = title;
        this.grade = grade;
    }

    String getTitle() {
        return title;
    }

    int getGrade() {
        return grade;
    }

}
