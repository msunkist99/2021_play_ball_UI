package org.launchcode.play_ball_UI.models.dataTransferObjects;

public class RegisterFormDataTransferObject extends LoginFormDataTransferObject {

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
