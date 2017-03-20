package com.forgus.experiment.command.email;

/**
 * @author Wenbin Chen
 */
public class QQEmailBoxServer implements EmailBoxServer {

    private User user;

    public QQEmailBoxServer(User user) {
        this.user = user;
    }

    @Override
    public void send(User target,String message) {
        target.receive(message);
    }
}
