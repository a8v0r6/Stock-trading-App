package com.example.fix.initiator.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import quickfix.*;

@Service
@Slf4j
public class InitiatorService extends MessageCracker implements Application {
    @Override
    public void onCreate(SessionID sessionID) {
        log.info("Session created {}", sessionID);
    }

    @Override
    public void onLogon(SessionID sessionID) {
        log.info("Logon successful {}", sessionID);
    }

    @Override
    public void onLogout(SessionID sessionID) {
        log.info("Logout successful {}", sessionID);
    }

    @Override
    public void toAdmin(Message message, SessionID sessionID) {
        log.info("To admin {}", sessionID);
    }

    @Override
    public void fromAdmin(Message message, SessionID sessionID) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        log.info("From admin {}", sessionID);
    }

    @Override
    public void toApp(Message message, SessionID sessionID) throws DoNotSend {
        log.info("Sending Message {}", message);
    }

    @Override
    public void fromApp(Message message, SessionID sessionID) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        // dispatches incoming FIX msgs to appropriate handlers
        crack(message, sessionID);
    }
}
