public class Main {
    public static void main(String[] args) {
        // Crear un correo electrónico usando el patrón Builder
        Email email = new Email.Builder()
                .addTo("christianlopez@gmail.com")
                .addTo("cris321@gmail.com")
                .setSubject("Cena")
                .setBody("Mucho gusto, la cena será a las 8:00 pm, del dia de hoy")
                .addAttachment("agenda.pdf")
                .build();

        // Mostrar los detalles del correo
        System.out.println("Destinatarios: " + email.getTo());
        System.out.println("Asunto: " + email.getSubject());
        System.out.println("Cuerpo: " + email.getBody());
        System.out.println("Adjuntos: " + email.getAttachments());
    }
}
