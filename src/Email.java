import java.util.ArrayList;
import java.util.List;

public class Email {
    private final List<String> to;
    private final String subject;
    private final String body;
    private final List<String> attachments;

    // Constructor privado
    private Email(Builder builder) {
        this.to = builder.to;
        this.subject = builder.subject;
        this.body = builder.body;
        this.attachments = builder.attachments;
    }

    // Getters para los campos
    public List<String> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    // Clase interna estática Builder
    public static class Builder {
        private List<String> to = new ArrayList<>();
        private String subject;
        private String body;
        private List<String> attachments = new ArrayList<>();

        // Método para agregar destinatario
        public Builder addTo(String recipient) {
            this.to.add(recipient);
            return this;
        }

        // Método para establecer el asunto
        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        // Método para establecer el cuerpo del correo
        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        // Método para agregar un adjunto
        public Builder addAttachment(String attachment) {
            this.attachments.add(attachment);
            return this;
        }

        // Método que construye el objeto Email
        public Email build() {
            if (to.isEmpty() || subject == null || body == null) {
                throw new IllegalStateException("El correo debe tener al menos un destinatario, asunto y cuerpo.");
            }
            return new Email(this);
        }
    }
}
