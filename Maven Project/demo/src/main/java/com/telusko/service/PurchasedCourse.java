package com.telusko.service;

import com.telusko.Course;

public class PurchasedCourse {

    public boolean proceedWithCourse(Course course) {
        return course.coursePurchased();
    }
}