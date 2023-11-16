package com.banking.thejavaSBbank.service.Impl;

import com.banking.thejavaSBbank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
