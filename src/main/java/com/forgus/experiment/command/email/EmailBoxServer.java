package com.forgus.experiment.command.email;

/**
 * @author Wenbin Chen
 */
public interface EmailBoxServer {

    void send(User target,String message);
}
