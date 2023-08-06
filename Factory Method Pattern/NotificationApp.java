public class NotificationApp {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        // Membuat notifikasi email
        Notification emailNotification = factory.createNotification("email", "john@example.com", "Hello, this is an email notification.");
        emailNotification.send();

        // Membuat notifikasi SMS
        Notification smsNotification = factory.createNotification("sms", "+123456789", "Hello, this is an SMS notification.");
        smsNotification.send();
    }
}


Sending Email Notification to john@example.com: Hello, this is an email notification.
Sending SMS Notification to +123456789: Hello, this is an SMS notification.
