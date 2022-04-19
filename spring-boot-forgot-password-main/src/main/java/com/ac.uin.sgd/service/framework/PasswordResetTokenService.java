package com.ac.uin.sgd.service.framework;

import com.ac.uin.sgd.entity.PasswordResetToken;


public interface PasswordResetTokenService {
    PasswordResetToken findByToken(String token);

    PasswordResetToken save(PasswordResetToken passwordResetToken);
}
