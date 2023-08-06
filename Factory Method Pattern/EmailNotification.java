public class EmailNotification implements Notification {
    private String recipient;
    private String content;

    public EmailNotification(String recipient, String content) {
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    public void send() {
        System.out.println("Sending Email Notification to " + recipient + ": " + content);
    }
}

public class SMSNotification implements Notification {
    private String phoneNumber;
    private String message;

    public SMSNotification(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS Notification to " + phoneNumber + ": " + message);
    }
}
