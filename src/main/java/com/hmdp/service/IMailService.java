package com.hmdp.service;

public interface IMailService {
    void sendEmail(String to, String subject, String text);
}
