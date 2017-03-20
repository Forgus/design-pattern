package com.forgus.experiment.command.email;

/**
 * @author Wenbin Chen
 */
public class User {
    private String name;
    private EmailBoxServer emailBoxServer;

    public User(String name) {
        this.name = name;
    }

    public EmailBoxServer getEmailBoxServer() {
        return emailBoxServer;
    }

    public void setEmailBoxServer(EmailBoxServer emailBoxServer) {
        this.emailBoxServer = emailBoxServer;
    }

    public User(EmailBoxServer emailBoxServer) {
        this.emailBoxServer = emailBoxServer;
    }

    public void sendEmailTo(User user,String message) {
        emailBoxServer.send(user,message);
    }

    public void receive(String message) {
        System.out.println(message);
    }
}
