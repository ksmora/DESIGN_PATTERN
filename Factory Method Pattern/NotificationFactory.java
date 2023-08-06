public class NotificationFactory {
    public Notification createNotification(String type, String recipient, String content) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification(recipient, content);
        } else if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification(recipient, content);
        } else {
            throw new IllegalArgumentException("Invalid notification type: " + type);
        }
    }
}

